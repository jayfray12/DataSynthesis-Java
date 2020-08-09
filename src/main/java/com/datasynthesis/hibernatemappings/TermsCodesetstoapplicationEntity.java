package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;

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

    public long getCodeSetToApplicationId() {
        return codeSetToApplicationId;
    }

    public void setCodeSetToApplicationId(long codeSetToApplicationId) {
        this.codeSetToApplicationId = codeSetToApplicationId;
    }

    public long getCodeSetsId() {
        return codeSetsId;
    }

    public void setCodeSetsId(long codeSetsId) {
        this.codeSetsId = codeSetsId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIndustryStd() {
        return industryStd;
    }

    public void setIndustryStd(String industryStd) {
        this.industryStd = industryStd;
    }

    public String getSpecificDetails() {
        return specificDetails;
    }

    public void setSpecificDetails(String specificDetails) {
        this.specificDetails = specificDetails;
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

    public String getMessageTrigger() {
        return messageTrigger;
    }

    public void setMessageTrigger(String messageTrigger) {
        this.messageTrigger = messageTrigger;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

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

    public RefdataStatusEntity getRefdataStatusByStatusId() {
        return refdataStatusByStatusId;
    }

    public void setRefdataStatusByStatusId(RefdataStatusEntity refdataStatusByStatusId) {
        this.refdataStatusByStatusId = refdataStatusByStatusId;
    }
}
