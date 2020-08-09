package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class DatageneratedAccountnumbersEntity {
    private long accountNumbersId;
    private String accountNumberValue;
    private Timestamp createdDate;
    private String createdUser;
    private Short statusId;
    private String registeredApp;
    private RefdataStatusEntity refdataStatusByStatusId;
    private RefdataStatusEntity refdataStatusByStatusId_0;

    public long getAccountNumbersId() {
        return accountNumbersId;
    }

    public void setAccountNumbersId(long accountNumbersId) {
        this.accountNumbersId = accountNumbersId;
    }

    public String getAccountNumberValue() {
        return accountNumberValue;
    }

    public void setAccountNumberValue(String accountNumberValue) {
        this.accountNumberValue = accountNumberValue;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Short getStatusId() {
        return statusId;
    }

    public void setStatusId(Short statusId) {
        this.statusId = statusId;
    }

    public String getRegisteredApp() {
        return registeredApp;
    }

    public void setRegisteredApp(String registeredApp) {
        this.registeredApp = registeredApp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DatageneratedAccountnumbersEntity that = (DatageneratedAccountnumbersEntity) o;

        if (accountNumbersId != that.accountNumbersId) return false;
        if (accountNumberValue != null ? !accountNumberValue.equals(that.accountNumberValue) : that.accountNumberValue != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (registeredApp != null ? !registeredApp.equals(that.registeredApp) : that.registeredApp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (accountNumbersId ^ (accountNumbersId >>> 32));
        result = 31 * result + (accountNumberValue != null ? accountNumberValue.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (registeredApp != null ? registeredApp.hashCode() : 0);
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
