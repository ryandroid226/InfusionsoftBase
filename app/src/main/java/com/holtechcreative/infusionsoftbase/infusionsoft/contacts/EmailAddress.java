
package com.holtechcreative.infusionsoftbase.infusionsoft.contacts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmailAddress {

    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("field")
    @Expose
    private String field;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

}
