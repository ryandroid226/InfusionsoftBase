package com.holtechcreative.infusionsoftbase.infusionsoft.tags;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ryan on 12/12/2017.
 */

public class TagWrapper {
    @SerializedName("tag")
    @Expose
    private Tag tag;
    @SerializedName("date_applied")
    @Expose
    private String dateApplied;

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public String getDateApplied() {
        return dateApplied;
    }

    public void setDateApplied(String dateApplied) {
        this.dateApplied = dateApplied;
    }
}
