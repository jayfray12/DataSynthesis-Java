package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class DatageneratedDriverslicensesEntity {
    private long driversLicensesId;
    private String dln;
    private String stateCode;
    private Timestamp createdDate;
    private Short statusId;
    private String completeDriversLicenseNumber;
    private String createdUser;
    private String registeredApp;
    private RefdataUsstatesEntity refdataUsstatesByStateCode;
    private RefdataStatusEntity refdataStatusByStatusId;

    public long getDriversLicensesId() {
        return driversLicensesId;
    }

    public void setDriversLicensesId(long driversLicensesId) {
        this.driversLicensesId = driversLicensesId;
    }

    public String getDln() {
        return dln;
    }

    public void setDln(String dln) {
        this.dln = dln;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
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

    public String getCompleteDriversLicenseNumber() {
        return completeDriversLicenseNumber;
    }

    public void setCompleteDriversLicenseNumber(String completeDriversLicenseNumber) {
        this.completeDriversLicenseNumber = completeDriversLicenseNumber;
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

        DatageneratedDriverslicensesEntity that = (DatageneratedDriverslicensesEntity) o;

        if (driversLicensesId != that.driversLicensesId) return false;
        if (dln != null ? !dln.equals(that.dln) : that.dln != null) return false;
        if (stateCode != null ? !stateCode.equals(that.stateCode) : that.stateCode != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (completeDriversLicenseNumber != null ? !completeDriversLicenseNumber.equals(that.completeDriversLicenseNumber) : that.completeDriversLicenseNumber != null)
            return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (registeredApp != null ? !registeredApp.equals(that.registeredApp) : that.registeredApp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (driversLicensesId ^ (driversLicensesId >>> 32));
        result = 31 * result + (dln != null ? dln.hashCode() : 0);
        result = 31 * result + (stateCode != null ? stateCode.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (completeDriversLicenseNumber != null ? completeDriversLicenseNumber.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (registeredApp != null ? registeredApp.hashCode() : 0);
        return result;
    }

    public RefdataUsstatesEntity getRefdataUsstatesByStateCode() {
        return refdataUsstatesByStateCode;
    }

    public void setRefdataUsstatesByStateCode(RefdataUsstatesEntity refdataUsstatesByStateCode) {
        this.refdataUsstatesByStateCode = refdataUsstatesByStateCode;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
