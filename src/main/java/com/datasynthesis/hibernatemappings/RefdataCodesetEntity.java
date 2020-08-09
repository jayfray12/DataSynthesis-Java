package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;
import java.util.Collection;

public class RefdataCodesetEntity {
    private long codeSetsId;
    private String codeSetName;
    private String industryStd;
    private Short statusId;
    private Timestamp createdDate;
    private String createdUser;
    private String codesetGuid;
    private String fieldMapping;
    private RefdataStatusEntity refdataStatusByStatusId;
    private Collection<RefdataCodesetvaluesEntity> refdataCodesetvaluesByCodeSetsId;

    public long getCodeSetsId() {
        return codeSetsId;
    }

    public void setCodeSetsId(long codeSetsId) {
        this.codeSetsId = codeSetsId;
    }

    public String getCodeSetName() {
        return codeSetName;
    }

    public void setCodeSetName(String codeSetName) {
        this.codeSetName = codeSetName;
    }

    public String getIndustryStd() {
        return industryStd;
    }

    public void setIndustryStd(String industryStd) {
        this.industryStd = industryStd;
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

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public String getCodesetGuid() {
        return codesetGuid;
    }

    public void setCodesetGuid(String codesetGuid) {
        this.codesetGuid = codesetGuid;
    }

    public String getFieldMapping() {
        return fieldMapping;
    }

    public void setFieldMapping(String fieldMapping) {
        this.fieldMapping = fieldMapping;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefdataCodesetEntity that = (RefdataCodesetEntity) o;

        if (codeSetsId != that.codeSetsId) return false;
        if (codeSetName != null ? !codeSetName.equals(that.codeSetName) : that.codeSetName != null) return false;
        if (industryStd != null ? !industryStd.equals(that.industryStd) : that.industryStd != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (codesetGuid != null ? !codesetGuid.equals(that.codesetGuid) : that.codesetGuid != null) return false;
        if (fieldMapping != null ? !fieldMapping.equals(that.fieldMapping) : that.fieldMapping != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (codeSetsId ^ (codeSetsId >>> 32));
        result = 31 * result + (codeSetName != null ? codeSetName.hashCode() : 0);
        result = 31 * result + (industryStd != null ? industryStd.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (codesetGuid != null ? codesetGuid.hashCode() : 0);
        result = 31 * result + (fieldMapping != null ? fieldMapping.hashCode() : 0);
        return result;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }

    public Collection<RefdataCodesetvaluesEntity> getRefdataCodesetvaluesByCodeSetsId() {
        return refdataCodesetvaluesByCodeSetsId;
    }

    public void setRefdataCodesetvaluesByCodeSetsId(Collection<RefdataCodesetvaluesEntity> refdataCodesetvaluesByCodeSetsId) {
        this.refdataCodesetvaluesByCodeSetsId = refdataCodesetvaluesByCodeSetsId;
    }
}
