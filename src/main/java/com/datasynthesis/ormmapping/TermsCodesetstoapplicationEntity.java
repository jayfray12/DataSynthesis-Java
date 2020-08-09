package com.datasynthesis.ormmapping;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "terms_codesetstoapplication", schema = "datasynthesis", catalog = "")
public class TermsCodesetstoapplicationEntity {
    private long codeSetToApplicationId;
    private long codeSetsId;
    private String domain;
    private String industryStd;
    private String specificDetails;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private String messageTrigger;
    private Long organizationId;
    private Long applicationId;
    private Short vendorId;
    private RefdataStatusEntity refdataStatusByStatusId;

    @Id
    @Column(name = "CodeSetToApplicationID", nullable = false)
    public long getCodeSetToApplicationId() {
        return codeSetToApplicationId;
    }

    public void setCodeSetToApplicationId(long codeSetToApplicationId) {
        this.codeSetToApplicationId = codeSetToApplicationId;
    }

    @Basic
    @Column(name = "CodeSetsID", nullable = false)
    public long getCodeSetsId() {
        return codeSetsId;
    }

    public void setCodeSetsId(long codeSetsId) {
        this.codeSetsId = codeSetsId;
    }

    @Basic
    @Column(name = "Domain", nullable = true, length = 50)
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Basic
    @Column(name = "IndustryStd", nullable = true, length = 6)
    public String getIndustryStd() {
        return industryStd;
    }

    public void setIndustryStd(String industryStd) {
        this.industryStd = industryStd;
    }

    @Basic
    @Column(name = "SpecificDetails", nullable = true, length = 99)
    public String getSpecificDetails() {
        return specificDetails;
    }

    public void setSpecificDetails(String specificDetails) {
        this.specificDetails = specificDetails;
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

    @Basic
    @Column(name = "MessageTrigger", nullable = true, length = 4)
    public String getMessageTrigger() {
        return messageTrigger;
    }

    public void setMessageTrigger(String messageTrigger) {
        this.messageTrigger = messageTrigger;
    }

    @Basic
    @Column(name = "OrganizationID", nullable = true)
    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "ApplicationID", nullable = true)
    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    @Basic
    @Column(name = "VendorID", nullable = true)
    public Short getVendorId() {
        return vendorId;
    }

    public void setVendorId(Short vendorId) {
        this.vendorId = vendorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TermsCodesetstoapplicationEntity that = (TermsCodesetstoapplicationEntity) o;

        if (codeSetToApplicationId != that.codeSetToApplicationId) return false;
        if (codeSetsId != that.codeSetsId) return false;
        if (domain != null ? !domain.equals(that.domain) : that.domain != null) return false;
        if (industryStd != null ? !industryStd.equals(that.industryStd) : that.industryStd != null) return false;
        if (specificDetails != null ? !specificDetails.equals(that.specificDetails) : that.specificDetails != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (messageTrigger != null ? !messageTrigger.equals(that.messageTrigger) : that.messageTrigger != null)
            return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;
        if (applicationId != null ? !applicationId.equals(that.applicationId) : that.applicationId != null)
            return false;
        if (vendorId != null ? !vendorId.equals(that.vendorId) : that.vendorId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (codeSetToApplicationId ^ (codeSetToApplicationId >>> 32));
        result = 31 * result + (int) (codeSetsId ^ (codeSetsId >>> 32));
        result = 31 * result + (domain != null ? domain.hashCode() : 0);
        result = 31 * result + (industryStd != null ? industryStd.hashCode() : 0);
        result = 31 * result + (specificDetails != null ? specificDetails.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (messageTrigger != null ? messageTrigger.hashCode() : 0);
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (applicationId != null ? applicationId.hashCode() : 0);
        result = 31 * result + (vendorId != null ? vendorId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "StatusID", referencedColumnName = "StatusID", table = "terms_codesetstoapplication")
    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
