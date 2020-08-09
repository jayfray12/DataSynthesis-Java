package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class MapVendordatamappingdetailtodataattributesEntity {
    private long vendorDataMappingDetailToDataAttributesId;
    private Long vendorDataMappingDetailId;
    private Short dataAttributesId;
    private Short statusId;
    private Timestamp createdDate;
    private String createdUser;
    private RefdataStatusEntity refdataStatusByStatusId;

    public long getVendorDataMappingDetailToDataAttributesId() {
        return vendorDataMappingDetailToDataAttributesId;
    }

    public void setVendorDataMappingDetailToDataAttributesId(long vendorDataMappingDetailToDataAttributesId) {
        this.vendorDataMappingDetailToDataAttributesId = vendorDataMappingDetailToDataAttributesId;
    }

    public Long getVendorDataMappingDetailId() {
        return vendorDataMappingDetailId;
    }

    public void setVendorDataMappingDetailId(Long vendorDataMappingDetailId) {
        this.vendorDataMappingDetailId = vendorDataMappingDetailId;
    }

    public Short getDataAttributesId() {
        return dataAttributesId;
    }

    public void setDataAttributesId(Short dataAttributesId) {
        this.dataAttributesId = dataAttributesId;
    }

    public Short getStatusId() {
        return statusId;
    }

    public void setStatusId(Short statusId) {
        this.statusId = statusId;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
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

        MapVendordatamappingdetailtodataattributesEntity that = (MapVendordatamappingdetailtodataattributesEntity) o;

        if (vendorDataMappingDetailToDataAttributesId != that.vendorDataMappingDetailToDataAttributesId) return false;
        if (vendorDataMappingDetailId != null ? !vendorDataMappingDetailId.equals(that.vendorDataMappingDetailId) : that.vendorDataMappingDetailId != null)
            return false;
        if (dataAttributesId != null ? !dataAttributesId.equals(that.dataAttributesId) : that.dataAttributesId != null)
            return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (vendorDataMappingDetailToDataAttributesId ^ (vendorDataMappingDetailToDataAttributesId >>> 32));
        result = 31 * result + (vendorDataMappingDetailId != null ? vendorDataMappingDetailId.hashCode() : 0);
        result = 31 * result + (dataAttributesId != null ? dataAttributesId.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
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
