package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class DatageneratedBankaccountEntity {
    private long bankAccountsId;
    private String bankAccountValue;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private String registeredApp;
    private RefdataStatusEntity refdataStatusByStatusId;

    public long getBankAccountsId() {
        return bankAccountsId;
    }

    public void setBankAccountsId(long bankAccountsId) {
        this.bankAccountsId = bankAccountsId;
    }

    public String getBankAccountValue() {
        return bankAccountValue;
    }

    public void setBankAccountValue(String bankAccountValue) {
        this.bankAccountValue = bankAccountValue;
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

        DatageneratedBankaccountEntity that = (DatageneratedBankaccountEntity) o;

        if (bankAccountsId != that.bankAccountsId) return false;
        if (bankAccountValue != null ? !bankAccountValue.equals(that.bankAccountValue) : that.bankAccountValue != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (registeredApp != null ? !registeredApp.equals(that.registeredApp) : that.registeredApp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (bankAccountsId ^ (bankAccountsId >>> 32));
        result = 31 * result + (bankAccountValue != null ? bankAccountValue.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (registeredApp != null ? registeredApp.hashCode() : 0);
        return result;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
