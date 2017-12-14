
package com.holtechcreative.infusionsoftbase.infusionsoft.contacts;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("addresses")
    @Expose
    private List<Address> addresses = null;
    @SerializedName("birthday")
    @Expose
    private String birthday;
    @SerializedName("company")
    @Expose
    private Company company;
    @SerializedName("contact_type")
    @Expose
    private String contactType;
    @SerializedName("custom_fields")
    @Expose
    private List<CustomField> customFields = null;
    @SerializedName("date_created")
    @Expose
    private String dateCreated;
    @SerializedName("email_addresses")
    @Expose
    private List<EmailAddress> emailAddresses = null;
    @SerializedName("family_name")
    @Expose
    private String familyName;
    @SerializedName("fax_numbers")
    @Expose
    private List<FaxNumber> faxNumbers = null;
    @SerializedName("given_name")
    @Expose
    private String givenName;
    @SerializedName("job_title")
    @Expose
    private String jobTitle;
    @SerializedName("last_updated")
    @Expose
    private String lastUpdated;
    @SerializedName("lead_source_id")
    @Expose
    private Integer leadSourceId;
    @SerializedName("middle_name")
    @Expose
    private String middleName;
    @SerializedName("notes")
    @Expose
    private String notes;
    @SerializedName("opt_in_reason")
    @Expose
    private String optInReason;
    @SerializedName("owner_id")
    @Expose
    private Integer ownerId;
    @SerializedName("phone_numbers")
    @Expose
    private List<PhoneNumber> phoneNumbers = null;
    @SerializedName("preferred_locale")
    @Expose
    private String preferredLocale;
    @SerializedName("preferred_name")
    @Expose
    private String preferredName;
    @SerializedName("prefix")
    @Expose
    private String prefix;
    @SerializedName("relationships")
    @Expose
    private List<Relationship> relationships = null;
    @SerializedName("source_type")
    @Expose
    private String sourceType;
    @SerializedName("suffix")
    @Expose
    private String suffix;
    @SerializedName("tag_ids")
    @Expose
    private List<Integer> tagIds = null;
    @SerializedName("time_zone")
    @Expose
    private String timeZone;
    @SerializedName("website")
    @Expose
    private String website;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public List<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(List<EmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public List<FaxNumber> getFaxNumbers() {
        return faxNumbers;
    }

    public void setFaxNumbers(List<FaxNumber> faxNumbers) {
        this.faxNumbers = faxNumbers;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Integer getLeadSourceId() {
        return leadSourceId;
    }

    public void setLeadSourceId(Integer leadSourceId) {
        this.leadSourceId = leadSourceId;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOptInReason() {
        return optInReason;
    }

    public void setOptInReason(String optInReason) {
        this.optInReason = optInReason;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getPreferredLocale() {
        return preferredLocale;
    }

    public void setPreferredLocale(String preferredLocale) {
        this.preferredLocale = preferredLocale;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public List<Relationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<Relationship> relationships) {
        this.relationships = relationships;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public List<Integer> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

}
