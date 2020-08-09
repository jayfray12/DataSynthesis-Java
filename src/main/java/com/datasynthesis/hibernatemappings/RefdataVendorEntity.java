package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;
import java.util.Collection;

public class RefdataVendorEntity {
    private int vendorId;
    private String vendorName;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private String vendorGuid;
    private Collection<RefdataApplicationEntity> refdataApplicationsByVendorId;
    private RefdataStatusEntity refdataStatusByStatusId;

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
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

    public String getVendorGuid() {
        return vendorGuid;
    }

    public void setVendorGuid(String vendorGuid) {
        this.vendorGuid = vendorGuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefdataVendorEntity that = (RefdataVendorEntity) o;

        if (vendorId != that.vendorId) return false;
        if (vendorName != null ? !vendorName.equals(that.vendorName) : that.vendorName != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (vendorGuid != null ? !vendorGuid.equals(that.vendorGuid) : that.vendorGuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vendorId;
        result = 31 * result + (vendorName != null ? vendorName.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (vendorGuid != null ? vendorGuid.hashCode() : 0);
        return result;
    }

    public Collection<RefdataApplicationEntity> getRefdataApplicationsByVendorId() {
        return refdataApplicationsByVendorId;
    }

    public void setRefdataApplicationsByVendorId(Collection<RefdataApplicationEntity> refdataApplicationsByVendorId) {
        this.refdataApplicationsByVendorId = refdataApplicationsByVendorId;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
