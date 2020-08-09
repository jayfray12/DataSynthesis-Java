package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

public class DataexistingUpccodesEntity {
    private long upcCodeId;
    private String upcCodeName;
    private String upcProductName;
    private Timestamp createdDate;
    private Short statusId;
    private String registeredApp;
    private RefdataStatusEntity refdataStatusByStatusId;

    public long getUpcCodeId() {
        return upcCodeId;
    }

    public void setUpcCodeId(long upcCodeId) {
        this.upcCodeId = upcCodeId;
    }

    public String getUpcCodeName() {
        return upcCodeName;
    }

    public void setUpcCodeName(String upcCodeName) {
        this.upcCodeName = upcCodeName;
    }

    public String getUpcProductName() {
        return upcProductName;
    }

    public void setUpcProductName(String upcProductName) {
        this.upcProductName = upcProductName;
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

        DataexistingUpccodesEntity that = (DataexistingUpccodesEntity) o;

        if (upcCodeId != that.upcCodeId) return false;
        if (upcCodeName != null ? !upcCodeName.equals(that.upcCodeName) : that.upcCodeName != null) return false;
        if (upcProductName != null ? !upcProductName.equals(that.upcProductName) : that.upcProductName != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (registeredApp != null ? !registeredApp.equals(that.registeredApp) : that.registeredApp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (upcCodeId ^ (upcCodeId >>> 32));
        result = 31 * result + (upcCodeName != null ? upcCodeName.hashCode() : 0);
        result = 31 * result + (upcProductName != null ? upcProductName.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
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
}
