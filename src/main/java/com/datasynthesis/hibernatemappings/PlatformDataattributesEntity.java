package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;
import java.util.Collection;

public class PlatformDataattributesEntity {
    private short platformDataAttributesId;
    private String dataAttributeName;
    private Short sensitivityFlagId;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private String platformDataAttributeGuid;
    private String registeredApp;
    private Collection<AuditingDatarequestdetailEntity> auditingDatarequestdetailsByPlatformDataAttributesId;
    private RefdataSensitivityflagEntity refdataSensitivityflagBySensitivityFlagId;
    private RefdataStatusEntity refdataStatusByStatusId;
    private Collection<PlatformDatastructurestodataattributesEntity> platformDatastructurestodataattributesByPlatformDataAttributesId;

    public short getPlatformDataAttributesId() {
        return platformDataAttributesId;
    }

    public void setPlatformDataAttributesId(short platformDataAttributesId) {
        this.platformDataAttributesId = platformDataAttributesId;
    }

    public String getDataAttributeName() {
        return dataAttributeName;
    }

    public void setDataAttributeName(String dataAttributeName) {
        this.dataAttributeName = dataAttributeName;
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

    public String getPlatformDataAttributeGuid() {
        return platformDataAttributeGuid;
    }

    public void setPlatformDataAttributeGuid(String platformDataAttributeGuid) {
        this.platformDataAttributeGuid = platformDataAttributeGuid;
    }

    public String getRegisteredApp() {
        return registeredApp;
    }

    public void setRegisteredApp(String registeredApp) {
        this.registeredApp = registeredApp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlatformDataattributesEntity that = (PlatformDataattributesEntity) o;

        if (platformDataAttributesId != that.platformDataAttributesId) return false;
        if (dataAttributeName != null ? !dataAttributeName.equals(that.dataAttributeName) : that.dataAttributeName != null)
            return false;
        if (sensitivityFlagId != null ? !sensitivityFlagId.equals(that.sensitivityFlagId) : that.sensitivityFlagId != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (platformDataAttributeGuid != null ? !platformDataAttributeGuid.equals(that.platformDataAttributeGuid) : that.platformDataAttributeGuid != null)
            return false;
        if (registeredApp != null ? !registeredApp.equals(that.registeredApp) : that.registeredApp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) platformDataAttributesId;
        result = 31 * result + (dataAttributeName != null ? dataAttributeName.hashCode() : 0);
        result = 31 * result + (sensitivityFlagId != null ? sensitivityFlagId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (platformDataAttributeGuid != null ? platformDataAttributeGuid.hashCode() : 0);
        result = 31 * result + (registeredApp != null ? registeredApp.hashCode() : 0);
        return result;
    }

    public Collection<AuditingDatarequestdetailEntity> getAuditingDatarequestdetailsByPlatformDataAttributesId() {
        return auditingDatarequestdetailsByPlatformDataAttributesId;
    }

    public void setAuditingDatarequestdetailsByPlatformDataAttributesId(Collection<AuditingDatarequestdetailEntity> auditingDatarequestdetailsByPlatformDataAttributesId) {
        this.auditingDatarequestdetailsByPlatformDataAttributesId = auditingDatarequestdetailsByPlatformDataAttributesId;
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

    public Collection<PlatformDatastructurestodataattributesEntity> getPlatformDatastructurestodataattributesByPlatformDataAttributesId() {
        return platformDatastructurestodataattributesByPlatformDataAttributesId;
    }

    public void setPlatformDatastructurestodataattributesByPlatformDataAttributesId(Collection<PlatformDatastructurestodataattributesEntity> platformDatastructurestodataattributesByPlatformDataAttributesId) {
        this.platformDatastructurestodataattributesByPlatformDataAttributesId = platformDatastructurestodataattributesByPlatformDataAttributesId;
    }
}
