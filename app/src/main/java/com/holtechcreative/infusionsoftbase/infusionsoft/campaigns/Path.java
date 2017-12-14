
package com.holtechcreative.infusionsoftbase.infusionsoft.campaigns;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Path {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
