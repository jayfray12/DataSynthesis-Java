package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;
import java.util.Collection;

public class RefdataUsstatesEntity {
    private String stateId;
    private String stateDescription;
    private String lattitude;
    private String longitude;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private Collection<DataexistingAreacodeEntity> dataexistingAreacodesByStateId;
    private Collection<DatageneratedDriverslicensesEntity> datageneratedDriverslicensesByStateId;
    private Collection<RefdataOrganizationEntity> refdataOrganizationsByStateId;
    private RefdataStatusEntity refdataStatusByStatusId;

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getStateDescription() {
        return stateDescription;
    }

    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
    }

    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefdataUsstatesEntity that = (RefdataUsstatesEntity) o;

        if (stateId != null ? !stateId.equals(that.stateId) : that.stateId != null) return false;
        if (stateDescription != null ? !stateDescription.equals(that.stateDescription) : that.stateDescription != null)
            return false;
        if (lattitude != null ? !lattitude.equals(that.lattitude) : that.lattitude != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stateId != null ? stateId.hashCode() : 0;
        result = 31 * result + (stateDescription != null ? stateDescription.hashCode() : 0);
        result = 31 * result + (lattitude != null ? lattitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        return result;
    }

    public Collection<DataexistingAreacodeEntity> getDataexistingAreacodesByStateId() {
        return dataexistingAreacodesByStateId;
    }

    public void setDataexistingAreacodesByStateId(Collection<DataexistingAreacodeEntity> dataexistingAreacodesByStateId) {
        this.dataexistingAreacodesByStateId = dataexistingAreacodesByStateId;
    }

    public Collection<DatageneratedDriverslicensesEntity> getDatageneratedDriverslicensesByStateId() {
        return datageneratedDriverslicensesByStateId;
    }

    public void setDatageneratedDriverslicensesByStateId(Collection<DatageneratedDriverslicensesEntity> datageneratedDriverslicensesByStateId) {
        this.datageneratedDriverslicensesByStateId = datageneratedDriverslicensesByStateId;
    }

    public Collection<RefdataOrganizationEntity> getRefdataOrganizationsByStateId() {
        return refdataOrganizationsByStateId;
    }

    public void setRefdataOrganizationsByStateId(Collection<RefdataOrganizationEntity> refdataOrganizationsByStateId) {
        this.refdataOrganizationsByStateId = refdataOrganizationsByStateId;
    }

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
