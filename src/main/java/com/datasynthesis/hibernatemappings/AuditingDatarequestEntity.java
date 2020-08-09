package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;
import java.util.Collection;

public class AuditingDatarequestEntity {
    private long dataRequestId;
    private Timestamp dataRequestDate;
    private String createdByUser;
    private Long organizaton;
    private Long application;
    private Short statusId;
    private Timestamp createdDate;
    private RefdataStatusEntity refdataStatusByStatusId;
    private Collection<AuditingDatarequestdetailEntity> auditingDatarequestdetailsByDataRequestId;

    public long getDataRequestId() {
        return dataRequestId;
    }

    public void setDataRequestId(long dataRequestId) {
        this.dataRequestId = dataRequestId;
    }

    public Timestamp getDataRequestDate() {
        return dataRequestDate;
    }

    public void setDataRequestDate(Timestamp dataRequestDate) {
        this.dataRequestDate = dataRequestDate;
    }

    public String getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
    }

    public Long getOrganizaton() {
        return organizaton;
    }

    public void setOrganizaton(Long organizaton) {
        this.organizaton = organizaton;
    }

    public Long getApplication() {
        return application;
    }

    public void setApplication(Long application) {
        this.application = application;
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

        AuditingDatarequestEntity that = (AuditingDatarequestEntity) o;

        if (dataRequestId != that.dataRequestId) return false;
        if (dataRequestDate != null ? !dataRequestDate.equals(that.dataRequestDate) : that.dataRequestDate != null)
            return false;
        if (createdByUser != null ? !createdByUser.equals(that.createdByUser) : that.createdByUser != null)
            return false;
        if (organizaton != null ? !organizaton.equals(that.organizaton) : that.organizaton != null) return false;
        if (application != null ? !application.equals(that.application) : that.application != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (dataRequestId ^ (dataRequestId >>> 32));
        result = 31 * result + (dataRequestDate != null ? dataRequestDate.hashCode() : 0);
        result = 31 * result + (createdByUser != null ? createdByUser.hashCode() : 0);
        result = 31 * result + (organizaton != null ? organizaton.hashCode() : 0);
        result = 31 * result + (application != null ? application.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }

    public Collection<AuditingDatarequestdetailEntity> getAuditingDatarequestdetailsByDataRequestId() {
        return auditingDatarequestdetailsByDataRequestId;
    }

    public void setAuditingDatarequestdetailsByDataRequestId(Collection<AuditingDatarequestdetailEntity> auditingDatarequestdetailsByDataRequestId) {
        this.auditingDatarequestdetailsByDataRequestId = auditingDatarequestdetailsByDataRequestId;
    }
}
