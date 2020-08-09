package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class MapHcinterfacedatamapdetailtovendordatamodelEntity {
    private long hcInterfaceDataMapToVendorDataMappingDetailId;
    private Long hcInterfaceDataMapDetailId;
    private Long vendorDataMappingDetailId;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private RefdataStatusEntity refdataStatusByStatusId;

    public long getHcInterfaceDataMapToVendorDataMappingDetailId() {
        return hcInterfaceDataMapToVendorDataMappingDetailId;
    }

    public void setHcInterfaceDataMapToVendorDataMappingDetailId(long hcInterfaceDataMapToVendorDataMappingDetailId) {
        this.hcInterfaceDataMapToVendorDataMappingDetailId = hcInterfaceDataMapToVendorDataMappingDetailId;
    }

    public Long getHcInterfaceDataMapDetailId() {
        return hcInterfaceDataMapDetailId;
    }

    public void setHcInterfaceDataMapDetailId(Long hcInterfaceDataMapDetailId) {
        this.hcInterfaceDataMapDetailId = hcInterfaceDataMapDetailId;
    }

    public Long getVendorDataMappingDetailId() {
        return vendorDataMappingDetailId;
    }

    public void setVendorDataMappingDetailId(Long vendorDataMappingDetailId) {
        this.vendorDataMappingDetailId = vendorDataMappingDetailId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapHcinterfacedatamapdetailtovendordatamodelEntity that = (MapHcinterfacedatamapdetailtovendordatamodelEntity) o;

        if (hcInterfaceDataMapToVendorDataMappingDetailId != that.hcInterfaceDataMapToVendorDataMappingDetailId)
            return false;
        if (hcInterfaceDataMapDetailId != null ? !hcInterfaceDataMapDetailId.equals(that.hcInterfaceDataMapDetailId) : that.hcInterfaceDataMapDetailId != null)
            return false;
        if (vendorDataMappingDetailId != null ? !vendorDataMappingDetailId.equals(that.vendorDataMappingDetailId) : that.vendorDataMappingDetailId != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (hcInterfaceDataMapToVendorDataMappingDetailId ^ (hcInterfaceDataMapToVendorDataMappingDetailId >>> 32));
        result = 31 * result + (hcInterfaceDataMapDetailId != null ? hcInterfaceDataMapDetailId.hashCode() : 0);
        result = 31 * result + (vendorDataMappingDetailId != null ? vendorDataMappingDetailId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        return result;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}