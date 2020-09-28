package com.redhat.idaas.datasynthesis.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "datagenerated_phonenumbersintl", schema = "datasynthesis", catalog = "")
public class DatageneratedPhonenumbersintlEntity extends io.quarkus.hibernate.orm.panache.PanacheEntityBase {
    private long phoneNumberIntlId;
    private String phoneNumberValue;
    private Timestamp createdDate;
    private String createdUser;
    private String registeredApp;

    @Id
    @Column(name = "PhoneNumberIntlID", nullable = false)
    public long getPhoneNumberIntlId() {
        return phoneNumberIntlId;
    }

    public void setPhoneNumberIntlId(long phoneNumberIntlId) {
        this.phoneNumberIntlId = phoneNumberIntlId;
    }

    @Basic
    @Column(name = "PhoneNumberValue", nullable = true, length = 12)
    public String getPhoneNumberValue() {
        return phoneNumberValue;
    }

    public void setPhoneNumberValue(String phoneNumberValue) {
        this.phoneNumberValue = phoneNumberValue;
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

        DatageneratedPhonenumbersintlEntity that = (DatageneratedPhonenumbersintlEntity) o;

        if (phoneNumberIntlId != that.phoneNumberIntlId) return false;
        if (phoneNumberValue != null ? !phoneNumberValue.equals(that.phoneNumberValue) : that.phoneNumberValue != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
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
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (registeredApp != null ? registeredApp.hashCode() : 0);
        return result;
    }
}
