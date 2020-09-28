package com.redhat.idaas.datasynthesis.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "refdata_addressformattype", schema = "datasynthesis", catalog = "")
public class RefdataAddressformattypeEntity extends io.quarkus.hibernate.orm.panache.PanacheEntityBase {
    private short addressFormatTypeId;
    private String addressFormatTypeDesc;
    private Timestamp createdDate;

    @Id
    @Column(name = "AddressFormatTypeID", nullable = false)
    public short getAddressFormatTypeId() {
        return addressFormatTypeId;
    }

    public void setAddressFormatTypeId(short addressFormatTypeId) {
        this.addressFormatTypeId = addressFormatTypeId;
    }

    @Basic
    @Column(name = "AddressFormatTypeDesc", nullable = true, length = 35)
    public String getAddressFormatTypeDesc() {
        return addressFormatTypeDesc;
    }

    public void setAddressFormatTypeDesc(String addressFormatTypeDesc) {
        this.addressFormatTypeDesc = addressFormatTypeDesc;
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

        RefdataAddressformattypeEntity that = (RefdataAddressformattypeEntity) o;

        if (addressFormatTypeId != that.addressFormatTypeId) return false;
        if (addressFormatTypeDesc != null ? !addressFormatTypeDesc.equals(that.addressFormatTypeDesc) : that.addressFormatTypeDesc != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) addressFormatTypeId;
        result = 31 * result + (addressFormatTypeDesc != null ? addressFormatTypeDesc.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }
}
