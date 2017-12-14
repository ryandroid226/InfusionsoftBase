
package com.holtechcreative.infusionsoftbase.infusionsoft.tags;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Tags {

    @SerializedName("tags")
    @Expose
    private ArrayList<TagWrapper> tagWrappers = new ArrayList<>();
    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("next")
    @Expose
    private String next;
    @SerializedName("previous")
    @Expose
    private String previous;

    public ArrayList<TagWrapper> getTagWrappers() {
        return tagWrappers;
    }

    public void setTagWrappers(ArrayList<TagWrapper> tagWrappers) {
        this.tagWrappers = tagWrappers;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

}
