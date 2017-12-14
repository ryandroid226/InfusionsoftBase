package com.holtechcreative.infusionsoftbase;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.holtechcreative.infusionsoftbase.api.APIClient;
import com.holtechcreative.infusionsoftbase.api.ServiceGenerator;
import com.holtechcreative.infusionsoftbase.api.objects.AccessToken;
import com.holtechcreative.infusionsoftbase.infusionsoft.contacts.Contact;
import com.holtechcreative.infusionsoftbase.infusionsoft.contacts.ContactsList;
import com.holtechcreative.infusionsoftbase.infusionsoft.contacts.EmailAddress;
import com.holtechcreative.infusionsoftbase.infusionsoft.tags.Tag;
import com.holtechcreative.infusionsoftbase.infusionsoft.tags.TagWrapper;
import com.holtechcreative.infusionsoftbase.infusionsoft.tags.Tags;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button getContactBtn, getContactByIdBtn;
    TextView tv, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        tv = findViewById(R.id.tv);
        tv2 = findViewById(R.id.tv2);
        getContactBtn = findViewById(R.id.getContactBtn);
        getContactByIdBtn = findViewById(R.id.getContactByIdBtn);

        final SharedPreferences prefs = getApplicationContext().getSharedPreferences(
                BuildConfig.APPLICATION_ID, Context.MODE_PRIVATE);

        final String accessToken = prefs.getString("oauth.accesstoken", "");
        final String tokenType = prefs.getString("oauth.tokentype", "");
        final String refreshToken = prefs.getString("oauth.refreshtoken", "");

        getContactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                if(!accessToken.isEmpty() && !tokenType.isEmpty() && !refreshToken.isEmpty()) {

                    AccessToken tempToken = new AccessToken();
                    tempToken.setAccessToken(accessToken);
                    tempToken.setTokenType(tokenType);
                    tempToken.setRefreshToken(refreshToken);

                    APIClient client = ServiceGenerator.createService(APIClient.class, tempToken, getApplicationContext());
                    String testEmail = "rholt.guw@gmail.com";
                    Call<ContactsList> call = client.getContactByEmail(testEmail);
                    //Call<ContactsList> call = client.getContact();
                    call.enqueue(new Callback<ContactsList>() {
                        @Override
                        public void onResponse(Call<ContactsList> call, Response<ContactsList> response) {
                            int statusCode = response.code();
                            if (statusCode == 200) {

                                ContactsList tempConList = response.body();
                                ArrayList<Contact> tempCons = tempConList.getContacts();
                                Contact conZero = tempCons.get(0);
                                String lName = conZero.getFamilyName();
                                String bDay = conZero.getBirthday();
                                List<EmailAddress> eMails = conZero.getEmailAddresses();
                                Log.d( "Last Name", lName);
                                tv2.setText(lName);
                                if(bDay != null && !bDay.isEmpty()){
                                    Log.d("Birthday", bDay);

                                }

                                if(eMails != null && !eMails.isEmpty()){
                                    for(EmailAddress eMail : eMails){
                                        Log.d("Email Address", eMail.getEmail());
                                    }
                                }

                                // TODO Show the user they are logged in
                            } else {
                                // TODO Handle errors on a failed response
                                Log.d("Status", String.valueOf(statusCode));
                            }
                        }

                        @Override
                        public void onFailure(Call<ContactsList> call, Throwable t) {
                            // TODO Handle failure
                        }
                    });

                }
            }
        });

        getContactByIdBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(!accessToken.isEmpty() && !tokenType.isEmpty() && !refreshToken.isEmpty()) {

                    AccessToken tempToken = new AccessToken();
                    tempToken.setAccessToken(accessToken);
                    tempToken.setTokenType(tokenType);
                    tempToken.setRefreshToken(refreshToken);

                    APIClient client = ServiceGenerator.createService(APIClient.class, tempToken, getApplicationContext());
                    int conId = 2;
                    Call<Tags> call = client.getContactTagsById(String.valueOf(conId));
                    call.enqueue(new Callback<Tags>() {
                        @Override
                        public void onResponse(Call<Tags> call, Response<Tags> response) {
                            int statusCode = response.code();
                            if(statusCode == 200){
                                Tags tags = response.body();
                                //Log.d("Tags Count", String.valueOf(tags.getCount()));
                                ArrayList<TagWrapper> tagWrapperList = tags.getTagWrappers();
                                if(tagWrapperList != null && !tagWrapperList.isEmpty()){
                                    for(int i =0; i < tagWrapperList.size(); i++){
                                        TagWrapper currentTagWrapper = tagWrapperList.get(i);
                                        Tag firstTag = currentTagWrapper.getTag();
                                        String firstTagName = firstTag.getName();
                                        if (firstTagName != null && !firstTagName.isEmpty()) {
                                            Log.d("Tag Name", firstTagName);
                                            tv.setText(firstTagName + ",");
                                        }
                                    }
                                }
                            } else if(statusCode == 403){

                            }
                        }

                        @Override
                        public void onFailure(Call<Tags> call, Throwable t) {

                        }
                    });
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent i = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
