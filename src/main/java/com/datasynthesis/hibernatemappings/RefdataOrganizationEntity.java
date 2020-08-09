package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class RefdataOrganizationEntity {
    private long organizationId;
    private String organizationInternalCode;
    private String organizationInternalId;
    private String organizationName;
    private String address;
    private String city;
    private String stateId;
    private String zipCode;
    private String createdUser;
    private Short statusId;
    private Timestamp createdDate;
    private String organizationGuid;
    private RefdataUsstatesEntity refdataUsstatesByStateId;
    private RefdataStatusEntity refdataStatusByStatusId;

    public long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(long organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationInternalCode() {
        return organizationInternalCode;
    }

    public void setOrganizationInternalCode(String organizationInternalCode) {
        this.organizationInternalCode = organizationInternalCode;
    }

    public String getOrganizationInternalId() {
        return organizationInternalId;
    }

    public void setOrganizationInternalId(String organizationInternalId) {
        this.organizationInternalId = organizationInternalId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
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

    public String getOrganizationGuid() {
        return organizationGuid;
    }

    public void setOrganizationGuid(String organizationGuid) {
        this.organizationGuid = organizationGuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefdataOrganizationEntity that = (RefdataOrganizationEntity) o;

        if (organizationId != that.organizationId) return false;
        if (organizationInternalCode != null ? !organizationInternalCode.equals(that.organizationInternalCode) : that.organizationInternalCode != null)
            return false;
        if (organizationInternalId != null ? !organizationInternalId.equals(that.organizationInternalId) : that.organizationInternalId != null)
            return false;
        if (organizationName != null ? !organizationName.equals(that.organizationName) : that.organizationName != null)
            return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (stateId != null ? !stateId.equals(that.stateId) : that.stateId != null) return false;
        if (zipCode != null ? !zipCode.equals(that.zipCode) : that.zipCode != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (organizationGuid != null ? !organizationGuid.equals(that.organizationGuid) : that.organizationGuid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (organizationId ^ (organizationId >>> 32));
        result = 31 * result + (organizationInternalCode != null ? organizationInternalCode.hashCode() : 0);
        result = 31 * result + (organizationInternalId != null ? organizationInternalId.hashCode() : 0);
        result = 31 * result + (organizationName != null ? organizationName.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (stateId != null ? stateId.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (organizationGuid != null ? organizationGuid.hashCode() : 0);
        return result;
    }

    public RefdataUsstatesEntity getRefdataUsstatesByStateId() {
        return refdataUsstatesByStateId;
    }

    public void setRefdataUsstatesByStateId(RefdataUsstatesEntity refdataUsstatesByStateId) {
        this.refdataUsstatesByStateId = refdataUsstatesByStateId;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
