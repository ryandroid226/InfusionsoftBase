package com.holtechcreative.infusionsoftbase.api;

import com.holtechcreative.infusionsoftbase.api.objects.AccessToken;
import com.holtechcreative.infusionsoftbase.infusionsoft.campaigns.Campaigns;
import com.holtechcreative.infusionsoftbase.infusionsoft.contacts.ContactsList;
import com.holtechcreative.infusionsoftbase.infusionsoft.tags.Tags;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIClient {

    @FormUrlEncoded
    @POST("/token")
    Call<AccessToken> getNewAccessToken(
            @Field("code") String code,
            @Field("client_id") String clientId,
            @Field("client_secret") String clientSecret,
            @Field("redirect_uri") String redirectUri,
            @Field("grant_type") String grantType);

    @FormUrlEncoded
    @POST("/token")
    Call<AccessToken> getRefreshAccessToken(
            @Field("refresh_token") String refreshToken,
            @Field("grant_type") String grantType);

    @GET("contacts/")
    Call<ContactsList> getContact();

    @GET("contacts/")
    Call<ContactsList> getContactByEmail(@Query("email") String email);

    @GET("contacts/{id}/tags")
    Call<Tags> getContactTagsById(@Path("id") String id);

    @GET("campaigns/")
    Call<Campaigns> getCampaigns();

}
