package com.datasynthesis.ormmapping;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Table(name = "refdata_countries", schema = "datasynthesis", catalog = "")
public class RefdataCountriesEntity {
    private short countryId;
    private String idd;
    private String countryName;
    private Timestamp createdDate;
    private Short statusId;
    private Collection<DataexistingAreacodeintlEntity> dataexistingAreacodeintlsByCountryId;
    private Collection<DataexistingZipcodeintlEntity> dataexistingZipcodeintlsByCountryId;
    private Collection<DatageneratedPhonenumbersintlEntity> datageneratedPhonenumbersintlsByCountryId;
    private RefdataStatusEntity refdataStatusByStatusId;

    @Id
    @Column(name = "CountryID", nullable = false)
    public short getCountryId() {
        return countryId;
    }

    public void setCountryId(short countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "IDD", nullable = true, length = 5)
    public String getIdd() {
        return idd;
    }

    public void setIdd(String idd) {
        this.idd = idd;
    }

    @Basic
    @Column(name = "CountryName", nullable = true, length = 59)
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefdataCountriesEntity that = (RefdataCountriesEntity) o;

        if (countryId != that.countryId) return false;
        if (idd != null ? !idd.equals(that.idd) : that.idd != null) return false;
        if (countryName != null ? !countryName.equals(that.countryName) : that.countryName != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) countryId;
        result = 31 * result + (idd != null ? idd.hashCode() : 0);
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "refdataCountriesByCountryId")
    public Collection<DataexistingAreacodeintlEntity> getDataexistingAreacodeintlsByCountryId() {
        return dataexistingAreacodeintlsByCountryId;
    }

    public void setDataexistingAreacodeintlsByCountryId(Collection<DataexistingAreacodeintlEntity> dataexistingAreacodeintlsByCountryId) {
        this.dataexistingAreacodeintlsByCountryId = dataexistingAreacodeintlsByCountryId;
    }

    @OneToMany(mappedBy = "refdataCountriesByCountry")
    public Collection<DataexistingZipcodeintlEntity> getDataexistingZipcodeintlsByCountryId() {
        return dataexistingZipcodeintlsByCountryId;
    }

    public void setDataexistingZipcodeintlsByCountryId(Collection<DataexistingZipcodeintlEntity> dataexistingZipcodeintlsByCountryId) {
        this.dataexistingZipcodeintlsByCountryId = dataexistingZipcodeintlsByCountryId;
    }

    @OneToMany(mappedBy = "refdataCountriesByCountryId")
    public Collection<DatageneratedPhonenumbersintlEntity> getDatageneratedPhonenumbersintlsByCountryId() {
        return datageneratedPhonenumbersintlsByCountryId;
    }

    public void setDatageneratedPhonenumbersintlsByCountryId(Collection<DatageneratedPhonenumbersintlEntity> datageneratedPhonenumbersintlsByCountryId) {
        this.datageneratedPhonenumbersintlsByCountryId = datageneratedPhonenumbersintlsByCountryId;
    }

    @ManyToOne
    @JoinColumn(name = "StatusID", referencedColumnName = "StatusID", table = "refdata_countries")
    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
