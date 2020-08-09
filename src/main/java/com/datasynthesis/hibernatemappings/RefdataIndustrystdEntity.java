package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class RefdataIndustrystdEntity {
    private String industryStd;
    private String industryStdDesc;
    private Timestamp createdDate;
    private Short statusId;
    private RefdataStatusEntity refdataStatusByStatusId;

    public String getIndustryStd() {
        return industryStd;
    }

    public void setIndustryStd(String industryStd) {
        this.industryStd = industryStd;
    }

    public String getIndustryStdDesc() {
        return industryStdDesc;
    }

    public void setIndustryStdDesc(String industryStdDesc) {
        this.industryStdDesc = industryStdDesc;
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

        RefdataIndustrystdEntity that = (RefdataIndustrystdEntity) o;

        if (industryStd != null ? !industryStd.equals(that.industryStd) : that.industryStd != null) return false;
        if (industryStdDesc != null ? !industryStdDesc.equals(that.industryStdDesc) : that.industryStdDesc != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = industryStd != null ? industryStd.hashCode() : 0;
        result = 31 * result + (industryStdDesc != null ? industryStdDesc.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        return result;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
