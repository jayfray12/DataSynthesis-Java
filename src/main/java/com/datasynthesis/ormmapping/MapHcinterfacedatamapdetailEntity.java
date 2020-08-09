package com.datasynthesis.ormmapping;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "map_hcinterfacedatamapdetail", schema = "datasynthesis", catalog = "")
public class MapHcinterfacedatamapdetailEntity {
    private long hcInterfaceDataMapDetailId;
    private Long interfaceDataMapHeaderId;
    private Short sourceApplicationId;
    private String vrsn;
    private String msgSegment;
    private String segmentFieldOrder;
    private String msgFieldNumber;
    private String msgFieldName;
    private String msgFieldLength;
    private String dataType;
    private Short sensitivityFlagId;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private String hcInterfaceDataMapDetailIguid;
    private RefdataStatusEntity refdataStatusByStatusId;

    @Id
    @Column(name = "HCInterfaceDataMapDetailID", nullable = false)
    public long getHcInterfaceDataMapDetailId() {
        return hcInterfaceDataMapDetailId;
    }

    public void setHcInterfaceDataMapDetailId(long hcInterfaceDataMapDetailId) {
        this.hcInterfaceDataMapDetailId = hcInterfaceDataMapDetailId;
    }

    @Basic
    @Column(name = "InterfaceDataMapHeaderID", nullable = true)
    public Long getInterfaceDataMapHeaderId() {
        return interfaceDataMapHeaderId;
    }

    public void setInterfaceDataMapHeaderId(Long interfaceDataMapHeaderId) {
        this.interfaceDataMapHeaderId = interfaceDataMapHeaderId;
    }

    @Basic
    @Column(name = "SourceApplicationID", nullable = true)
    public Short getSourceApplicationId() {
        return sourceApplicationId;
    }

    public void setSourceApplicationId(Short sourceApplicationId) {
        this.sourceApplicationId = sourceApplicationId;
    }

    @Basic
    @Column(name = "Vrsn", nullable = true, length = 7)
    public String getVrsn() {
        return vrsn;
    }

    public void setVrsn(String vrsn) {
        this.vrsn = vrsn;
    }

    @Basic
    @Column(name = "MsgSegment", nullable = true, length = 3)
    public String getMsgSegment() {
        return msgSegment;
    }

    public void setMsgSegment(String msgSegment) {
        this.msgSegment = msgSegment;
    }

    @Basic
    @Column(name = "SegmentFieldOrder", nullable = true, length = 8)
    public String getSegmentFieldOrder() {
        return segmentFieldOrder;
    }

    public void setSegmentFieldOrder(String segmentFieldOrder) {
        this.segmentFieldOrder = segmentFieldOrder;
    }

    @Basic
    @Column(name = "MsgFieldNumber", nullable = true, length = 7)
    public String getMsgFieldNumber() {
        return msgFieldNumber;
    }

    public void setMsgFieldNumber(String msgFieldNumber) {
        this.msgFieldNumber = msgFieldNumber;
    }

    @Basic
    @Column(name = "MsgFieldName", nullable = true, length = 154)
    public String getMsgFieldName() {
        return msgFieldName;
    }

    public void setMsgFieldName(String msgFieldName) {
        this.msgFieldName = msgFieldName;
    }

    @Basic
    @Column(name = "MsgFieldLength", nullable = true, length = 10)
    public String getMsgFieldLength() {
        return msgFieldLength;
    }

    public void setMsgFieldLength(String msgFieldLength) {
        this.msgFieldLength = msgFieldLength;
    }

    @Basic
    @Column(name = "DataType", nullable = true, length = 5)
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Basic
    @Column(name = "SensitivityFlagID", nullable = true)
    public Short getSensitivityFlagId() {
        return sensitivityFlagId;
    }

    public void setSensitivityFlagId(Short sensitivityFlagId) {
        this.sensitivityFlagId = sensitivityFlagId;
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
    @Column(name = "HCInterfaceDataMapDetailIGUID", nullable = true, length = 38)
    public String getHcInterfaceDataMapDetailIguid() {
        return hcInterfaceDataMapDetailIguid;
    }

    public void setHcInterfaceDataMapDetailIguid(String hcInterfaceDataMapDetailIguid) {
        this.hcInterfaceDataMapDetailIguid = hcInterfaceDataMapDetailIguid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapHcinterfacedatamapdetailEntity that = (MapHcinterfacedatamapdetailEntity) o;

        if (hcInterfaceDataMapDetailId != that.hcInterfaceDataMapDetailId) return false;
        if (interfaceDataMapHeaderId != null ? !interfaceDataMapHeaderId.equals(that.interfaceDataMapHeaderId) : that.interfaceDataMapHeaderId != null)
            return false;
        if (sourceApplicationId != null ? !sourceApplicationId.equals(that.sourceApplicationId) : that.sourceApplicationId != null)
            return false;
        if (vrsn != null ? !vrsn.equals(that.vrsn) : that.vrsn != null) return false;
        if (msgSegment != null ? !msgSegment.equals(that.msgSegment) : that.msgSegment != null) return false;
        if (segmentFieldOrder != null ? !segmentFieldOrder.equals(that.segmentFieldOrder) : that.segmentFieldOrder != null)
            return false;
        if (msgFieldNumber != null ? !msgFieldNumber.equals(that.msgFieldNumber) : that.msgFieldNumber != null)
            return false;
        if (msgFieldName != null ? !msgFieldName.equals(that.msgFieldName) : that.msgFieldName != null) return false;
        if (msgFieldLength != null ? !msgFieldLength.equals(that.msgFieldLength) : that.msgFieldLength != null)
            return false;
        if (dataType != null ? !dataType.equals(that.dataType) : that.dataType != null) return false;
        if (sensitivityFlagId != null ? !sensitivityFlagId.equals(that.sensitivityFlagId) : that.sensitivityFlagId != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (hcInterfaceDataMapDetailIguid != null ? !hcInterfaceDataMapDetailIguid.equals(that.hcInterfaceDataMapDetailIguid) : that.hcInterfaceDataMapDetailIguid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (hcInterfaceDataMapDetailId ^ (hcInterfaceDataMapDetailId >>> 32));
        result = 31 * result + (interfaceDataMapHeaderId != null ? interfaceDataMapHeaderId.hashCode() : 0);
        result = 31 * result + (sourceApplicationId != null ? sourceApplicationId.hashCode() : 0);
        result = 31 * result + (vrsn != null ? vrsn.hashCode() : 0);
        result = 31 * result + (msgSegment != null ? msgSegment.hashCode() : 0);
        result = 31 * result + (segmentFieldOrder != null ? segmentFieldOrder.hashCode() : 0);
        result = 31 * result + (msgFieldNumber != null ? msgFieldNumber.hashCode() : 0);
        result = 31 * result + (msgFieldName != null ? msgFieldName.hashCode() : 0);
        result = 31 * result + (msgFieldLength != null ? msgFieldLength.hashCode() : 0);
        result = 31 * result + (dataType != null ? dataType.hashCode() : 0);
        result = 31 * result + (sensitivityFlagId != null ? sensitivityFlagId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (hcInterfaceDataMapDetailIguid != null ? hcInterfaceDataMapDetailIguid.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "StatusID", referencedColumnName = "StatusID", table = "map_hcinterfacedatamapdetail")
    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
