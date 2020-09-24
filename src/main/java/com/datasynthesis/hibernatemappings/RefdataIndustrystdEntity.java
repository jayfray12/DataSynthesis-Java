package com.datasynthesis.hibernatemappings;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "refdata_industrystd", schema = "datasynthesis", catalog = "")
public class RefdataIndustrystdEntity {
    private String industryStd;
    private String industryStdDesc;
    private Timestamp createdDate;

    @Id
    @Column(name = "IndustryStd", nullable = false, length = 6)
    public String getIndustryStd() {
        return industryStd;
    }

    public void setIndustryStd(String industryStd) {
        this.industryStd = industryStd;
    }

    @Basic
    @Column(name = "IndustryStdDesc", nullable = true, length = 30)
    public String getIndustryStdDesc() {
        return industryStdDesc;
    }

    public void setIndustryStdDesc(String industryStdDesc) {
        this.industryStdDesc = industryStdDesc;
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

        RefdataIndustrystdEntity that = (RefdataIndustrystdEntity) o;

        if (industryStd != null ? !industryStd.equals(that.industryStd) : that.industryStd != null) return false;
        if (industryStdDesc != null ? !industryStdDesc.equals(that.industryStdDesc) : that.industryStdDesc != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = industryStd != null ? industryStd.hashCode() : 0;
        result = 31 * result + (industryStdDesc != null ? industryStdDesc.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }
}
