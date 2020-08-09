package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;
import java.util.Collection;

public class RefdataApplicationEntity {
    private long applicationId;
    private String applicationCustomCode;
    private String applicationDesc;
    private String createdUser;
    private Timestamp createdDate;
    private Short statusId;
    private String appGuid;
    private Integer vendorId;
    private RefdataStatusEntity refdataStatusByStatusId;
    private RefdataVendorEntity refdataVendorByVendorId;
    private Collection<RefdataCodesetvaluesEntity> refdataCodesetvaluesByApplicationId;

    public long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(long applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationCustomCode() {
        return applicationCustomCode;
    }

    public void setApplicationCustomCode(String applicationCustomCode) {
        this.applicationCustomCode = applicationCustomCode;
    }

    public String getApplicationDesc() {
        return applicationDesc;
    }

    public void setApplicationDesc(String applicationDesc) {
        this.applicationDesc = applicationDesc;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
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

    public String getAppGuid() {
        return appGuid;
    }

    public void setAppGuid(String appGuid) {
        this.appGuid = appGuid;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefdataApplicationEntity that = (RefdataApplicationEntity) o;

        if (applicationId != that.applicationId) return false;
        if (applicationCustomCode != null ? !applicationCustomCode.equals(that.applicationCustomCode) : that.applicationCustomCode != null)
            return false;
        if (applicationDesc != null ? !applicationDesc.equals(that.applicationDesc) : that.applicationDesc != null)
            return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (appGuid != null ? !appGuid.equals(that.appGuid) : that.appGuid != null) return false;
        if (vendorId != null ? !vendorId.equals(that.vendorId) : that.vendorId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (applicationId ^ (applicationId >>> 32));
        result = 31 * result + (applicationCustomCode != null ? applicationCustomCode.hashCode() : 0);
        result = 31 * result + (applicationDesc != null ? applicationDesc.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (appGuid != null ? appGuid.hashCode() : 0);
        result = 31 * result + (vendorId != null ? vendorId.hashCode() : 0);
        return result;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }

    public RefdataVendorEntity getRefdataVendorByVendorId() {
        return refdataVendorByVendorId;
    }

    public void setRefdataVendorByVendorId(RefdataVendorEntity refdataVendorByVendorId) {
        this.refdataVendorByVendorId = refdataVendorByVendorId;
    }

    public Collection<RefdataCodesetvaluesEntity> getRefdataCodesetvaluesByApplicationId() {
        return refdataCodesetvaluesByApplicationId;
    }

    public void setRefdataCodesetvaluesByApplicationId(Collection<RefdataCodesetvaluesEntity> refdataCodesetvaluesByApplicationId) {
        this.refdataCodesetvaluesByApplicationId = refdataCodesetvaluesByApplicationId;
    }
}
