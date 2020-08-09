package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class DataexistingAreacodeintlEntity {
    private String iddCode;
    private Short countryId;
    private Timestamp createdDate;
    private Short statusId;
    private String registeredApp;
    private RefdataCountriesEntity refdataCountriesByCountryId;
    private RefdataStatusEntity refdataStatusByStatusId;

    public String getIddCode() {
        return iddCode;
    }

    public void setIddCode(String iddCode) {
        this.iddCode = iddCode;
    }

    public Short getCountryId() {
        return countryId;
    }

    public void setCountryId(Short countryId) {
        this.countryId = countryId;
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

        DataexistingAreacodeintlEntity that = (DataexistingAreacodeintlEntity) o;

        if (iddCode != null ? !iddCode.equals(that.iddCode) : that.iddCode != null) return false;
        if (countryId != null ? !countryId.equals(that.countryId) : that.countryId != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (registeredApp != null ? !registeredApp.equals(that.registeredApp) : that.registeredApp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iddCode != null ? iddCode.hashCode() : 0;
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (registeredApp != null ? registeredApp.hashCode() : 0);
        return result;
    }

    public RefdataCountriesEntity getRefdataCountriesByCountryId() {
        return refdataCountriesByCountryId;
    }

    public void setRefdataCountriesByCountryId(RefdataCountriesEntity refdataCountriesByCountryId) {
        this.refdataCountriesByCountryId = refdataCountriesByCountryId;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
