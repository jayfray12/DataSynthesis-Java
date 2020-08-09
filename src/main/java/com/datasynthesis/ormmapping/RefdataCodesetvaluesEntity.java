package com.datasynthesis.ormmapping;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "refdata_codesetvalues", schema = "datasynthesis", catalog = "")
public class RefdataCodesetvaluesEntity {
    private long codeSetValueId;
    private Long codesetId;
    private String qtyValue;
    private String qtyValueDesc;
    private Long applicationId;
    private Timestamp createdDate;
    private Short statusId;
    private RefdataCodesetEntity refdataCodesetByCodesetId;
    private RefdataApplicationEntity refdataApplicationByApplicationId;
    private RefdataStatusEntity refdataStatusByStatusId;

    @Id
    @Column(name = "CodeSetValueID", nullable = false)
    public long getCodeSetValueId() {
        return codeSetValueId;
    }

    public void setCodeSetValueId(long codeSetValueId) {
        this.codeSetValueId = codeSetValueId;
    }

    @Basic
    @Column(name = "CodesetID", nullable = true)
    public Long getCodesetId() {
        return codesetId;
    }

    public void setCodesetId(Long codesetId) {
        this.codesetId = codesetId;
    }

    @Basic
    @Column(name = "QtyValue", nullable = true, length = 20)
    public String getQtyValue() {
        return qtyValue;
    }

    public void setQtyValue(String qtyValue) {
        this.qtyValue = qtyValue;
    }

    @Basic
    @Column(name = "QtyValueDesc", nullable = true, length = 20)
    public String getQtyValueDesc() {
        return qtyValueDesc;
    }

    public void setQtyValueDesc(String qtyValueDesc) {
        this.qtyValueDesc = qtyValueDesc;
    }

    @Basic
    @Column(name = "ApplicationID", nullable = true)
    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
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

        RefdataCodesetvaluesEntity that = (RefdataCodesetvaluesEntity) o;

        if (codeSetValueId != that.codeSetValueId) return false;
        if (codesetId != null ? !codesetId.equals(that.codesetId) : that.codesetId != null) return false;
        if (qtyValue != null ? !qtyValue.equals(that.qtyValue) : that.qtyValue != null) return false;
        if (qtyValueDesc != null ? !qtyValueDesc.equals(that.qtyValueDesc) : that.qtyValueDesc != null) return false;
        if (applicationId != null ? !applicationId.equals(that.applicationId) : that.applicationId != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (codeSetValueId ^ (codeSetValueId >>> 32));
        result = 31 * result + (codesetId != null ? codesetId.hashCode() : 0);
        result = 31 * result + (qtyValue != null ? qtyValue.hashCode() : 0);
        result = 31 * result + (qtyValueDesc != null ? qtyValueDesc.hashCode() : 0);
        result = 31 * result + (applicationId != null ? applicationId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CodesetID", referencedColumnName = "CodeSetsID", table = "refdata_codesetvalues")
    public RefdataCodesetEntity getRefdataCodesetByCodesetId() {
        return refdataCodesetByCodesetId;
    }

    public void setRefdataCodesetByCodesetId(RefdataCodesetEntity refdataCodesetByCodesetId) {
        this.refdataCodesetByCodesetId = refdataCodesetByCodesetId;
    }

    @ManyToOne
    @JoinColumn(name = "ApplicationID", referencedColumnName = "ApplicationID", table = "refdata_codesetvalues")
    public RefdataApplicationEntity getRefdataApplicationByApplicationId() {
        return refdataApplicationByApplicationId;
    }

    public void setRefdataApplicationByApplicationId(RefdataApplicationEntity refdataApplicationByApplicationId) {
        this.refdataApplicationByApplicationId = refdataApplicationByApplicationId;
    }

    @ManyToOne
    @JoinColumn(name = "StatusID", referencedColumnName = "StatusID", table = "refdata_codesetvalues")
    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
