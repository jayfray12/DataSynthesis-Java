package com.datasynthesis.ormmapping;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "map_delimiteddatamappingheader", schema = "datasynthesis", catalog = "")
public class MapDelimiteddatamappingheaderEntity {
    private short delimitedDataMappingHeaderId;
    private String vendorTechnologyName;
    private String vendorTechnologyDesc;
    private String vendorTechnologyInternalCode;
    private Integer vendorId;
    private Integer applicationId;
    private Integer organizationId;
    private String vendorTechnologyVersion;
    private String createdBy;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private String delimitedDataMappingHeaderGuid;
    private String delimiterCharacter;
    private RefdataStatusEntity refdataStatusByStatusId;

    @Id
    @Column(name = "DelimitedDataMappingHeaderID", nullable = false)
    public short getDelimitedDataMappingHeaderId() {
        return delimitedDataMappingHeaderId;
    }

    public void setDelimitedDataMappingHeaderId(short delimitedDataMappingHeaderId) {
        this.delimitedDataMappingHeaderId = delimitedDataMappingHeaderId;
    }

    @Basic
    @Column(name = "VendorTechnologyName", nullable = true, length = 50)
    public String getVendorTechnologyName() {
        return vendorTechnologyName;
    }

    public void setVendorTechnologyName(String vendorTechnologyName) {
        this.vendorTechnologyName = vendorTechnologyName;
    }

    @Basic
    @Column(name = "VendorTechnologyDesc", nullable = true, length = 50)
    public String getVendorTechnologyDesc() {
        return vendorTechnologyDesc;
    }

    public void setVendorTechnologyDesc(String vendorTechnologyDesc) {
        this.vendorTechnologyDesc = vendorTechnologyDesc;
    }

    @Basic
    @Column(name = "VendorTechnologyInternalCode", nullable = true, length = 10)
    public String getVendorTechnologyInternalCode() {
        return vendorTechnologyInternalCode;
    }

    public void setVendorTechnologyInternalCode(String vendorTechnologyInternalCode) {
        this.vendorTechnologyInternalCode = vendorTechnologyInternalCode;
    }

    @Basic
    @Column(name = "VendorID", nullable = true)
    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    @Basic
    @Column(name = "ApplicationID", nullable = true)
    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    @Basic
    @Column(name = "OrganizationID", nullable = true)
    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "VendorTechnologyVersion", nullable = true, length = 15)
    public String getVendorTechnologyVersion() {
        return vendorTechnologyVersion;
    }

    public void setVendorTechnologyVersion(String vendorTechnologyVersion) {
        this.vendorTechnologyVersion = vendorTechnologyVersion;
    }

    @Basic
    @Column(name = "CreatedBy", nullable = true, length = 20)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "CreatedDate", nullable = true)
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "StatusID", nullable = true)
    public Short getStatusId() {
        return statusId;
    }

    public void setStatusId(Short statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "CreatedUser", nullable = true, length = 20)
    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    @Basic
    @Column(name = "DelimitedDataMappingHeaderGUID", nullable = true, length = 38)
    public String getDelimitedDataMappingHeaderGuid() {
        return delimitedDataMappingHeaderGuid;
    }

    public void setDelimitedDataMappingHeaderGuid(String delimitedDataMappingHeaderGuid) {
        this.delimitedDataMappingHeaderGuid = delimitedDataMappingHeaderGuid;
    }

    @Basic
    @Column(name = "DelimiterCharacter", nullable = true, length = 1)
    public String getDelimiterCharacter() {
        return delimiterCharacter;
    }

    public void setDelimiterCharacter(String delimiterCharacter) {
        this.delimiterCharacter = delimiterCharacter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapDelimiteddatamappingheaderEntity that = (MapDelimiteddatamappingheaderEntity) o;

        if (delimitedDataMappingHeaderId != that.delimitedDataMappingHeaderId) return false;
        if (vendorTechnologyName != null ? !vendorTechnologyName.equals(that.vendorTechnologyName) : that.vendorTechnologyName != null)
            return false;
        if (vendorTechnologyDesc != null ? !vendorTechnologyDesc.equals(that.vendorTechnologyDesc) : that.vendorTechnologyDesc != null)
            return false;
        if (vendorTechnologyInternalCode != null ? !vendorTechnologyInternalCode.equals(that.vendorTechnologyInternalCode) : that.vendorTechnologyInternalCode != null)
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
        if (delimitedDataMappingHeaderGuid != null ? !delimitedDataMappingHeaderGuid.equals(that.delimitedDataMappingHeaderGuid) : that.delimitedDataMappingHeaderGuid != null)
            return false;
        if (delimiterCharacter != null ? !delimiterCharacter.equals(that.delimiterCharacter) : that.delimiterCharacter != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) delimitedDataMappingHeaderId;
        result = 31 * result + (vendorTechnologyName != null ? vendorTechnologyName.hashCode() : 0);
        result = 31 * result + (vendorTechnologyDesc != null ? vendorTechnologyDesc.hashCode() : 0);
        result = 31 * result + (vendorTechnologyInternalCode != null ? vendorTechnologyInternalCode.hashCode() : 0);
        result = 31 * result + (vendorId != null ? vendorId.hashCode() : 0);
        result = 31 * result + (applicationId != null ? applicationId.hashCode() : 0);
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (vendorTechnologyVersion != null ? vendorTechnologyVersion.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (delimitedDataMappingHeaderGuid != null ? delimitedDataMappingHeaderGuid.hashCode() : 0);
        result = 31 * result + (delimiterCharacter != null ? delimiterCharacter.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "StatusID", referencedColumnName = "StatusID", table = "map_delimiteddatamappingheader")
    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
