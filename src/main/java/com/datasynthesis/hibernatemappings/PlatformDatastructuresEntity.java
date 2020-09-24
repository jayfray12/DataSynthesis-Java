package com.datasynthesis.hibernatemappings;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "platform_datastructures", schema = "datasynthesis", catalog = "")
public class PlatformDatastructuresEntity {
    private short platformDataStructuresId;
    private String dataStructureName;
    private Timestamp createdDate;
    private String createdUser;
    private String platformDataStructuresGuid;

    @Id
    @Column(name = "PlatformDataStructuresID", nullable = false)
    public short getPlatformDataStructuresId() {
        return platformDataStructuresId;
    }

    public void setPlatformDataStructuresId(short platformDataStructuresId) {
        this.platformDataStructuresId = platformDataStructuresId;
    }

    @Basic
    @Column(name = "DataStructureName", nullable = true, length = 50)
    public String getDataStructureName() {
        return dataStructureName;
    }

    public void setDataStructureName(String dataStructureName) {
        this.dataStructureName = dataStructureName;
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
    @Column(name = "CreatedUser", nullable = true, length = 20)
    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    @Basic
    @Column(name = "PlatformDataStructuresGUID", nullable = true, length = 38)
    public String getPlatformDataStructuresGuid() {
        return platformDataStructuresGuid;
    }

    public void setPlatformDataStructuresGuid(String platformDataStructuresGuid) {
        this.platformDataStructuresGuid = platformDataStructuresGuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlatformDatastructuresEntity that = (PlatformDatastructuresEntity) o;

        if (platformDataStructuresId != that.platformDataStructuresId) return false;
        if (dataStructureName != null ? !dataStructureName.equals(that.dataStructureName) : that.dataStructureName != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (platformDataStructuresGuid != null ? !platformDataStructuresGuid.equals(that.platformDataStructuresGuid) : that.platformDataStructuresGuid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) platformDataStructuresId;
        result = 31 * result + (dataStructureName != null ? dataStructureName.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (platformDataStructuresGuid != null ? platformDataStructuresGuid.hashCode() : 0);
        return result;
    }
}
