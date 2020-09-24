package com.datasynthesis.hibernatemappings;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "platform_rulesetsdefinitions", schema = "datasynthesis", catalog = "")
public class PlatformRulesetsdefinitionsEntity {
    private String rulesetDefinitionsId;
    private String rulesetDefinitionName;
    private Short stepOrderId;
    private String rulesetDefValue;
    private Timestamp createdDate;
    private Timestamp effectiveDate;

    @Id
    @Column(name = "RulesetDefinitionsID", nullable = false, length = 38)
    public String getRulesetDefinitionsId() {
        return rulesetDefinitionsId;
    }

    public void setRulesetDefinitionsId(String rulesetDefinitionsId) {
        this.rulesetDefinitionsId = rulesetDefinitionsId;
    }

    @Basic
    @Column(name = "RulesetDefinitionName", nullable = true, length = 50)
    public String getRulesetDefinitionName() {
        return rulesetDefinitionName;
    }

    public void setRulesetDefinitionName(String rulesetDefinitionName) {
        this.rulesetDefinitionName = rulesetDefinitionName;
    }

    @Basic
    @Column(name = "StepOrderID", nullable = true)
    public Short getStepOrderId() {
        return stepOrderId;
    }

    public void setStepOrderId(Short stepOrderId) {
        this.stepOrderId = stepOrderId;
    }

    @Basic
    @Column(name = "RulesetDefValue", nullable = true, length = 40)
    public String getRulesetDefValue() {
        return rulesetDefValue;
    }

    public void setRulesetDefValue(String rulesetDefValue) {
        this.rulesetDefValue = rulesetDefValue;
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
    @Column(name = "EffectiveDate", nullable = true)
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
        if (stepOrderId != null ? !stepOrderId.equals(that.stepOrderId) : that.stepOrderId != null) return false;
        if (rulesetDefValue != null ? !rulesetDefValue.equals(that.rulesetDefValue) : that.rulesetDefValue != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (effectiveDate != null ? !effectiveDate.equals(that.effectiveDate) : that.effectiveDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rulesetDefinitionsId != null ? rulesetDefinitionsId.hashCode() : 0;
        result = 31 * result + (rulesetDefinitionName != null ? rulesetDefinitionName.hashCode() : 0);
        result = 31 * result + (stepOrderId != null ? stepOrderId.hashCode() : 0);
        result = 31 * result + (rulesetDefValue != null ? rulesetDefValue.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (effectiveDate != null ? effectiveDate.hashCode() : 0);
        return result;
    }
}
