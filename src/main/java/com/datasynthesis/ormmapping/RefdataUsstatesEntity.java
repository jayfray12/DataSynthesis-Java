package com.datasynthesis.ormmapping;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Table(name = "refdata_usstates", schema = "datasynthesis", catalog = "")
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

    @Id
    @Column(name = "StateID", nullable = false, length = 2)
    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    @Basic
    @Column(name = "StateDescription", nullable = true, length = 65)
    public String getStateDescription() {
        return stateDescription;
    }

    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
    }

    @Basic
    @Column(name = "Lattitude", nullable = true, length = 12)
    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    @Basic
    @Column(name = "Longitude", nullable = true, length = 12)
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
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

    @OneToMany(mappedBy = "refdataUsstatesByStateCode")
    public Collection<DataexistingAreacodeEntity> getDataexistingAreacodesByStateId() {
        return dataexistingAreacodesByStateId;
    }

    public void setDataexistingAreacodesByStateId(Collection<DataexistingAreacodeEntity> dataexistingAreacodesByStateId) {
        this.dataexistingAreacodesByStateId = dataexistingAreacodesByStateId;
    }

    @OneToMany(mappedBy = "refdataUsstatesByStateCode")
    public Collection<DatageneratedDriverslicensesEntity> getDatageneratedDriverslicensesByStateId() {
        return datageneratedDriverslicensesByStateId;
    }

    public void setDatageneratedDriverslicensesByStateId(Collection<DatageneratedDriverslicensesEntity> datageneratedDriverslicensesByStateId) {
        this.datageneratedDriverslicensesByStateId = datageneratedDriverslicensesByStateId;
    }

    @OneToMany(mappedBy = "refdataUsstatesByStateId")
    public Collection<RefdataOrganizationEntity> getRefdataOrganizationsByStateId() {
        return refdataOrganizationsByStateId;
    }

    public void setRefdataOrganizationsByStateId(Collection<RefdataOrganizationEntity> refdataOrganizationsByStateId) {
        this.refdataOrganizationsByStateId = refdataOrganizationsByStateId;
    }

    @ManyToOne
    @JoinColumn(name = "StatusID", referencedColumnName = "StatusID", table = "refdata_usstates")
    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
