package com.datasynthesis.hibernatemappings;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "refdata_operationtype", schema = "datasynthesis", catalog = "")
public class RefdataOperationtypeEntity {
    private String operationTypeId;
    private String operationTypeName;
    private Timestamp createdDate;

    @Id
    @Column(name = "OperationTypeID", nullable = false, length = 7)
    public String getOperationTypeId() {
        return operationTypeId;
    }

    public void setOperationTypeId(String operationTypeId) {
        this.operationTypeId = operationTypeId;
    }

    @Basic
    @Column(name = "OperationTypeName", nullable = true, length = 60)
    public String getOperationTypeName() {
        return operationTypeName;
    }

    public void setOperationTypeName(String operationTypeName) {
        this.operationTypeName = operationTypeName;
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

        RefdataOperationtypeEntity that = (RefdataOperationtypeEntity) o;

        if (operationTypeId != null ? !operationTypeId.equals(that.operationTypeId) : that.operationTypeId != null)
            return false;
        if (operationTypeName != null ? !operationTypeName.equals(that.operationTypeName) : that.operationTypeName != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = operationTypeId != null ? operationTypeId.hashCode() : 0;
        result = 31 * result + (operationTypeName != null ? operationTypeName.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }
}
