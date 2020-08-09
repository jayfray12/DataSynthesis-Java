package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class DatageneratedPhonenumbersintlEntity {
    private long phoneNumberIntlId;
    private String phoneNumberValue;
    private Timestamp createdDate;
    private Short statusId;
    private Short countryId;
    private String createdUser;
    private String registeredApp;
    private RefdataStatusEntity refdataStatusByStatusId;
    private RefdataCountriesEntity refdataCountriesByCountryId;

    public long getPhoneNumberIntlId() {
        return phoneNumberIntlId;
    }

    public void setPhoneNumberIntlId(long phoneNumberIntlId) {
        this.phoneNumberIntlId = phoneNumberIntlId;
    }

    public String getPhoneNumberValue() {
        return phoneNumberValue;
    }

    public void setPhoneNumberValue(String phoneNumberValue) {
        this.phoneNumberValue = phoneNumberValue;
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

    public Short getCountryId() {
        return countryId;
    }

    public void setCountryId(Short countryId) {
        this.countryId = countryId;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
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

        DatageneratedPhonenumbersintlEntity that = (DatageneratedPhonenumbersintlEntity) o;

        if (phoneNumberIntlId != that.phoneNumberIntlId) return false;
        if (phoneNumberValue != null ? !phoneNumberValue.equals(that.phoneNumberValue) : that.phoneNumberValue != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (countryId != null ? !countryId.equals(that.countryId) : that.countryId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (registeredApp != null ? !registeredApp.equals(that.registeredApp) : that.registeredApp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (phoneNumberIntlId ^ (phoneNumberIntlId >>> 32));
        result = 31 * result + (phoneNumberValue != null ? phoneNumberValue.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (registeredApp != null ? registeredApp.hashCode() : 0);
        return result;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }

    public RefdataCountriesEntity getRefdataCountriesByCountryId() {
        return refdataCountriesByCountryId;
    }

    public void setRefdataCountriesByCountryId(RefdataCountriesEntity refdataCountriesByCountryId) {
        this.refdataCountriesByCountryId = refdataCountriesByCountryId;
    }
}
