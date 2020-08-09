package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;
import java.util.Collection;

public class PlatformDatastructuresEntity {
    private short platformDataStructuresId;
    private String dataStructureName;
    private Short sensitivityFlagId;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private String platformDataStructuresGuid;
    private String registeredApp;
    private RefdataStatusEntity refdataStatusByStatusId;
    private Collection<PlatformDatastructurestodataattributesEntity> platformDatastructurestodataattributesByPlatformDataStructuresId;

    public short getPlatformDataStructuresId() {
        return platformDataStructuresId;
    }

    public void setPlatformDataStructuresId(short platformDataStructuresId) {
        this.platformDataStructuresId = platformDataStructuresId;
    }

    public String getDataStructureName() {
        return dataStructureName;
    }

    public void setDataStructureName(String dataStructureName) {
        this.dataStructureName = dataStructureName;
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

    public String getPlatformDataStructuresGuid() {
        return platformDataStructuresGuid;
    }

    public void setPlatformDataStructuresGuid(String platformDataStructuresGuid) {
        this.platformDataStructuresGuid = platformDataStructuresGuid;
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

        PlatformDatastructuresEntity that = (PlatformDatastructuresEntity) o;

        if (platformDataStructuresId != that.platformDataStructuresId) return false;
        if (dataStructureName != null ? !dataStructureName.equals(that.dataStructureName) : that.dataStructureName != null)
            return false;
        if (sensitivityFlagId != null ? !sensitivityFlagId.equals(that.sensitivityFlagId) : that.sensitivityFlagId != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (platformDataStructuresGuid != null ? !platformDataStructuresGuid.equals(that.platformDataStructuresGuid) : that.platformDataStructuresGuid != null)
            return false;
        if (registeredApp != null ? !registeredApp.equals(that.registeredApp) : that.registeredApp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) platformDataStructuresId;
        result = 31 * result + (dataStructureName != null ? dataStructureName.hashCode() : 0);
        result = 31 * result + (sensitivityFlagId != null ? sensitivityFlagId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (platformDataStructuresGuid != null ? platformDataStructuresGuid.hashCode() : 0);
        result = 31 * result + (registeredApp != null ? registeredApp.hashCode() : 0);
        return result;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }

    public Collection<PlatformDatastructurestodataattributesEntity> getPlatformDatastructurestodataattributesByPlatformDataStructuresId() {
        return platformDatastructurestodataattributesByPlatformDataStructuresId;
    }

    public void setPlatformDatastructurestodataattributesByPlatformDataStructuresId(Collection<PlatformDatastructurestodataattributesEntity> platformDatastructurestodataattributesByPlatformDataStructuresId) {
        this.platformDatastructurestodataattributesByPlatformDataStructuresId = platformDatastructurestodataattributesByPlatformDataStructuresId;
    }
}
