
package com.holtechcreative.infusionsoftbase.infusionsoft.campaigns;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sequence {

    @SerializedName("active_contact_count")
    @Expose
    private Integer activeContactCount;
    @SerializedName("active_contact_count_completed")
    @Expose
    private Integer activeContactCountCompleted;
    @SerializedName("historical_contact_count")
    @Expose
    private HistoricalContactCount historicalContactCount;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("paths")
    @Expose
    private List<Path> paths = null;

    public Integer getActiveContactCount() {
        return activeContactCount;
    }

    public void setActiveContactCount(Integer activeContactCount) {
        this.activeContactCount = activeContactCount;
    }

    public Integer getActiveContactCountCompleted() {
        return activeContactCountCompleted;
    }

    public void setActiveContactCountCompleted(Integer activeContactCountCompleted) {
        this.activeContactCountCompleted = activeContactCountCompleted;
    }

    public HistoricalContactCount getHistoricalContactCount() {
        return historicalContactCount;
    }

    public void setHistoricalContactCount(HistoricalContactCount historicalContactCount) {
        this.historicalContactCount = historicalContactCount;
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

    public List<Path> getPaths() {
        return paths;
    }

    public void setPaths(List<Path> paths) {
        this.paths = paths;
    }

}
