package com.datasynthesis.ormmapping;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "map_delimiteddatamapdetailtovendordatamodel", schema = "datasynthesis", catalog = "")
public class MapDelimiteddatamapdetailtovendordatamodelEntity {
    private long delimitedDataMapToVendorDataMappingDetailId;
    private Long delimitedDataMapDetailId;
    private Long vendorDataMappingDetailId;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private RefdataStatusEntity refdataStatusByStatusId;

    @Id
    @Column(name = "DelimitedDataMapToVendorDataMappingDetailID", nullable = false)
    public long getDelimitedDataMapToVendorDataMappingDetailId() {
        return delimitedDataMapToVendorDataMappingDetailId;
    }

    public void setDelimitedDataMapToVendorDataMappingDetailId(long delimitedDataMapToVendorDataMappingDetailId) {
        this.delimitedDataMapToVendorDataMappingDetailId = delimitedDataMapToVendorDataMappingDetailId;
    }

    @Basic
    @Column(name = "DelimitedDataMapDetailID", nullable = true)
    public Long getDelimitedDataMapDetailId() {
        return delimitedDataMapDetailId;
    }

    public void setDelimitedDataMapDetailId(Long delimitedDataMapDetailId) {
        this.delimitedDataMapDetailId = delimitedDataMapDetailId;
    }

    @Basic
    @Column(name = "VendorDataMappingDetailID", nullable = true)
    public Long getVendorDataMappingDetailId() {
        return vendorDataMappingDetailId;
    }

    public void setVendorDataMappingDetailId(Long vendorDataMappingDetailId) {
        this.vendorDataMappingDetailId = vendorDataMappingDetailId;
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

    @Basic
    @Column(name = "CreatedUser", nullable = true, length = 20)
    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapDelimiteddatamapdetailtovendordatamodelEntity that = (MapDelimiteddatamapdetailtovendordatamodelEntity) o;

        if (delimitedDataMapToVendorDataMappingDetailId != that.delimitedDataMapToVendorDataMappingDetailId)
            return false;
        if (delimitedDataMapDetailId != null ? !delimitedDataMapDetailId.equals(that.delimitedDataMapDetailId) : that.delimitedDataMapDetailId != null)
            return false;
        if (vendorDataMappingDetailId != null ? !vendorDataMappingDetailId.equals(that.vendorDataMappingDetailId) : that.vendorDataMappingDetailId != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (delimitedDataMapToVendorDataMappingDetailId ^ (delimitedDataMapToVendorDataMappingDetailId >>> 32));
        result = 31 * result + (delimitedDataMapDetailId != null ? delimitedDataMapDetailId.hashCode() : 0);
        result = 31 * result + (vendorDataMappingDetailId != null ? vendorDataMappingDetailId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "StatusID", referencedColumnName = "StatusID", table = "map_delimiteddatamapdetailtovendordatamodel")
    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
