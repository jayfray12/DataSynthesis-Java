package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class PlatformDatagenconfigEntity {
    private short dataGenConfigId;
    private String dataTypeGenConfigName;
    private Short dataAttributeId;
    private String specialInstructions;
    private Integer runQuantity;
    private Short minuteInterval;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private Long applicationId;
    private RefdataStatusEntity refdataStatusByStatusId;

    public short getDataGenConfigId() {
        return dataGenConfigId;
    }

    public void setDataGenConfigId(short dataGenConfigId) {
        this.dataGenConfigId = dataGenConfigId;
    }

    public String getDataTypeGenConfigName() {
        return dataTypeGenConfigName;
    }

    public void setDataTypeGenConfigName(String dataTypeGenConfigName) {
        this.dataTypeGenConfigName = dataTypeGenConfigName;
    }

    public Short getDataAttributeId() {
        return dataAttributeId;
    }

    public void setDataAttributeId(Short dataAttributeId) {
        this.dataAttributeId = dataAttributeId;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public Integer getRunQuantity() {
        return runQuantity;
    }

    public void setRunQuantity(Integer runQuantity) {
        this.runQuantity = runQuantity;
    }

    public Short getMinuteInterval() {
        return minuteInterval;
    }

    public void setMinuteInterval(Short minuteInterval) {
        this.minuteInterval = minuteInterval;
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

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlatformDatagenconfigEntity that = (PlatformDatagenconfigEntity) o;

        if (dataGenConfigId != that.dataGenConfigId) return false;
        if (dataTypeGenConfigName != null ? !dataTypeGenConfigName.equals(that.dataTypeGenConfigName) : that.dataTypeGenConfigName != null)
            return false;
        if (dataAttributeId != null ? !dataAttributeId.equals(that.dataAttributeId) : that.dataAttributeId != null)
            return false;
        if (specialInstructions != null ? !specialInstructions.equals(that.specialInstructions) : that.specialInstructions != null)
            return false;
        if (runQuantity != null ? !runQuantity.equals(that.runQuantity) : that.runQuantity != null) return false;
        if (minuteInterval != null ? !minuteInterval.equals(that.minuteInterval) : that.minuteInterval != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (applicationId != null ? !applicationId.equals(that.applicationId) : that.applicationId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) dataGenConfigId;
        result = 31 * result + (dataTypeGenConfigName != null ? dataTypeGenConfigName.hashCode() : 0);
        result = 31 * result + (dataAttributeId != null ? dataAttributeId.hashCode() : 0);
        result = 31 * result + (specialInstructions != null ? specialInstructions.hashCode() : 0);
        result = 31 * result + (runQuantity != null ? runQuantity.hashCode() : 0);
        result = 31 * result + (minuteInterval != null ? minuteInterval.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (applicationId != null ? applicationId.hashCode() : 0);
        return result;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
