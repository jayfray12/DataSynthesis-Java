package com.redhat.idaas.datasynthesis.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "refdata_codesetvalues", schema = "datasynthesis", catalog = "")
public class RefdataCodesetvaluesEntity extends io.quarkus.hibernate.orm.panache.PanacheEntityBase {
    private long codeSetValueId;
    private String qtyValue;
    private String qtyValueDesc;
    private Timestamp createdDate;

    @Id
    @Column(name = "CodeSetValueID", nullable = false)
    public long getCodeSetValueId() {
        return codeSetValueId;
    }

    public void setCodeSetValueId(long codeSetValueId) {
        this.codeSetValueId = codeSetValueId;
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

        RefdataCodesetvaluesEntity that = (RefdataCodesetvaluesEntity) o;

        if (codeSetValueId != that.codeSetValueId) return false;
        if (qtyValue != null ? !qtyValue.equals(that.qtyValue) : that.qtyValue != null) return false;
        if (qtyValueDesc != null ? !qtyValueDesc.equals(that.qtyValueDesc) : that.qtyValueDesc != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (codeSetValueId ^ (codeSetValueId >>> 32));
        result = 31 * result + (qtyValue != null ? qtyValue.hashCode() : 0);
        result = 31 * result + (qtyValueDesc != null ? qtyValueDesc.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }
}
