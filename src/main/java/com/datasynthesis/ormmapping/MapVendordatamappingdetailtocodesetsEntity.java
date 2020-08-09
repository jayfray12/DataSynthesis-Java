package com.datasynthesis.ormmapping;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "map_vendordatamappingdetailtocodesets", schema = "datasynthesis", catalog = "")
public class MapVendordatamappingdetailtocodesetsEntity {
    private long vendorDataMappingDetailToCodesetsId;
    private Long vendorDataMappingDetailId;
    private Short codesetsId;
    private Short statusId;
    private Timestamp createdDate;
    private String createdUser;
    private RefdataStatusEntity refdataStatusByStatusId;

    @Id
    @Column(name = "VendorDataMappingDetailToCodesetsID", nullable = false)
    public long getVendorDataMappingDetailToCodesetsId() {
        return vendorDataMappingDetailToCodesetsId;
    }

    public void setVendorDataMappingDetailToCodesetsId(long vendorDataMappingDetailToCodesetsId) {
        this.vendorDataMappingDetailToCodesetsId = vendorDataMappingDetailToCodesetsId;
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
    @Column(name = "CodesetsID", nullable = true)
    public Short getCodesetsId() {
        return codesetsId;
    }

    public void setCodesetsId(Short codesetsId) {
        this.codesetsId = codesetsId;
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
    @Column(name = "CreatedDate", nullable = true)
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
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

        MapVendordatamappingdetailtocodesetsEntity that = (MapVendordatamappingdetailtocodesetsEntity) o;

        if (vendorDataMappingDetailToCodesetsId != that.vendorDataMappingDetailToCodesetsId) return false;
        if (vendorDataMappingDetailId != null ? !vendorDataMappingDetailId.equals(that.vendorDataMappingDetailId) : that.vendorDataMappingDetailId != null)
            return false;
        if (codesetsId != null ? !codesetsId.equals(that.codesetsId) : that.codesetsId != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (vendorDataMappingDetailToCodesetsId ^ (vendorDataMappingDetailToCodesetsId >>> 32));
        result = 31 * result + (vendorDataMappingDetailId != null ? vendorDataMappingDetailId.hashCode() : 0);
        result = 31 * result + (codesetsId != null ? codesetsId.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "StatusID", referencedColumnName = "StatusID", table = "map_vendordatamappingdetailtocodesets")
    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
