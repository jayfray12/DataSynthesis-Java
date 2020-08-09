package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class PlatformDatastructurestodataattributesEntity {
    private short platformDataStructuresToDataAttributesId;
    private Short platformDataStructuresId;
    private String compositeDataStructureName;
    private Short sensitivityFlagId;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private String platformDataStructuresToDataAttributesGuid;
    private String registeredApp;
    private Short platformDataAttributesId;
    private PlatformDatastructuresEntity platformDatastructuresByPlatformDataStructuresId;
    private RefdataSensitivityflagEntity refdataSensitivityflagBySensitivityFlagId;
    private RefdataStatusEntity refdataStatusByStatusId;
    private PlatformDataattributesEntity platformDataattributesByPlatformDataAttributesId;

    public short getPlatformDataStructuresToDataAttributesId() {
        return platformDataStructuresToDataAttributesId;
    }

    public void setPlatformDataStructuresToDataAttributesId(short platformDataStructuresToDataAttributesId) {
        this.platformDataStructuresToDataAttributesId = platformDataStructuresToDataAttributesId;
    }

    public Short getPlatformDataStructuresId() {
        return platformDataStructuresId;
    }

    public void setPlatformDataStructuresId(Short platformDataStructuresId) {
        this.platformDataStructuresId = platformDataStructuresId;
    }

    public String getCompositeDataStructureName() {
        return compositeDataStructureName;
    }

    public void setCompositeDataStructureName(String compositeDataStructureName) {
        this.compositeDataStructureName = compositeDataStructureName;
    }

    public Short getSensitivityFlagId() {
        return sensitivityFlagId;
    }

    public void setSensitivityFlagId(Short sensitivityFlagId) {
        this.sensitivityFlagId = sensitivityFlagId;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Short getStatusId() {
        return statusId;
    }

    public void setStatusId(Short statusId) {
        this.statusId = statusId;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public String getPlatformDataStructuresToDataAttributesGuid() {
        return platformDataStructuresToDataAttributesGuid;
    }

    public void setPlatformDataStructuresToDataAttributesGuid(String platformDataStructuresToDataAttributesGuid) {
        this.platformDataStructuresToDataAttributesGuid = platformDataStructuresToDataAttributesGuid;
    }

    public String getRegisteredApp() {
        return registeredApp;
    }

    public void setRegisteredApp(String registeredApp) {
        this.registeredApp = registeredApp;
    }

    public Short getPlatformDataAttributesId() {
        return platformDataAttributesId;
    }

    public void setPlatformDataAttributesId(Short platformDataAttributesId) {
        this.platformDataAttributesId = platformDataAttributesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlatformDatastructurestodataattributesEntity that = (PlatformDatastructurestodataattributesEntity) o;

        if (platformDataStructuresToDataAttributesId != that.platformDataStructuresToDataAttributesId) return false;
        if (platformDataStructuresId != null ? !platformDataStructuresId.equals(that.platformDataStructuresId) : that.platformDataStructuresId != null)
            return false;
        if (compositeDataStructureName != null ? !compositeDataStructureName.equals(that.compositeDataStructureName) : that.compositeDataStructureName != null)
            return false;
        if (sensitivityFlagId != null ? !sensitivityFlagId.equals(that.sensitivityFlagId) : that.sensitivityFlagId != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (platformDataStructuresToDataAttributesGuid != null ? !platformDataStructuresToDataAttributesGuid.equals(that.platformDataStructuresToDataAttributesGuid) : that.platformDataStructuresToDataAttributesGuid != null)
            return false;
        if (registeredApp != null ? !registeredApp.equals(that.registeredApp) : that.registeredApp != null)
            return false;
        if (platformDataAttributesId != null ? !platformDataAttributesId.equals(that.platformDataAttributesId) : that.platformDataAttributesId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) platformDataStructuresToDataAttributesId;
        result = 31 * result + (platformDataStructuresId != null ? platformDataStructuresId.hashCode() : 0);
        result = 31 * result + (compositeDataStructureName != null ? compositeDataStructureName.hashCode() : 0);
        result = 31 * result + (sensitivityFlagId != null ? sensitivityFlagId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (platformDataStructuresToDataAttributesGuid != null ? platformDataStructuresToDataAttributesGuid.hashCode() : 0);
        result = 31 * result + (registeredApp != null ? registeredApp.hashCode() : 0);
        result = 31 * result + (platformDataAttributesId != null ? platformDataAttributesId.hashCode() : 0);
        return result;
    }

    public PlatformDatastructuresEntity getPlatformDatastructuresByPlatformDataStructuresId() {
        return platformDatastructuresByPlatformDataStructuresId;
    }

    public void setPlatformDatastructuresByPlatformDataStructuresId(PlatformDatastructuresEntity platformDatastructuresByPlatformDataStructuresId) {
        this.platformDatastructuresByPlatformDataStructuresId = platformDatastructuresByPlatformDataStructuresId;
    }

    public RefdataSensitivityflagEntity getRefdataSensitivityflagBySensitivityFlagId() {
        return refdataSensitivityflagBySensitivityFlagId;
    }

    public void setRefdataSensitivityflagBySensitivityFlagId(RefdataSensitivityflagEntity refdataSensitivityflagBySensitivityFlagId) {
        this.refdataSensitivityflagBySensitivityFlagId = refdataSensitivityflagBySensitivityFlagId;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }

    public PlatformDataattributesEntity getPlatformDataattributesByPlatformDataAttributesId() {
        return platformDataattributesByPlatformDataAttributesId;
    }

    public void setPlatformDataattributesByPlatformDataAttributesId(PlatformDataattributesEntity platformDataattributesByPlatformDataAttributesId) {
        this.platformDataattributesByPlatformDataAttributesId = platformDataattributesByPlatformDataAttributesId;
    }
}
