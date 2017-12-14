
package com.holtechcreative.infusionsoftbase.infusionsoft.campaigns;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Campaign {

    @SerializedName("active_contact_count")
    @Expose
    private Integer activeContactCount;
    @SerializedName("completed_contact_count")
    @Expose
    private Integer completedContactCount;
    @SerializedName("created_by_global_id")
    @Expose
    private Integer createdByGlobalId;
    @SerializedName("date_created")
    @Expose
    private String dateCreated;
    @SerializedName("error_message")
    @Expose
    private String errorMessage;
    @SerializedName("goals")
    @Expose
    private List<Goal> goals = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("locked")
    @Expose
    private Boolean locked;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("published_date")
    @Expose
    private String publishedDate;
    @SerializedName("published_status")
    @Expose
    private Boolean publishedStatus;
    @SerializedName("published_time_zone")
    @Expose
    private String publishedTimeZone;
    @SerializedName("sequences")
    @Expose
    private List<Sequence> sequences = null;
    @SerializedName("time_zone")
    @Expose
    private String timeZone;

    public Integer getActiveContactCount() {
        return activeContactCount;
    }

    public void setActiveContactCount(Integer activeContactCount) {
        this.activeContactCount = activeContactCount;
    }

    public Integer getCompletedContactCount() {
        return completedContactCount;
    }

    public void setCompletedContactCount(Integer completedContactCount) {
        this.completedContactCount = completedContactCount;
    }

    public Integer getCreatedByGlobalId() {
        return createdByGlobalId;
    }

    public void setCreatedByGlobalId(Integer createdByGlobalId) {
        this.createdByGlobalId = createdByGlobalId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<Goal> getGoals() {
        return goals;
    }

    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Boolean getPublishedStatus() {
        return publishedStatus;
    }

    public void setPublishedStatus(Boolean publishedStatus) {
        this.publishedStatus = publishedStatus;
    }

    public String getPublishedTimeZone() {
        return publishedTimeZone;
    }

    public void setPublishedTimeZone(String publishedTimeZone) {
        this.publishedTimeZone = publishedTimeZone;
    }

    public List<Sequence> getSequences() {
        return sequences;
    }

    public void setSequences(List<Sequence> sequences) {
        this.sequences = sequences;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

}
