package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class MapHcinterfacedatamapdetailtodataattributesEntity {
    private long hcInterfaceDataMapToCoreMetadataDataMappingDetailId;
    private Long hcInterfaceDataMapDetailId;
    private Short dataAttributesId;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private RefdataStatusEntity refdataStatusByStatusId;

    public long getHcInterfaceDataMapToCoreMetadataDataMappingDetailId() {
        return hcInterfaceDataMapToCoreMetadataDataMappingDetailId;
    }

    public void setHcInterfaceDataMapToCoreMetadataDataMappingDetailId(long hcInterfaceDataMapToCoreMetadataDataMappingDetailId) {
        this.hcInterfaceDataMapToCoreMetadataDataMappingDetailId = hcInterfaceDataMapToCoreMetadataDataMappingDetailId;
    }

    public Long getHcInterfaceDataMapDetailId() {
        return hcInterfaceDataMapDetailId;
    }

    public void setHcInterfaceDataMapDetailId(Long hcInterfaceDataMapDetailId) {
        this.hcInterfaceDataMapDetailId = hcInterfaceDataMapDetailId;
    }

    public Short getDataAttributesId() {
        return dataAttributesId;
    }

    public void setDataAttributesId(Short dataAttributesId) {
        this.dataAttributesId = dataAttributesId;
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

        MapHcinterfacedatamapdetailtodataattributesEntity that = (MapHcinterfacedatamapdetailtodataattributesEntity) o;

        if (hcInterfaceDataMapToCoreMetadataDataMappingDetailId != that.hcInterfaceDataMapToCoreMetadataDataMappingDetailId)
            return false;
        if (hcInterfaceDataMapDetailId != null ? !hcInterfaceDataMapDetailId.equals(that.hcInterfaceDataMapDetailId) : that.hcInterfaceDataMapDetailId != null)
            return false;
        if (dataAttributesId != null ? !dataAttributesId.equals(that.dataAttributesId) : that.dataAttributesId != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (hcInterfaceDataMapToCoreMetadataDataMappingDetailId ^ (hcInterfaceDataMapToCoreMetadataDataMappingDetailId >>> 32));
        result = 31 * result + (hcInterfaceDataMapDetailId != null ? hcInterfaceDataMapDetailId.hashCode() : 0);
        result = 31 * result + (dataAttributesId != null ? dataAttributesId.hashCode() : 0);
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
