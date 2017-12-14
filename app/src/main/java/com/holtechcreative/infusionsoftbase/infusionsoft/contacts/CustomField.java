
package com.holtechcreative.infusionsoftbase.infusionsoft.contacts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomField {

    @SerializedName("content")
    @Expose
    private Content content;
    @SerializedName("id")
    @Expose
    private Integer id;

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
