package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;
import java.util.Collection;

public class RefdataTimezonesEntity {
    private String timeZoneValue;
    private String timeZoneDesc;
    private Timestamp createdDate;
    private Short statusId;
    private Collection<DataexistingAreacodeEntity> dataexistingAreacodesByTimeZoneValue;
    private RefdataStatusEntity refdataStatusByStatusId;

    public String getTimeZoneValue() {
        return timeZoneValue;
    }

    public void setTimeZoneValue(String timeZoneValue) {
        this.timeZoneValue = timeZoneValue;
    }

    public String getTimeZoneDesc() {
        return timeZoneDesc;
    }

    public void setTimeZoneDesc(String timeZoneDesc) {
        this.timeZoneDesc = timeZoneDesc;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefdataTimezonesEntity that = (RefdataTimezonesEntity) o;

        if (timeZoneValue != null ? !timeZoneValue.equals(that.timeZoneValue) : that.timeZoneValue != null)
            return false;
        if (timeZoneDesc != null ? !timeZoneDesc.equals(that.timeZoneDesc) : that.timeZoneDesc != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = timeZoneValue != null ? timeZoneValue.hashCode() : 0;
        result = 31 * result + (timeZoneDesc != null ? timeZoneDesc.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        return result;
    }

    public Collection<DataexistingAreacodeEntity> getDataexistingAreacodesByTimeZoneValue() {
        return dataexistingAreacodesByTimeZoneValue;
    }

    public void setDataexistingAreacodesByTimeZoneValue(Collection<DataexistingAreacodeEntity> dataexistingAreacodesByTimeZoneValue) {
        this.dataexistingAreacodesByTimeZoneValue = dataexistingAreacodesByTimeZoneValue;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
