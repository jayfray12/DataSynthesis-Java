package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class DatabuiltPhonenumbersEntity {
    private long dataBuiltPhoneNumbersId;
    private String areaCode;
    private String phoneNumber;
    private String completePhoneNumber;
    private Timestamp createdDate;
    private Short statusId;
    private RefdataStatusEntity refdataStatusByStatusId;
    private RefdataStatusEntity refdataStatusByStatusId_0;

    public long getDataBuiltPhoneNumbersId() {
        return dataBuiltPhoneNumbersId;
    }

    public void setDataBuiltPhoneNumbersId(long dataBuiltPhoneNumbersId) {
        this.dataBuiltPhoneNumbersId = dataBuiltPhoneNumbersId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompletePhoneNumber() {
        return completePhoneNumber;
    }

    public void setCompletePhoneNumber(String completePhoneNumber) {
        this.completePhoneNumber = completePhoneNumber;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DatabuiltPhonenumbersEntity that = (DatabuiltPhonenumbersEntity) o;

        if (dataBuiltPhoneNumbersId != that.dataBuiltPhoneNumbersId) return false;
        if (areaCode != null ? !areaCode.equals(that.areaCode) : that.areaCode != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (completePhoneNumber != null ? !completePhoneNumber.equals(that.completePhoneNumber) : that.completePhoneNumber != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (dataBuiltPhoneNumbersId ^ (dataBuiltPhoneNumbersId >>> 32));
        result = 31 * result + (areaCode != null ? areaCode.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (completePhoneNumber != null ? completePhoneNumber.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        return result;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId_0() {
        return refdataStatusByStatusId_0;
    }

    public void setRefdataStatusByStatusId_0(RefdataStatusEntity refdataStatusByStatusId_0) {
        this.refdataStatusByStatusId_0 = refdataStatusByStatusId_0;
    }
}
