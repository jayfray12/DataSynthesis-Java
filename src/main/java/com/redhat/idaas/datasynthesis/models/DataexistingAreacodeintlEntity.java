package com.redhat.idaas.datasynthesis.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "dataexisting_areacodeintl", schema = "datasynthesis", catalog = "")
public class DataexistingAreacodeintlEntity extends io.quarkus.hibernate.orm.panache.PanacheEntityBase {
    private String iddCode;
    private Timestamp createdDate;
    private String registeredApp;

    @Id
    @Column(name = "IDDCode", nullable = false, length = 5)
    public String getIddCode() {
        return iddCode;
    }

    public void setIddCode(String iddCode) {
        this.iddCode = iddCode;
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

        DataexistingAreacodeintlEntity that = (DataexistingAreacodeintlEntity) o;

        if (iddCode != null ? !iddCode.equals(that.iddCode) : that.iddCode != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (registeredApp != null ? !registeredApp.equals(that.registeredApp) : that.registeredApp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iddCode != null ? iddCode.hashCode() : 0;
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (registeredApp != null ? registeredApp.hashCode() : 0);
        return result;
    }
}
