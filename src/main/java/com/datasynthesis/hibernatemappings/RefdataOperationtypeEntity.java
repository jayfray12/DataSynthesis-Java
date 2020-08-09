package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;
import java.util.Collection;

public class RefdataOperationtypeEntity {
    private String operationTypeId;
    private String operationTypeName;
    private Timestamp createdDate;
    private Short statusId;
    private Collection<PlatformRulesetsdefinitionsEntity> platformRulesetsdefinitionsByOperationTypeId;

    public String getOperationTypeId() {
        return operationTypeId;
    }

    public void setOperationTypeId(String operationTypeId) {
        this.operationTypeId = operationTypeId;
    }

    public String getOperationTypeName() {
        return operationTypeName;
    }

    public void setOperationTypeName(String operationTypeName) {
        this.operationTypeName = operationTypeName;
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

        RefdataOperationtypeEntity that = (RefdataOperationtypeEntity) o;

        if (operationTypeId != null ? !operationTypeId.equals(that.operationTypeId) : that.operationTypeId != null)
            return false;
        if (operationTypeName != null ? !operationTypeName.equals(that.operationTypeName) : that.operationTypeName != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = operationTypeId != null ? operationTypeId.hashCode() : 0;
        result = 31 * result + (operationTypeName != null ? operationTypeName.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        return result;
    }

    public Collection<PlatformRulesetsdefinitionsEntity> getPlatformRulesetsdefinitionsByOperationTypeId() {
        return platformRulesetsdefinitionsByOperationTypeId;
    }

    public void setPlatformRulesetsdefinitionsByOperationTypeId(Collection<PlatformRulesetsdefinitionsEntity> platformRulesetsdefinitionsByOperationTypeId) {
        this.platformRulesetsdefinitionsByOperationTypeId = platformRulesetsdefinitionsByOperationTypeId;
    }
}
