package com.datasynthesis.hibernatemappings;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "refdata_timezones", schema = "datasynthesis", catalog = "")
public class RefdataTimezonesEntity {
    private String timeZoneValue;
    private String timeZoneDesc;
    private Timestamp createdDate;

    @Id
    @Column(name = "TimeZoneValue", nullable = false, length = 3)
    public String getTimeZoneValue() {
        return timeZoneValue;
    }

    public void setTimeZoneValue(String timeZoneValue) {
        this.timeZoneValue = timeZoneValue;
    }

    @Basic
    @Column(name = "TimeZoneDesc", nullable = true, length = 25)
    public String getTimeZoneDesc() {
        return timeZoneDesc;
    }

    public void setTimeZoneDesc(String timeZoneDesc) {
        this.timeZoneDesc = timeZoneDesc;
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

        RefdataTimezonesEntity that = (RefdataTimezonesEntity) o;

        if (timeZoneValue != null ? !timeZoneValue.equals(that.timeZoneValue) : that.timeZoneValue != null)
            return false;
        if (timeZoneDesc != null ? !timeZoneDesc.equals(that.timeZoneDesc) : that.timeZoneDesc != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = timeZoneValue != null ? timeZoneValue.hashCode() : 0;
        result = 31 * result + (timeZoneDesc != null ? timeZoneDesc.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }
}
