package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class DatageneratedUseridentitiesEntity {
    private long userIdentitiesId;
    private String userIdentityValue;
    private String userDomain;
    private String additionalAttributes;
    private Timestamp createdDate;
    private Short statusId;
    private String registeredApp;
    private RefdataStatusEntity refdataStatusByStatusId;

    public long getUserIdentitiesId() {
        return userIdentitiesId;
    }

    public void setUserIdentitiesId(long userIdentitiesId) {
        this.userIdentitiesId = userIdentitiesId;
    }

    public String getUserIdentityValue() {
        return userIdentityValue;
    }

    public void setUserIdentityValue(String userIdentityValue) {
        this.userIdentityValue = userIdentityValue;
    }

    public String getUserDomain() {
        return userDomain;
    }

    public void setUserDomain(String userDomain) {
        this.userDomain = userDomain;
    }

    public String getAdditionalAttributes() {
        return additionalAttributes;
    }

    public void setAdditionalAttributes(String additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
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

        DatageneratedUseridentitiesEntity that = (DatageneratedUseridentitiesEntity) o;

        if (userIdentitiesId != that.userIdentitiesId) return false;
        if (userIdentityValue != null ? !userIdentityValue.equals(that.userIdentityValue) : that.userIdentityValue != null)
            return false;
        if (userDomain != null ? !userDomain.equals(that.userDomain) : that.userDomain != null) return false;
        if (additionalAttributes != null ? !additionalAttributes.equals(that.additionalAttributes) : that.additionalAttributes != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (registeredApp != null ? !registeredApp.equals(that.registeredApp) : that.registeredApp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userIdentitiesId ^ (userIdentitiesId >>> 32));
        result = 31 * result + (userIdentityValue != null ? userIdentityValue.hashCode() : 0);
        result = 31 * result + (userDomain != null ? userDomain.hashCode() : 0);
        result = 31 * result + (additionalAttributes != null ? additionalAttributes.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (registeredApp != null ? registeredApp.hashCode() : 0);
        return result;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
