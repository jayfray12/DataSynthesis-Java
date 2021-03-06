package com.redhat.idaas.datasynthesis.models;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dataexisting_zipcodeintl", schema = "datasynthesis", catalog = "")
public class DataExistingZipCodeIntlEntity extends io.quarkus.hibernate.orm.panache.PanacheEntityBase {
    private int zipCodeIntnlId;
    private String zipCode;
    private String zipCodeType;
    private String city;
    private String lattitude;
    private String longitude;
    private String location;
    private Timestamp createdDate;
    private String createdUser;
    private String registeredApp;
    private RefDataStatusEntity refdataStatus;
    private RefDataCountriesEntity refdataCountries;

    @Id
    @Column(name = "ZipCodeIntnlID", nullable = false)
    public int getZipCodeIntnlId() {
        return zipCodeIntnlId;
    }

    public void setZipCodeIntnlId(int zipCodeIntnlId) {
        this.zipCodeIntnlId = zipCodeIntnlId;
    }

    @Basic
    @Column(name = "ZipCode", nullable = false, length = 10)
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Basic
    @Column(name = "ZipCodeType", nullable = true, length = 15)
    public String getZipCodeType() {
        return zipCodeType;
    }

    public void setZipCodeType(String zipCodeType) {
        this.zipCodeType = zipCodeType;
    }

    @Basic
    @Column(name = "City", nullable = true, length = 75)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "Lattitude", nullable = true, length = 10)
    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    @Basic
    @Column(name = "Longitude", nullable = true, length = 10)
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "Location", nullable = true, length = 99)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
    @Column(name = "CreatedUser", nullable = true, length = 20)
    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
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

        DataExistingZipCodeIntlEntity that = (DataExistingZipCodeIntlEntity) o;

        if (zipCodeIntnlId != that.zipCodeIntnlId) return false;
        if (zipCode != null ? !zipCode.equals(that.zipCode) : that.zipCode != null) return false;
        if (zipCodeType != null ? !zipCodeType.equals(that.zipCodeType) : that.zipCodeType != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (lattitude != null ? !lattitude.equals(that.lattitude) : that.lattitude != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (refdataStatus != null ? !refdataStatus.equals(that.refdataStatus) : that.refdataStatus != null) return false;
        if (refdataCountries != null ? !refdataCountries.equals(that.refdataCountries) : that.refdataCountries != null) return false;
        if (registeredApp != null ? !registeredApp.equals(that.registeredApp) : that.registeredApp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zipCodeIntnlId;
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (zipCodeType != null ? zipCodeType.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (lattitude != null ? lattitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (registeredApp != null ? registeredApp.hashCode() : 0);
        result = 31 * result + (refdataStatus != null ? refdataStatus.hashCode() : 0);
        result = 31 * result + (refdataCountries != null ? refdataCountries.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Country", referencedColumnName = "CountryID")
    public RefDataCountriesEntity getRefdataCountries() {
        return refdataCountries;
    }

    public void setRefdataCountries(RefDataCountriesEntity refdataCountries) {
        this.refdataCountries = refdataCountries;
    }

    @ManyToOne
    @JoinColumn(name = "StatusID", referencedColumnName = "StatusID")
    public RefDataStatusEntity getRefdataStatus() {
        return refdataStatus;
    }

    public void setRefdataStatus(RefDataStatusEntity refdataStatus) {
        this.refdataStatus = refdataStatus;
    }

    public static List<DataExistingZipCodeIntlEntity> findByStatusId(Short statusId) {
        return find("refdataStatus", new RefDataStatusEntity(statusId)).list();
    }
}
