
package com.holtechcreative.infusionsoftbase.infusionsoft.contacts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Relationship {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("linked_contact_id")
    @Expose
    private Integer linkedContactId;
    @SerializedName("relationship_type_id")
    @Expose
    private Integer relationshipTypeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLinkedContactId() {
        return linkedContactId;
    }

    public void setLinkedContactId(Integer linkedContactId) {
        this.linkedContactId = linkedContactId;
    }

    public Integer getRelationshipTypeId() {
        return relationshipTypeId;
    }

    public void setRelationshipTypeId(Integer relationshipTypeId) {
        this.relationshipTypeId = relationshipTypeId;
    }

}
