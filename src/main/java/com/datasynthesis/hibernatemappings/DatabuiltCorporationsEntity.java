package com.datasynthesis.hibernatemappings;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "databuilt_corporations", schema = "datasynthesis", catalog = "")
public class DatabuiltCorporationsEntity {
    private long dataBuiltCorporationId;
    private String corporationName;
    private String address1;
    private String city;
    private String stateId;
    private String zipCode;
    private Timestamp createdDate;
    private String registeredApp;

    @Id
    @Column(name = "DataBuiltCorporationID", nullable = false)
    public long getDataBuiltCorporationId() {
        return dataBuiltCorporationId;
    }

    public void setDataBuiltCorporationId(long dataBuiltCorporationId) {
        this.dataBuiltCorporationId = dataBuiltCorporationId;
    }

    @Basic
    @Column(name = "CorporationName", nullable = true, length = 99)
    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    @Basic
    @Column(name = "Address1", nullable = true, length = 99)
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Basic
    @Column(name = "City", nullable = true, length = 70)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "StateID", nullable = true, length = 2)
    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    @Basic
    @Column(name = "ZipCode", nullable = true, length = 10)
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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

        DatabuiltCorporationsEntity that = (DatabuiltCorporationsEntity) o;

        if (dataBuiltCorporationId != that.dataBuiltCorporationId) return false;
        if (corporationName != null ? !corporationName.equals(that.corporationName) : that.corporationName != null)
            return false;
        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (stateId != null ? !stateId.equals(that.stateId) : that.stateId != null) return false;
        if (zipCode != null ? !zipCode.equals(that.zipCode) : that.zipCode != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (registeredApp != null ? !registeredApp.equals(that.registeredApp) : that.registeredApp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (dataBuiltCorporationId ^ (dataBuiltCorporationId >>> 32));
        result = 31 * result + (corporationName != null ? corporationName.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (stateId != null ? stateId.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (registeredApp != null ? registeredApp.hashCode() : 0);
        return result;
    }
}
