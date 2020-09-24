package com.datasynthesis.hibernatemappings;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "auditing_datarequestdetail", schema = "datasynthesis", catalog = "")
public class AuditingDatarequestdetailEntity {
    private long dataRequestDetailId;
    private Long recCount;
    private String recordFormatDetails;
    private Timestamp createdDate;

    @Id
    @Column(name = "DataRequestDetailID", nullable = false)
    public long getDataRequestDetailId() {
        return dataRequestDetailId;
    }

    public void setDataRequestDetailId(long dataRequestDetailId) {
        this.dataRequestDetailId = dataRequestDetailId;
    }

    @Basic
    @Column(name = "RecCount", nullable = true)
    public Long getRecCount() {
        return recCount;
    }

    public void setRecCount(Long recCount) {
        this.recCount = recCount;
    }

    @Basic
    @Column(name = "RecordFormatDetails", nullable = true, length = 75)
    public String getRecordFormatDetails() {
        return recordFormatDetails;
    }

    public void setRecordFormatDetails(String recordFormatDetails) {
        this.recordFormatDetails = recordFormatDetails;
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

        AuditingDatarequestdetailEntity that = (AuditingDatarequestdetailEntity) o;

        if (dataRequestDetailId != that.dataRequestDetailId) return false;
        if (recCount != null ? !recCount.equals(that.recCount) : that.recCount != null) return false;
        if (recordFormatDetails != null ? !recordFormatDetails.equals(that.recordFormatDetails) : that.recordFormatDetails != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (dataRequestDetailId ^ (dataRequestDetailId >>> 32));
        result = 31 * result + (recCount != null ? recCount.hashCode() : 0);
        result = 31 * result + (recordFormatDetails != null ? recordFormatDetails.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }
}
