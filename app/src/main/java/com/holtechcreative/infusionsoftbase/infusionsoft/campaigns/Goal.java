
package com.holtechcreative.infusionsoftbase.infusionsoft.campaigns;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Goal {

    @SerializedName("historical_contact_counts")
    @Expose
    private HistoricalContactCounts historicalContactCounts;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("next_sequence_ids")
    @Expose
    private List<Integer> nextSequenceIds = null;
    @SerializedName("previous_sequence_ids")
    @Expose
    private List<Integer> previousSequenceIds = null;
    @SerializedName("type")
    @Expose
    private String type;

    public HistoricalContactCounts getHistoricalContactCounts() {
        return historicalContactCounts;
    }

    public void setHistoricalContactCounts(HistoricalContactCounts historicalContactCounts) {
        this.historicalContactCounts = historicalContactCounts;
    }

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

    public List<Integer> getNextSequenceIds() {
        return nextSequenceIds;
    }

    public void setNextSequenceIds(List<Integer> nextSequenceIds) {
        this.nextSequenceIds = nextSequenceIds;
    }

    public List<Integer> getPreviousSequenceIds() {
        return previousSequenceIds;
    }

    public void setPreviousSequenceIds(List<Integer> previousSequenceIds) {
        this.previousSequenceIds = previousSequenceIds;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
