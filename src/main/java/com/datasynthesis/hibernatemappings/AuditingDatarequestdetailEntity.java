package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class AuditingDatarequestdetailEntity {
    private long dataRequestDetailId;
    private Long dataRequestId;
    private Short dataAttributeId;
    private Long recCount;
    private String recordFormatDetails;
    private Short statusId;
    private Timestamp createdDate;
    private AuditingDatarequestEntity auditingDatarequestByDataRequestId;
    private PlatformDataattributesEntity platformDataattributesByDataAttributeId;
    private RefdataStatusEntity refdataStatusByStatusId;

    public long getDataRequestDetailId() {
        return dataRequestDetailId;
    }

    public void setDataRequestDetailId(long dataRequestDetailId) {
        this.dataRequestDetailId = dataRequestDetailId;
    }

    public Long getDataRequestId() {
        return dataRequestId;
    }

    public void setDataRequestId(Long dataRequestId) {
        this.dataRequestId = dataRequestId;
    }

    public Short getDataAttributeId() {
        return dataAttributeId;
    }

    public void setDataAttributeId(Short dataAttributeId) {
        this.dataAttributeId = dataAttributeId;
    }

    public Long getRecCount() {
        return recCount;
    }

    public void setRecCount(Long recCount) {
        this.recCount = recCount;
    }

    public String getRecordFormatDetails() {
        return recordFormatDetails;
    }

    public void setRecordFormatDetails(String recordFormatDetails) {
        this.recordFormatDetails = recordFormatDetails;
    }

    public Short getStatusId() {
        return statusId;
    }

    public void setStatusId(Short statusId) {
        this.statusId = statusId;
    }

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
        if (dataRequestId != null ? !dataRequestId.equals(that.dataRequestId) : that.dataRequestId != null)
            return false;
        if (dataAttributeId != null ? !dataAttributeId.equals(that.dataAttributeId) : that.dataAttributeId != null)
            return false;
        if (recCount != null ? !recCount.equals(that.recCount) : that.recCount != null) return false;
        if (recordFormatDetails != null ? !recordFormatDetails.equals(that.recordFormatDetails) : that.recordFormatDetails != null)
            return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (dataRequestDetailId ^ (dataRequestDetailId >>> 32));
        result = 31 * result + (dataRequestId != null ? dataRequestId.hashCode() : 0);
        result = 31 * result + (dataAttributeId != null ? dataAttributeId.hashCode() : 0);
        result = 31 * result + (recCount != null ? recCount.hashCode() : 0);
        result = 31 * result + (recordFormatDetails != null ? recordFormatDetails.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }

    public AuditingDatarequestEntity getAuditingDatarequestByDataRequestId() {
        return auditingDatarequestByDataRequestId;
    }

    public void setAuditingDatarequestByDataRequestId(AuditingDatarequestEntity auditingDatarequestByDataRequestId) {
        this.auditingDatarequestByDataRequestId = auditingDatarequestByDataRequestId;
    }

    public PlatformDataattributesEntity getPlatformDataattributesByDataAttributeId() {
        return platformDataattributesByDataAttributeId;
    }

    public void setPlatformDataattributesByDataAttributeId(PlatformDataattributesEntity platformDataattributesByDataAttributeId) {
        this.platformDataattributesByDataAttributeId = platformDataattributesByDataAttributeId;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
