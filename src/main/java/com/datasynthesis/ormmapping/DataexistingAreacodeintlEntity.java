package com.datasynthesis.ormmapping;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "dataexisting_areacodeintl", schema = "datasynthesis", catalog = "")
public class DataexistingAreacodeintlEntity {
    private String iddCode;
    private Short countryId;
    private Timestamp createdDate;
    private Short statusId;
    private String registeredApp;
    private RefdataCountriesEntity refdataCountriesByCountryId;
    private RefdataStatusEntity refdataStatusByStatusId;

    @Id
    @Column(name = "IDDCode", nullable = false, length = 5)
    public String getIddCode() {
        return iddCode;
    }

    public void setIddCode(String iddCode) {
        this.iddCode = iddCode;
    }

    @Basic
    @Column(name = "CountryID", nullable = true)
    public Short getCountryId() {
        return countryId;
    }

    public void setCountryId(Short countryId) {
        this.countryId = countryId;
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
    @Column(name = "RegisteredApp", nullable = true, length = 38)
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

    @ManyToOne
    @JoinColumn(name = "CountryID", referencedColumnName = "CountryID", table = "dataexisting_areacodeintl")
    public RefdataCountriesEntity getRefdataCountriesByCountryId() {
        return refdataCountriesByCountryId;
    }

    public void setRefdataCountriesByCountryId(RefdataCountriesEntity refdataCountriesByCountryId) {
        this.refdataCountriesByCountryId = refdataCountriesByCountryId;
    }

    @ManyToOne
    @JoinColumn(name = "StatusID", referencedColumnName = "StatusID", table = "dataexisting_areacodeintl")
    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
