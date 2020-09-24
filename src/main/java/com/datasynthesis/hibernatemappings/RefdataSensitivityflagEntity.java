package com.datasynthesis.hibernatemappings;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "refdata_sensitivityflag", schema = "datasynthesis", catalog = "")
public class RefdataSensitivityflagEntity {
    private short sensitiveFlagId;
    private String sensitiveFlagDesc;
    private Timestamp createdDate;

    @Id
    @Column(name = "SensitiveFlagID", nullable = false)
    public short getSensitiveFlagId() {
        return sensitiveFlagId;
    }

    public void setSensitiveFlagId(short sensitiveFlagId) {
        this.sensitiveFlagId = sensitiveFlagId;
    }

    @Basic
    @Column(name = "SensitiveFlagDesc", nullable = true, length = 30)
    public String getSensitiveFlagDesc() {
        return sensitiveFlagDesc;
    }

    public void setSensitiveFlagDesc(String sensitiveFlagDesc) {
        this.sensitiveFlagDesc = sensitiveFlagDesc;
    }

    @Basic
    @Column(name = "CreatedDate", nullable = true)
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefdataSensitivityflagEntity that = (RefdataSensitivityflagEntity) o;

        if (sensitiveFlagId != that.sensitiveFlagId) return false;
        if (sensitiveFlagDesc != null ? !sensitiveFlagDesc.equals(that.sensitiveFlagDesc) : that.sensitiveFlagDesc != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) sensitiveFlagId;
        result = 31 * result + (sensitiveFlagDesc != null ? sensitiveFlagDesc.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }
}
