package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class MapVendordatamappingheaderEntity {
    private short vendorDataMappingHeaderId;
    private String vendorTechnologyName;
    private String vendorTechnologyDesc;
    private String vendorTechnologyInternalMnemonic;
    private Integer vendorId;
    private Integer applicationId;
    private Integer organizationId;
    private String vendorTechnologyVersion;
    private String createdBy;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private String vendorDataMappingHeaderGuid;
    private RefdataStatusEntity refdataStatusByStatusId;

    public short getVendorDataMappingHeaderId() {
        return vendorDataMappingHeaderId;
    }

    public void setVendorDataMappingHeaderId(short vendorDataMappingHeaderId) {
        this.vendorDataMappingHeaderId = vendorDataMappingHeaderId;
    }

    public String getVendorTechnologyName() {
        return vendorTechnologyName;
    }

    public void setVendorTechnologyName(String vendorTechnologyName) {
        this.vendorTechnologyName = vendorTechnologyName;
    }

    public String getVendorTechnologyDesc() {
        return vendorTechnologyDesc;
    }

    public void setVendorTechnologyDesc(String vendorTechnologyDesc) {
        this.vendorTechnologyDesc = vendorTechnologyDesc;
    }

    public String getVendorTechnologyInternalMnemonic() {
        return vendorTechnologyInternalMnemonic;
    }

    public void setVendorTechnologyInternalMnemonic(String vendorTechnologyInternalMnemonic) {
        this.vendorTechnologyInternalMnemonic = vendorTechnologyInternalMnemonic;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getVendorTechnologyVersion() {
        return vendorTechnologyVersion;
    }

    public void setVendorTechnologyVersion(String vendorTechnologyVersion) {
        this.vendorTechnologyVersion = vendorTechnologyVersion;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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

    public String getVendorDataMappingHeaderGuid() {
        return vendorDataMappingHeaderGuid;
    }

    public void setVendorDataMappingHeaderGuid(String vendorDataMappingHeaderGuid) {
        this.vendorDataMappingHeaderGuid = vendorDataMappingHeaderGuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapVendordatamappingheaderEntity that = (MapVendordatamappingheaderEntity) o;

        if (vendorDataMappingHeaderId != that.vendorDataMappingHeaderId) return false;
        if (vendorTechnologyName != null ? !vendorTechnologyName.equals(that.vendorTechnologyName) : that.vendorTechnologyName != null)
            return false;
        if (vendorTechnologyDesc != null ? !vendorTechnologyDesc.equals(that.vendorTechnologyDesc) : that.vendorTechnologyDesc != null)
            return false;
        if (vendorTechnologyInternalMnemonic != null ? !vendorTechnologyInternalMnemonic.equals(that.vendorTechnologyInternalMnemonic) : that.vendorTechnologyInternalMnemonic != null)
            return false;
        if (vendorId != null ? !vendorId.equals(that.vendorId) : that.vendorId != null) return false;
        if (applicationId != null ? !applicationId.equals(that.applicationId) : that.applicationId != null)
            return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;
        if (vendorTechnologyVersion != null ? !vendorTechnologyVersion.equals(that.vendorTechnologyVersion) : that.vendorTechnologyVersion != null)
            return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (vendorDataMappingHeaderGuid != null ? !vendorDataMappingHeaderGuid.equals(that.vendorDataMappingHeaderGuid) : that.vendorDataMappingHeaderGuid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) vendorDataMappingHeaderId;
        result = 31 * result + (vendorTechnologyName != null ? vendorTechnologyName.hashCode() : 0);
        result = 31 * result + (vendorTechnologyDesc != null ? vendorTechnologyDesc.hashCode() : 0);
        result = 31 * result + (vendorTechnologyInternalMnemonic != null ? vendorTechnologyInternalMnemonic.hashCode() : 0);
        result = 31 * result + (vendorId != null ? vendorId.hashCode() : 0);
        result = 31 * result + (applicationId != null ? applicationId.hashCode() : 0);
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (vendorTechnologyVersion != null ? vendorTechnologyVersion.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (vendorDataMappingHeaderGuid != null ? vendorDataMappingHeaderGuid.hashCode() : 0);
        return result;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
