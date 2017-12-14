
package com.holtechcreative.infusionsoftbase.infusionsoft.contacts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Company {

    @SerializedName("company_name")
    @Expose
    private String companyName;
    @SerializedName("id")
    @Expose
    private Integer id;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
