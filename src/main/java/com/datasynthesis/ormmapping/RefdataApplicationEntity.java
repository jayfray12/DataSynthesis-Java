package com.datasynthesis.ormmapping;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Table(name = "refdata_application", schema = "datasynthesis", catalog = "")
public class RefdataApplicationEntity {
    private long applicationId;
    private String applicationCustomCode;
    private String applicationDesc;
    private String createdUser;
    private Timestamp createdDate;
    private Short statusId;
    private String appGuid;
    private Integer vendorId;
    private RefdataStatusEntity refdataStatusByStatusId;
    private RefdataVendorEntity refdataVendorByVendorId;
    private Collection<RefdataCodesetvaluesEntity> refdataCodesetvaluesByApplicationId;

    @Id
    @Column(name = "ApplicationID", nullable = false)
    public long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(long applicationId) {
        this.applicationId = applicationId;
    }

    @Basic
    @Column(name = "ApplicationCustomCode", nullable = true, length = 15)
    public String getApplicationCustomCode() {
        return applicationCustomCode;
    }

    public void setApplicationCustomCode(String applicationCustomCode) {
        this.applicationCustomCode = applicationCustomCode;
    }

    @Basic
    @Column(name = "ApplicationDesc", nullable = true, length = 50)
    public String getApplicationDesc() {
        return applicationDesc;
    }

    public void setApplicationDesc(String applicationDesc) {
        this.applicationDesc = applicationDesc;
    }

    @Basic
    @Column(name = "CreatedUser", nullable = true, length = 20)
    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
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
    @Column(name = "AppGUID", nullable = true, length = 38)
    public String getAppGuid() {
        return appGuid;
    }

    public void setAppGuid(String appGuid) {
        this.appGuid = appGuid;
    }

    @Basic
    @Column(name = "VendorID", nullable = true)
    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefdataApplicationEntity that = (RefdataApplicationEntity) o;

        if (applicationId != that.applicationId) return false;
        if (applicationCustomCode != null ? !applicationCustomCode.equals(that.applicationCustomCode) : that.applicationCustomCode != null)
            return false;
        if (applicationDesc != null ? !applicationDesc.equals(that.applicationDesc) : that.applicationDesc != null)
            return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (appGuid != null ? !appGuid.equals(that.appGuid) : that.appGuid != null) return false;
        if (vendorId != null ? !vendorId.equals(that.vendorId) : that.vendorId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (applicationId ^ (applicationId >>> 32));
        result = 31 * result + (applicationCustomCode != null ? applicationCustomCode.hashCode() : 0);
        result = 31 * result + (applicationDesc != null ? applicationDesc.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (appGuid != null ? appGuid.hashCode() : 0);
        result = 31 * result + (vendorId != null ? vendorId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "StatusID", referencedColumnName = "StatusID", table = "refdata_application")
    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }

    @ManyToOne
    @JoinColumn(name = "VendorID", referencedColumnName = "VendorID", table = "refdata_application")
    public RefdataVendorEntity getRefdataVendorByVendorId() {
        return refdataVendorByVendorId;
    }

    public void setRefdataVendorByVendorId(RefdataVendorEntity refdataVendorByVendorId) {
        this.refdataVendorByVendorId = refdataVendorByVendorId;
    }

    @OneToMany(mappedBy = "refdataApplicationByApplicationId")
    public Collection<RefdataCodesetvaluesEntity> getRefdataCodesetvaluesByApplicationId() {
        return refdataCodesetvaluesByApplicationId;
    }

    public void setRefdataCodesetvaluesByApplicationId(Collection<RefdataCodesetvaluesEntity> refdataCodesetvaluesByApplicationId) {
        this.refdataCodesetvaluesByApplicationId = refdataCodesetvaluesByApplicationId;
    }
}
