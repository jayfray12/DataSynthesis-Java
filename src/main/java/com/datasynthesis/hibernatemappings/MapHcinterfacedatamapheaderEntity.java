package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class MapHcinterfacedatamapheaderEntity {
    private long hcInterfaceDataMapHeaderId;
    private String interfaceName;
    private String interfaceDesc;
    private Integer vendorId;
    private Integer applicationId;
    private String messageType;
    private String messageTrigger;
    private String messageVersion;
    private Integer organizationId;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private String hcInterfaceDataMapHeaderGuid;
    private String industryStd;
    private RefdataStatusEntity refdataStatusByStatusId;

    public long getHcInterfaceDataMapHeaderId() {
        return hcInterfaceDataMapHeaderId;
    }

    public void setHcInterfaceDataMapHeaderId(long hcInterfaceDataMapHeaderId) {
        this.hcInterfaceDataMapHeaderId = hcInterfaceDataMapHeaderId;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getInterfaceDesc() {
        return interfaceDesc;
    }

    public void setInterfaceDesc(String interfaceDesc) {
        this.interfaceDesc = interfaceDesc;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessageTrigger() {
        return messageTrigger;
    }

    public void setMessageTrigger(String messageTrigger) {
        this.messageTrigger = messageTrigger;
    }

    public String getMessageVersion() {
        return messageVersion;
    }

    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Short getStatusId() {
        return statusId;
    }

    public void setStatusId(Short statusId) {
        this.statusId = statusId;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public String getHcInterfaceDataMapHeaderGuid() {
        return hcInterfaceDataMapHeaderGuid;
    }

    public void setHcInterfaceDataMapHeaderGuid(String hcInterfaceDataMapHeaderGuid) {
        this.hcInterfaceDataMapHeaderGuid = hcInterfaceDataMapHeaderGuid;
    }

    public String getIndustryStd() {
        return industryStd;
    }

    public void setIndustryStd(String industryStd) {
        this.industryStd = industryStd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapHcinterfacedatamapheaderEntity that = (MapHcinterfacedatamapheaderEntity) o;

        if (hcInterfaceDataMapHeaderId != that.hcInterfaceDataMapHeaderId) return false;
        if (interfaceName != null ? !interfaceName.equals(that.interfaceName) : that.interfaceName != null)
            return false;
        if (interfaceDesc != null ? !interfaceDesc.equals(that.interfaceDesc) : that.interfaceDesc != null)
            return false;
        if (vendorId != null ? !vendorId.equals(that.vendorId) : that.vendorId != null) return false;
        if (applicationId != null ? !applicationId.equals(that.applicationId) : that.applicationId != null)
            return false;
        if (messageType != null ? !messageType.equals(that.messageType) : that.messageType != null) return false;
        if (messageTrigger != null ? !messageTrigger.equals(that.messageTrigger) : that.messageTrigger != null)
            return false;
        if (messageVersion != null ? !messageVersion.equals(that.messageVersion) : that.messageVersion != null)
            return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (hcInterfaceDataMapHeaderGuid != null ? !hcInterfaceDataMapHeaderGuid.equals(that.hcInterfaceDataMapHeaderGuid) : that.hcInterfaceDataMapHeaderGuid != null)
            return false;
        if (industryStd != null ? !industryStd.equals(that.industryStd) : that.industryStd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (hcInterfaceDataMapHeaderId ^ (hcInterfaceDataMapHeaderId >>> 32));
        result = 31 * result + (interfaceName != null ? interfaceName.hashCode() : 0);
        result = 31 * result + (interfaceDesc != null ? interfaceDesc.hashCode() : 0);
        result = 31 * result + (vendorId != null ? vendorId.hashCode() : 0);
        result = 31 * result + (applicationId != null ? applicationId.hashCode() : 0);
        result = 31 * result + (messageType != null ? messageType.hashCode() : 0);
        result = 31 * result + (messageTrigger != null ? messageTrigger.hashCode() : 0);
        result = 31 * result + (messageVersion != null ? messageVersion.hashCode() : 0);
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (hcInterfaceDataMapHeaderGuid != null ? hcInterfaceDataMapHeaderGuid.hashCode() : 0);
        result = 31 * result + (industryStd != null ? industryStd.hashCode() : 0);
        return result;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
