package com.datasynthesis.ormmapping;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "map_delimiteddatamapdetailtocodesets", schema = "datasynthesis", catalog = "")
public class MapDelimiteddatamapdetailtocodesetsEntity {
    private long delimitedDataMapToCodesetsDataMappingDetailId;
    private Long delimitedDataMapDetailId;
    private Short codesetsId;
    private String fieldNumber;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private RefdataStatusEntity refdataStatusByStatusId;

    @Id
    @Column(name = "DelimitedDataMapToCodesetsDataMappingDetailID", nullable = false)
    public long getDelimitedDataMapToCodesetsDataMappingDetailId() {
        return delimitedDataMapToCodesetsDataMappingDetailId;
    }

    public void setDelimitedDataMapToCodesetsDataMappingDetailId(long delimitedDataMapToCodesetsDataMappingDetailId) {
        this.delimitedDataMapToCodesetsDataMappingDetailId = delimitedDataMapToCodesetsDataMappingDetailId;
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
    @Column(name = "CodesetsID", nullable = true)
    public Short getCodesetsId() {
        return codesetsId;
    }

    public void setCodesetsId(Short codesetsId) {
        this.codesetsId = codesetsId;
    }

    @Basic
    @Column(name = "FieldNumber", nullable = true, length = 25)
    public String getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(String fieldNumber) {
        this.fieldNumber = fieldNumber;
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

        MapDelimiteddatamapdetailtocodesetsEntity that = (MapDelimiteddatamapdetailtocodesetsEntity) o;

        if (delimitedDataMapToCodesetsDataMappingDetailId != that.delimitedDataMapToCodesetsDataMappingDetailId)
            return false;
        if (delimitedDataMapDetailId != null ? !delimitedDataMapDetailId.equals(that.delimitedDataMapDetailId) : that.delimitedDataMapDetailId != null)
            return false;
        if (codesetsId != null ? !codesetsId.equals(that.codesetsId) : that.codesetsId != null) return false;
        if (fieldNumber != null ? !fieldNumber.equals(that.fieldNumber) : that.fieldNumber != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (delimitedDataMapToCodesetsDataMappingDetailId ^ (delimitedDataMapToCodesetsDataMappingDetailId >>> 32));
        result = 31 * result + (delimitedDataMapDetailId != null ? delimitedDataMapDetailId.hashCode() : 0);
        result = 31 * result + (codesetsId != null ? codesetsId.hashCode() : 0);
        result = 31 * result + (fieldNumber != null ? fieldNumber.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "StatusID", referencedColumnName = "StatusID", table = "map_delimiteddatamapdetailtocodesets")
    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
