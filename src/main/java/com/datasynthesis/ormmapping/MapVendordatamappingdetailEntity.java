package com.datasynthesis.ormmapping;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "map_vendordatamappingdetail", schema = "datasynthesis", catalog = "")
public class MapVendordatamappingdetailEntity {
    private long vendorDataMappingDetailId;
    private Short vendorDataMappingHeaderId;
    private String sourceDataMapDesc;
    private Integer applicationId;
    private String dbName;
    private String tableName;
    private String fieldNumber;
    private String fieldName;
    private String fieldDataType;
    private String fieldLength;
    private String compeleteFieldName;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private String vendorDataMappingDetailGuid;
    private RefdataStatusEntity refdataStatusByStatusId;

    @Id
    @Column(name = "VendorDataMappingDetailID", nullable = false)
    public long getVendorDataMappingDetailId() {
        return vendorDataMappingDetailId;
    }

    public void setVendorDataMappingDetailId(long vendorDataMappingDetailId) {
        this.vendorDataMappingDetailId = vendorDataMappingDetailId;
    }

    @Basic
    @Column(name = "VendorDataMappingHeaderID", nullable = true)
    public Short getVendorDataMappingHeaderId() {
        return vendorDataMappingHeaderId;
    }

    public void setVendorDataMappingHeaderId(Short vendorDataMappingHeaderId) {
        this.vendorDataMappingHeaderId = vendorDataMappingHeaderId;
    }

    @Basic
    @Column(name = "SourceDataMapDesc", nullable = true, length = 75)
    public String getSourceDataMapDesc() {
        return sourceDataMapDesc;
    }

    public void setSourceDataMapDesc(String sourceDataMapDesc) {
        this.sourceDataMapDesc = sourceDataMapDesc;
    }

    @Basic
    @Column(name = "ApplicationID", nullable = true)
    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    @Basic
    @Column(name = "DBName", nullable = true, length = 20)
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    @Basic
    @Column(name = "TableName", nullable = true, length = 30)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "FieldNumber", nullable = true, length = 10)
    public String getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(String fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    @Basic
    @Column(name = "FieldName", nullable = true, length = 50)
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Basic
    @Column(name = "FieldDataType", nullable = true, length = 10)
    public String getFieldDataType() {
        return fieldDataType;
    }

    public void setFieldDataType(String fieldDataType) {
        this.fieldDataType = fieldDataType;
    }

    @Basic
    @Column(name = "FieldLength", nullable = true, length = 10)
    public String getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(String fieldLength) {
        this.fieldLength = fieldLength;
    }

    @Basic
    @Column(name = "CompeleteFieldName", nullable = true, length = 102)
    public String getCompeleteFieldName() {
        return compeleteFieldName;
    }

    public void setCompeleteFieldName(String compeleteFieldName) {
        this.compeleteFieldName = compeleteFieldName;
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

    @Basic
    @Column(name = "VendorDataMappingDetailGUID", nullable = true, length = 38)
    public String getVendorDataMappingDetailGuid() {
        return vendorDataMappingDetailGuid;
    }

    public void setVendorDataMappingDetailGuid(String vendorDataMappingDetailGuid) {
        this.vendorDataMappingDetailGuid = vendorDataMappingDetailGuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapVendordatamappingdetailEntity that = (MapVendordatamappingdetailEntity) o;

        if (vendorDataMappingDetailId != that.vendorDataMappingDetailId) return false;
        if (vendorDataMappingHeaderId != null ? !vendorDataMappingHeaderId.equals(that.vendorDataMappingHeaderId) : that.vendorDataMappingHeaderId != null)
            return false;
        if (sourceDataMapDesc != null ? !sourceDataMapDesc.equals(that.sourceDataMapDesc) : that.sourceDataMapDesc != null)
            return false;
        if (applicationId != null ? !applicationId.equals(that.applicationId) : that.applicationId != null)
            return false;
        if (dbName != null ? !dbName.equals(that.dbName) : that.dbName != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (fieldNumber != null ? !fieldNumber.equals(that.fieldNumber) : that.fieldNumber != null) return false;
        if (fieldName != null ? !fieldName.equals(that.fieldName) : that.fieldName != null) return false;
        if (fieldDataType != null ? !fieldDataType.equals(that.fieldDataType) : that.fieldDataType != null)
            return false;
        if (fieldLength != null ? !fieldLength.equals(that.fieldLength) : that.fieldLength != null) return false;
        if (compeleteFieldName != null ? !compeleteFieldName.equals(that.compeleteFieldName) : that.compeleteFieldName != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (vendorDataMappingDetailGuid != null ? !vendorDataMappingDetailGuid.equals(that.vendorDataMappingDetailGuid) : that.vendorDataMappingDetailGuid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (vendorDataMappingDetailId ^ (vendorDataMappingDetailId >>> 32));
        result = 31 * result + (vendorDataMappingHeaderId != null ? vendorDataMappingHeaderId.hashCode() : 0);
        result = 31 * result + (sourceDataMapDesc != null ? sourceDataMapDesc.hashCode() : 0);
        result = 31 * result + (applicationId != null ? applicationId.hashCode() : 0);
        result = 31 * result + (dbName != null ? dbName.hashCode() : 0);
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (fieldNumber != null ? fieldNumber.hashCode() : 0);
        result = 31 * result + (fieldName != null ? fieldName.hashCode() : 0);
        result = 31 * result + (fieldDataType != null ? fieldDataType.hashCode() : 0);
        result = 31 * result + (fieldLength != null ? fieldLength.hashCode() : 0);
        result = 31 * result + (compeleteFieldName != null ? compeleteFieldName.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (vendorDataMappingDetailGuid != null ? vendorDataMappingDetailGuid.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "StatusID", referencedColumnName = "StatusID", table = "map_vendordatamappingdetail")
    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
