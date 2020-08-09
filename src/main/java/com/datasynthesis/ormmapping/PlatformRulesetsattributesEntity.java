package com.datasynthesis.ormmapping;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "platform_rulesetsattributes", schema = "datasynthesis", catalog = "")
public class PlatformRulesetsattributesEntity {
    private long rulesetAttributeId;
    private String ruleSetAttributeDesc;
    private Timestamp createdDate;
    private Short statusId;
    private RefdataStatusEntity refdataStatusByStatusId;

    @Id
    @Column(name = "RulesetAttributeID", nullable = false)
    public long getRulesetAttributeId() {
        return rulesetAttributeId;
    }

    public void setRulesetAttributeId(long rulesetAttributeId) {
        this.rulesetAttributeId = rulesetAttributeId;
    }

    @Basic
    @Column(name = "RuleSetAttributeDesc", nullable = true, length = 75)
    public String getRuleSetAttributeDesc() {
        return ruleSetAttributeDesc;
    }

    public void setRuleSetAttributeDesc(String ruleSetAttributeDesc) {
        this.ruleSetAttributeDesc = ruleSetAttributeDesc;
    }

    @Basic
    @Column(name = "CreatedDate", nullable = false)
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "StatusID", nullable = true)
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

        PlatformRulesetsattributesEntity that = (PlatformRulesetsattributesEntity) o;

        if (rulesetAttributeId != that.rulesetAttributeId) return false;
        if (ruleSetAttributeDesc != null ? !ruleSetAttributeDesc.equals(that.ruleSetAttributeDesc) : that.ruleSetAttributeDesc != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (rulesetAttributeId ^ (rulesetAttributeId >>> 32));
        result = 31 * result + (ruleSetAttributeDesc != null ? ruleSetAttributeDesc.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "StatusID", referencedColumnName = "StatusID", table = "platform_rulesetsattributes")
    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
