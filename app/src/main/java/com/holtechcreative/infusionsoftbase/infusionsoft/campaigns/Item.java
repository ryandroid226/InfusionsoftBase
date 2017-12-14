
package com.holtechcreative.infusionsoftbase.infusionsoft.campaigns;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("next_item_id")
    @Expose
    private Integer nextItemId;
    @SerializedName("previous_item_id")
    @Expose
    private Integer previousItemId;
    @SerializedName("type")
    @Expose
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNextItemId() {
        return nextItemId;
    }

    public void setNextItemId(Integer nextItemId) {
        this.nextItemId = nextItemId;
    }

    public Integer getPreviousItemId() {
        return previousItemId;
    }

    public void setPreviousItemId(Integer previousItemId) {
        this.previousItemId = previousItemId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
