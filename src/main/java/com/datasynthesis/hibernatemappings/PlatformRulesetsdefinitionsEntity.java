package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class PlatformRulesetsdefinitionsEntity {
    private String rulesetDefinitionsId;
    private String rulesetDefinitionName;
    private Long ruleSetId;
    private Short stepOrderId;
    private String operationTypeId;
    private String rulesetDefValue;
    private Short statusId;
    private Timestamp createdDate;
    private Timestamp effectiveDate;
    private PlatformRulesetsEntity platformRulesetsByRuleSetId;
    private RefdataOperationtypeEntity refdataOperationtypeByOperationTypeId;
    private RefdataStatusEntity refdataStatusByStatusId;

    public String getRulesetDefinitionsId() {
        return rulesetDefinitionsId;
    }

    public void setRulesetDefinitionsId(String rulesetDefinitionsId) {
        this.rulesetDefinitionsId = rulesetDefinitionsId;
    }

    public String getRulesetDefinitionName() {
        return rulesetDefinitionName;
    }

    public void setRulesetDefinitionName(String rulesetDefinitionName) {
        this.rulesetDefinitionName = rulesetDefinitionName;
    }

    public Long getRuleSetId() {
        return ruleSetId;
    }

    public void setRuleSetId(Long ruleSetId) {
        this.ruleSetId = ruleSetId;
    }

    public Short getStepOrderId() {
        return stepOrderId;
    }

    public void setStepOrderId(Short stepOrderId) {
        this.stepOrderId = stepOrderId;
    }

    public String getOperationTypeId() {
        return operationTypeId;
    }

    public void setOperationTypeId(String operationTypeId) {
        this.operationTypeId = operationTypeId;
    }

    public String getRulesetDefValue() {
        return rulesetDefValue;
    }

    public void setRulesetDefValue(String rulesetDefValue) {
        this.rulesetDefValue = rulesetDefValue;
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

    public Timestamp getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Timestamp effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlatformRulesetsdefinitionsEntity that = (PlatformRulesetsdefinitionsEntity) o;

        if (rulesetDefinitionsId != null ? !rulesetDefinitionsId.equals(that.rulesetDefinitionsId) : that.rulesetDefinitionsId != null)
            return false;
        if (rulesetDefinitionName != null ? !rulesetDefinitionName.equals(that.rulesetDefinitionName) : that.rulesetDefinitionName != null)
            return false;
        if (ruleSetId != null ? !ruleSetId.equals(that.ruleSetId) : that.ruleSetId != null) return false;
        if (stepOrderId != null ? !stepOrderId.equals(that.stepOrderId) : that.stepOrderId != null) return false;
        if (operationTypeId != null ? !operationTypeId.equals(that.operationTypeId) : that.operationTypeId != null)
            return false;
        if (rulesetDefValue != null ? !rulesetDefValue.equals(that.rulesetDefValue) : that.rulesetDefValue != null)
            return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (effectiveDate != null ? !effectiveDate.equals(that.effectiveDate) : that.effectiveDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rulesetDefinitionsId != null ? rulesetDefinitionsId.hashCode() : 0;
        result = 31 * result + (rulesetDefinitionName != null ? rulesetDefinitionName.hashCode() : 0);
        result = 31 * result + (ruleSetId != null ? ruleSetId.hashCode() : 0);
        result = 31 * result + (stepOrderId != null ? stepOrderId.hashCode() : 0);
        result = 31 * result + (operationTypeId != null ? operationTypeId.hashCode() : 0);
        result = 31 * result + (rulesetDefValue != null ? rulesetDefValue.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (effectiveDate != null ? effectiveDate.hashCode() : 0);
        return result;
    }

    public PlatformRulesetsEntity getPlatformRulesetsByRuleSetId() {
        return platformRulesetsByRuleSetId;
    }

    public void setPlatformRulesetsByRuleSetId(PlatformRulesetsEntity platformRulesetsByRuleSetId) {
        this.platformRulesetsByRuleSetId = platformRulesetsByRuleSetId;
    }

    public RefdataOperationtypeEntity getRefdataOperationtypeByOperationTypeId() {
        return refdataOperationtypeByOperationTypeId;
    }

    public void setRefdataOperationtypeByOperationTypeId(RefdataOperationtypeEntity refdataOperationtypeByOperationTypeId) {
        this.refdataOperationtypeByOperationTypeId = refdataOperationtypeByOperationTypeId;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
