package com.redhat.idaas.datasynthesis.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "platform_datastructurestodataattributes", schema = "datasynthesis", catalog = "")
public class PlatformDatastructurestodataattributesEntity extends io.quarkus.hibernate.orm.panache.PanacheEntityBase {
    private short platformDataStructuresToDataAttributesId;
    private String compositeDataStructureName;
    private Timestamp createdDate;
    private String createdUser;
    private String platformDataStructuresToDataAttributesGuid;

    @Id
    @Column(name = "PlatformDataStructuresToDataAttributesID", nullable = false)
    public short getPlatformDataStructuresToDataAttributesId() {
        return platformDataStructuresToDataAttributesId;
    }

    public void setPlatformDataStructuresToDataAttributesId(short platformDataStructuresToDataAttributesId) {
        this.platformDataStructuresToDataAttributesId = platformDataStructuresToDataAttributesId;
    }

    @Basic
    @Column(name = "CompositeDataStructureName", nullable = true, length = 50)
    public String getCompositeDataStructureName() {
        return compositeDataStructureName;
    }

    public void setCompositeDataStructureName(String compositeDataStructureName) {
        this.compositeDataStructureName = compositeDataStructureName;
    }

    @Basic
    @Column(name = "CreatedDate", nullable = true)
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "CreatedUser", nullable = true, length = 20)
    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    @Basic
    @Column(name = "PlatformDataStructuresToDataAttributesGUID", nullable = true, length = 38)
    public String getPlatformDataStructuresToDataAttributesGuid() {
        return platformDataStructuresToDataAttributesGuid;
    }

    public void setPlatformDataStructuresToDataAttributesGuid(String platformDataStructuresToDataAttributesGuid) {
        this.platformDataStructuresToDataAttributesGuid = platformDataStructuresToDataAttributesGuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlatformDatastructurestodataattributesEntity that = (PlatformDatastructurestodataattributesEntity) o;

        if (platformDataStructuresToDataAttributesId != that.platformDataStructuresToDataAttributesId) return false;
        if (compositeDataStructureName != null ? !compositeDataStructureName.equals(that.compositeDataStructureName) : that.compositeDataStructureName != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (platformDataStructuresToDataAttributesGuid != null ? !platformDataStructuresToDataAttributesGuid.equals(that.platformDataStructuresToDataAttributesGuid) : that.platformDataStructuresToDataAttributesGuid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) platformDataStructuresToDataAttributesId;
        result = 31 * result + (compositeDataStructureName != null ? compositeDataStructureName.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (platformDataStructuresToDataAttributesGuid != null ? platformDataStructuresToDataAttributesGuid.hashCode() : 0);
        return result;
    }
}
