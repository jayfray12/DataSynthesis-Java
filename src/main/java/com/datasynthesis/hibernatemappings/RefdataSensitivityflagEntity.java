package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;
import java.util.Collection;

public class RefdataSensitivityflagEntity {
    private short sensitiveFlagId;
    private String sensitiveFlagDesc;
    private Timestamp createdDate;
    private Short statusId;
    private Collection<PlatformDataattributesEntity> platformDataattributesBySensitiveFlagId;
    private Collection<PlatformDatastructurestodataattributesEntity> platformDatastructurestodataattributesBySensitiveFlagId;

    public short getSensitiveFlagId() {
        return sensitiveFlagId;
    }

    public void setSensitiveFlagId(short sensitiveFlagId) {
        this.sensitiveFlagId = sensitiveFlagId;
    }

    public String getSensitiveFlagDesc() {
        return sensitiveFlagDesc;
    }

    public void setSensitiveFlagDesc(String sensitiveFlagDesc) {
        this.sensitiveFlagDesc = sensitiveFlagDesc;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefdataSensitivityflagEntity that = (RefdataSensitivityflagEntity) o;

        if (sensitiveFlagId != that.sensitiveFlagId) return false;
        if (sensitiveFlagDesc != null ? !sensitiveFlagDesc.equals(that.sensitiveFlagDesc) : that.sensitiveFlagDesc != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) sensitiveFlagId;
        result = 31 * result + (sensitiveFlagDesc != null ? sensitiveFlagDesc.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        return result;
    }

    public Collection<PlatformDataattributesEntity> getPlatformDataattributesBySensitiveFlagId() {
        return platformDataattributesBySensitiveFlagId;
    }

    public void setPlatformDataattributesBySensitiveFlagId(Collection<PlatformDataattributesEntity> platformDataattributesBySensitiveFlagId) {
        this.platformDataattributesBySensitiveFlagId = platformDataattributesBySensitiveFlagId;
    }

    public Collection<PlatformDatastructurestodataattributesEntity> getPlatformDatastructurestodataattributesBySensitiveFlagId() {
        return platformDatastructurestodataattributesBySensitiveFlagId;
    }

    public void setPlatformDatastructurestodataattributesBySensitiveFlagId(Collection<PlatformDatastructurestodataattributesEntity> platformDatastructurestodataattributesBySensitiveFlagId) {
        this.platformDatastructurestodataattributesBySensitiveFlagId = platformDatastructurestodataattributesBySensitiveFlagId;
    }
}
