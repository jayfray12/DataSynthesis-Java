package com.datasynthesis.ormmapping;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Table(name = "refdata_addressformattype", schema = "datasynthesis", catalog = "")
public class RefdataAddressformattypeEntity {
    private short addressFormatTypeId;
    private String addressFormatTypeDesc;
    private Timestamp createdDate;
    private Short statusId;
    private Collection<DatageneratedAddressesEntity> datageneratedAddressesByAddressFormatTypeId;
    private RefdataStatusEntity refdataStatusByStatusId;

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

    @Basic
    @Column(name = "StatusId", nullable = true)
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

        RefdataAddressformattypeEntity that = (RefdataAddressformattypeEntity) o;

        if (addressFormatTypeId != that.addressFormatTypeId) return false;
        if (addressFormatTypeDesc != null ? !addressFormatTypeDesc.equals(that.addressFormatTypeDesc) : that.addressFormatTypeDesc != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) addressFormatTypeId;
        result = 31 * result + (addressFormatTypeDesc != null ? addressFormatTypeDesc.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "refdataAddressformattypeByAddressFormatTypeId")
    public Collection<DatageneratedAddressesEntity> getDatageneratedAddressesByAddressFormatTypeId() {
        return datageneratedAddressesByAddressFormatTypeId;
    }

    public void setDatageneratedAddressesByAddressFormatTypeId(Collection<DatageneratedAddressesEntity> datageneratedAddressesByAddressFormatTypeId) {
        this.datageneratedAddressesByAddressFormatTypeId = datageneratedAddressesByAddressFormatTypeId;
    }

    @ManyToOne
    @JoinColumn(name = "StatusId", referencedColumnName = "StatusID", table = "refdata_addressformattype")
    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
