package com.datasynthesis.ormmapping;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Table(name = "refdata_status", schema = "datasynthesis", catalog = "")
public class RefdataStatusEntity {
    private short statusId;
    private String statusDescription;
    private Timestamp createdDate;
    private String createdUser;
    private Collection<AuditingDatarequestEntity> auditingDatarequestsByStatusId;
    private Collection<AuditingDatarequestdetailEntity> auditingDatarequestdetailsByStatusId;
    private Collection<DatabuiltAddressEntity> databuiltAddressesByStatusId;
    private Collection<DatabuiltNamesEntity> databuiltNamesByStatusId;
    private Collection<DatabuiltPhonenumbersEntity> databuiltPhonenumbersByStatusId;
    private Collection<DatabuiltPhonenumbersEntity> databuiltPhonenumbersByStatusId_0;
    private Collection<DataexistingAbabankingEntity> dataexistingAbabankingsByStatusId;
    private Collection<DataexistingAreacodeEntity> dataexistingAreacodesByStatusId;
    private Collection<DataexistingAreacodeintlEntity> dataexistingAreacodeintlsByStatusId;
    private Collection<DataexistingCompaniesEntity> dataexistingCompaniesByStatusId;
    private Collection<DataexistingNamefirstEntity> dataexistingNamefirstsByStatusId;
    private Collection<DataexistingNamelastEntity> dataexistingNamelastsByStatusId;
    private Collection<DataexistingUpccodesEntity> dataexistingUpccodesByStatusId;
    private Collection<DataexistingZipcodeintlEntity> dataexistingZipcodeintlsByStatusId;
    private Collection<DataexistingZipcodeusEntity> dataexistingZipcodeusesByStatusId;
    private Collection<DatageneratedAccountnumbersEntity> datageneratedAccountnumbersByStatusId;
    private Collection<DatageneratedAccountnumbersEntity> datageneratedAccountnumbersByStatusId_0;
    private Collection<DatageneratedAddressesEntity> datageneratedAddressesByStatusId;
    private Collection<DatageneratedBankaccountEntity> datageneratedBankaccountsByStatusId;
    private Collection<DatageneratedCreditcardEntity> datageneratedCreditcardsByStatusId;
    private Collection<DatageneratedDateofbirthEntity> datageneratedDateofbirthsByStatusId;
    private Collection<DatageneratedDriverslicensesEntity> datageneratedDriverslicensesByStatusId;
    private Collection<DatageneratedEinEntity> datageneratedEinsByStatusId;
    private Collection<DatageneratedPhonenumberEntity> datageneratedPhonenumbersByStatusId;
    private Collection<DatageneratedPhonenumbersintlEntity> datageneratedPhonenumbersintlsByStatusId;
    private Collection<DatageneratedSocialsecuritynumberEntity> datageneratedSocialsecuritynumbersByStatusId;
    private Collection<DatageneratedUseridentitiesEntity> datageneratedUseridentitiesByStatusId;
    private Collection<MapDelimiteddatamapdetailtocodesetsEntity> mapDelimiteddatamapdetailtocodesetsByStatusId;
    private Collection<MapDelimiteddatamapdetailtodataattributesEntity> mapDelimiteddatamapdetailtodataattributesByStatusId;
    private Collection<MapDelimiteddatamapdetailtovendordatamodelEntity> mapDelimiteddatamapdetailtovendordatamodelsByStatusId;
    private Collection<MapDelimiteddatamappingdetailEntity> mapDelimiteddatamappingdetailsByStatusId;
    private Collection<MapDelimiteddatamappingheaderEntity> mapDelimiteddatamappingheadersByStatusId;
    private Collection<MapHcinterfacedatamapdetailEntity> mapHcinterfacedatamapdetailsByStatusId;
    private Collection<MapHcinterfacedatamapdetailtocodesetsEntity> mapHcinterfacedatamapdetailtocodesetsByStatusId;
    private Collection<MapHcinterfacedatamapdetailtodataattributesEntity> mapHcinterfacedatamapdetailtodataattributesByStatusId;
    private Collection<MapHcinterfacedatamapdetailtovendordatamodelEntity> mapHcinterfacedatamapdetailtovendordatamodelsByStatusId;
    private Collection<MapHcinterfacedatamapheaderEntity> mapHcinterfacedatamapheadersByStatusId;
    private Collection<MapVendordatamappingdetailEntity> mapVendordatamappingdetailsByStatusId;
    private Collection<MapVendordatamappingdetailtocodesetsEntity> mapVendordatamappingdetailtocodesetsByStatusId;
    private Collection<MapVendordatamappingdetailtodataattributesEntity> mapVendordatamappingdetailtodataattributesByStatusId;
    private Collection<MapVendordatamappingheaderEntity> mapVendordatamappingheadersByStatusId;
    private Collection<PlatformAppsettingEntity> platformAppsettingsByStatusId;
    private Collection<PlatformDataattributesEntity> platformDataattributesByStatusId;
    private Collection<PlatformDatagenconfigEntity> platformDatagenconfigsByStatusId;
    private Collection<PlatformDatastructuresEntity> platformDatastructuresByStatusId;
    private Collection<PlatformDatastructurestodataattributesEntity> platformDatastructurestodataattributesByStatusId;
    private Collection<PlatformRulesetsEntity> platformRulesetsByStatusId;
    private Collection<PlatformRulesetsattributesEntity> platformRulesetsattributesByStatusId;
    private Collection<PlatformRulesetsdefinitionsEntity> platformRulesetsdefinitionsByStatusId;
    private Collection<RefdataAddressformattypeEntity> refdataAddressformattypesByStatusId;
    private Collection<RefdataApplicationEntity> refdataApplicationsByStatusId;
    private Collection<RefdataCodesetEntity> refdataCodesetsByStatusId;
    private Collection<RefdataCodesetvaluesEntity> refdataCodesetvaluesByStatusId;
    private Collection<RefdataCountriesEntity> refdataCountriesByStatusId;
    private Collection<RefdataIndustrystdEntity> refdataIndustrystdsByStatusId;
    private Collection<RefdataOrganizationEntity> refdataOrganizationsByStatusId;
    private Collection<RefdataTimezonesEntity> refdataTimezonesByStatusId;
    private Collection<RefdataUsstatesEntity> refdataUsstatesByStatusId;
    private Collection<RefdataVendorEntity> refdataVendorsByStatusId;
    private Collection<TermsCodesetstoapplicationEntity> termsCodesetstoapplicationsByStatusId;

    @Id
    @Column(name = "StatusID", nullable = false)
    public short getStatusId() {
        return statusId;
    }

    public void setStatusId(short statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "StatusDescription", nullable = false, length = 45)
    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefdataStatusEntity that = (RefdataStatusEntity) o;

        if (statusId != that.statusId) return false;
        if (statusDescription != null ? !statusDescription.equals(that.statusDescription) : that.statusDescription != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) statusId;
        result = 31 * result + (statusDescription != null ? statusDescription.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<AuditingDatarequestEntity> getAuditingDatarequestsByStatusId() {
        return auditingDatarequestsByStatusId;
    }

    public void setAuditingDatarequestsByStatusId(Collection<AuditingDatarequestEntity> auditingDatarequestsByStatusId) {
        this.auditingDatarequestsByStatusId = auditingDatarequestsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<AuditingDatarequestdetailEntity> getAuditingDatarequestdetailsByStatusId() {
        return auditingDatarequestdetailsByStatusId;
    }

    public void setAuditingDatarequestdetailsByStatusId(Collection<AuditingDatarequestdetailEntity> auditingDatarequestdetailsByStatusId) {
        this.auditingDatarequestdetailsByStatusId = auditingDatarequestdetailsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DatabuiltAddressEntity> getDatabuiltAddressesByStatusId() {
        return databuiltAddressesByStatusId;
    }

    public void setDatabuiltAddressesByStatusId(Collection<DatabuiltAddressEntity> databuiltAddressesByStatusId) {
        this.databuiltAddressesByStatusId = databuiltAddressesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DatabuiltNamesEntity> getDatabuiltNamesByStatusId() {
        return databuiltNamesByStatusId;
    }

    public void setDatabuiltNamesByStatusId(Collection<DatabuiltNamesEntity> databuiltNamesByStatusId) {
        this.databuiltNamesByStatusId = databuiltNamesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DatabuiltPhonenumbersEntity> getDatabuiltPhonenumbersByStatusId() {
        return databuiltPhonenumbersByStatusId;
    }

    public void setDatabuiltPhonenumbersByStatusId(Collection<DatabuiltPhonenumbersEntity> databuiltPhonenumbersByStatusId) {
        this.databuiltPhonenumbersByStatusId = databuiltPhonenumbersByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId_0")
    public Collection<DatabuiltPhonenumbersEntity> getDatabuiltPhonenumbersByStatusId_0() {
        return databuiltPhonenumbersByStatusId_0;
    }

    public void setDatabuiltPhonenumbersByStatusId_0(Collection<DatabuiltPhonenumbersEntity> databuiltPhonenumbersByStatusId_0) {
        this.databuiltPhonenumbersByStatusId_0 = databuiltPhonenumbersByStatusId_0;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DataexistingAbabankingEntity> getDataexistingAbabankingsByStatusId() {
        return dataexistingAbabankingsByStatusId;
    }

    public void setDataexistingAbabankingsByStatusId(Collection<DataexistingAbabankingEntity> dataexistingAbabankingsByStatusId) {
        this.dataexistingAbabankingsByStatusId = dataexistingAbabankingsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DataexistingAreacodeEntity> getDataexistingAreacodesByStatusId() {
        return dataexistingAreacodesByStatusId;
    }

    public void setDataexistingAreacodesByStatusId(Collection<DataexistingAreacodeEntity> dataexistingAreacodesByStatusId) {
        this.dataexistingAreacodesByStatusId = dataexistingAreacodesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DataexistingAreacodeintlEntity> getDataexistingAreacodeintlsByStatusId() {
        return dataexistingAreacodeintlsByStatusId;
    }

    public void setDataexistingAreacodeintlsByStatusId(Collection<DataexistingAreacodeintlEntity> dataexistingAreacodeintlsByStatusId) {
        this.dataexistingAreacodeintlsByStatusId = dataexistingAreacodeintlsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DataexistingCompaniesEntity> getDataexistingCompaniesByStatusId() {
        return dataexistingCompaniesByStatusId;
    }

    public void setDataexistingCompaniesByStatusId(Collection<DataexistingCompaniesEntity> dataexistingCompaniesByStatusId) {
        this.dataexistingCompaniesByStatusId = dataexistingCompaniesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DataexistingNamefirstEntity> getDataexistingNamefirstsByStatusId() {
        return dataexistingNamefirstsByStatusId;
    }

    public void setDataexistingNamefirstsByStatusId(Collection<DataexistingNamefirstEntity> dataexistingNamefirstsByStatusId) {
        this.dataexistingNamefirstsByStatusId = dataexistingNamefirstsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DataexistingNamelastEntity> getDataexistingNamelastsByStatusId() {
        return dataexistingNamelastsByStatusId;
    }

    public void setDataexistingNamelastsByStatusId(Collection<DataexistingNamelastEntity> dataexistingNamelastsByStatusId) {
        this.dataexistingNamelastsByStatusId = dataexistingNamelastsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DataexistingUpccodesEntity> getDataexistingUpccodesByStatusId() {
        return dataexistingUpccodesByStatusId;
    }

    public void setDataexistingUpccodesByStatusId(Collection<DataexistingUpccodesEntity> dataexistingUpccodesByStatusId) {
        this.dataexistingUpccodesByStatusId = dataexistingUpccodesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DataexistingZipcodeintlEntity> getDataexistingZipcodeintlsByStatusId() {
        return dataexistingZipcodeintlsByStatusId;
    }

    public void setDataexistingZipcodeintlsByStatusId(Collection<DataexistingZipcodeintlEntity> dataexistingZipcodeintlsByStatusId) {
        this.dataexistingZipcodeintlsByStatusId = dataexistingZipcodeintlsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DataexistingZipcodeusEntity> getDataexistingZipcodeusesByStatusId() {
        return dataexistingZipcodeusesByStatusId;
    }

    public void setDataexistingZipcodeusesByStatusId(Collection<DataexistingZipcodeusEntity> dataexistingZipcodeusesByStatusId) {
        this.dataexistingZipcodeusesByStatusId = dataexistingZipcodeusesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DatageneratedAccountnumbersEntity> getDatageneratedAccountnumbersByStatusId() {
        return datageneratedAccountnumbersByStatusId;
    }

    public void setDatageneratedAccountnumbersByStatusId(Collection<DatageneratedAccountnumbersEntity> datageneratedAccountnumbersByStatusId) {
        this.datageneratedAccountnumbersByStatusId = datageneratedAccountnumbersByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId_0")
    public Collection<DatageneratedAccountnumbersEntity> getDatageneratedAccountnumbersByStatusId_0() {
        return datageneratedAccountnumbersByStatusId_0;
    }

    public void setDatageneratedAccountnumbersByStatusId_0(Collection<DatageneratedAccountnumbersEntity> datageneratedAccountnumbersByStatusId_0) {
        this.datageneratedAccountnumbersByStatusId_0 = datageneratedAccountnumbersByStatusId_0;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DatageneratedAddressesEntity> getDatageneratedAddressesByStatusId() {
        return datageneratedAddressesByStatusId;
    }

    public void setDatageneratedAddressesByStatusId(Collection<DatageneratedAddressesEntity> datageneratedAddressesByStatusId) {
        this.datageneratedAddressesByStatusId = datageneratedAddressesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DatageneratedBankaccountEntity> getDatageneratedBankaccountsByStatusId() {
        return datageneratedBankaccountsByStatusId;
    }

    public void setDatageneratedBankaccountsByStatusId(Collection<DatageneratedBankaccountEntity> datageneratedBankaccountsByStatusId) {
        this.datageneratedBankaccountsByStatusId = datageneratedBankaccountsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DatageneratedCreditcardEntity> getDatageneratedCreditcardsByStatusId() {
        return datageneratedCreditcardsByStatusId;
    }

    public void setDatageneratedCreditcardsByStatusId(Collection<DatageneratedCreditcardEntity> datageneratedCreditcardsByStatusId) {
        this.datageneratedCreditcardsByStatusId = datageneratedCreditcardsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DatageneratedDateofbirthEntity> getDatageneratedDateofbirthsByStatusId() {
        return datageneratedDateofbirthsByStatusId;
    }

    public void setDatageneratedDateofbirthsByStatusId(Collection<DatageneratedDateofbirthEntity> datageneratedDateofbirthsByStatusId) {
        this.datageneratedDateofbirthsByStatusId = datageneratedDateofbirthsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DatageneratedDriverslicensesEntity> getDatageneratedDriverslicensesByStatusId() {
        return datageneratedDriverslicensesByStatusId;
    }

    public void setDatageneratedDriverslicensesByStatusId(Collection<DatageneratedDriverslicensesEntity> datageneratedDriverslicensesByStatusId) {
        this.datageneratedDriverslicensesByStatusId = datageneratedDriverslicensesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DatageneratedEinEntity> getDatageneratedEinsByStatusId() {
        return datageneratedEinsByStatusId;
    }

    public void setDatageneratedEinsByStatusId(Collection<DatageneratedEinEntity> datageneratedEinsByStatusId) {
        this.datageneratedEinsByStatusId = datageneratedEinsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DatageneratedPhonenumberEntity> getDatageneratedPhonenumbersByStatusId() {
        return datageneratedPhonenumbersByStatusId;
    }

    public void setDatageneratedPhonenumbersByStatusId(Collection<DatageneratedPhonenumberEntity> datageneratedPhonenumbersByStatusId) {
        this.datageneratedPhonenumbersByStatusId = datageneratedPhonenumbersByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DatageneratedPhonenumbersintlEntity> getDatageneratedPhonenumbersintlsByStatusId() {
        return datageneratedPhonenumbersintlsByStatusId;
    }

    public void setDatageneratedPhonenumbersintlsByStatusId(Collection<DatageneratedPhonenumbersintlEntity> datageneratedPhonenumbersintlsByStatusId) {
        this.datageneratedPhonenumbersintlsByStatusId = datageneratedPhonenumbersintlsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DatageneratedSocialsecuritynumberEntity> getDatageneratedSocialsecuritynumbersByStatusId() {
        return datageneratedSocialsecuritynumbersByStatusId;
    }

    public void setDatageneratedSocialsecuritynumbersByStatusId(Collection<DatageneratedSocialsecuritynumberEntity> datageneratedSocialsecuritynumbersByStatusId) {
        this.datageneratedSocialsecuritynumbersByStatusId = datageneratedSocialsecuritynumbersByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<DatageneratedUseridentitiesEntity> getDatageneratedUseridentitiesByStatusId() {
        return datageneratedUseridentitiesByStatusId;
    }

    public void setDatageneratedUseridentitiesByStatusId(Collection<DatageneratedUseridentitiesEntity> datageneratedUseridentitiesByStatusId) {
        this.datageneratedUseridentitiesByStatusId = datageneratedUseridentitiesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<MapDelimiteddatamapdetailtocodesetsEntity> getMapDelimiteddatamapdetailtocodesetsByStatusId() {
        return mapDelimiteddatamapdetailtocodesetsByStatusId;
    }

    public void setMapDelimiteddatamapdetailtocodesetsByStatusId(Collection<MapDelimiteddatamapdetailtocodesetsEntity> mapDelimiteddatamapdetailtocodesetsByStatusId) {
        this.mapDelimiteddatamapdetailtocodesetsByStatusId = mapDelimiteddatamapdetailtocodesetsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<MapDelimiteddatamapdetailtodataattributesEntity> getMapDelimiteddatamapdetailtodataattributesByStatusId() {
        return mapDelimiteddatamapdetailtodataattributesByStatusId;
    }

    public void setMapDelimiteddatamapdetailtodataattributesByStatusId(Collection<MapDelimiteddatamapdetailtodataattributesEntity> mapDelimiteddatamapdetailtodataattributesByStatusId) {
        this.mapDelimiteddatamapdetailtodataattributesByStatusId = mapDelimiteddatamapdetailtodataattributesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<MapDelimiteddatamapdetailtovendordatamodelEntity> getMapDelimiteddatamapdetailtovendordatamodelsByStatusId() {
        return mapDelimiteddatamapdetailtovendordatamodelsByStatusId;
    }

    public void setMapDelimiteddatamapdetailtovendordatamodelsByStatusId(Collection<MapDelimiteddatamapdetailtovendordatamodelEntity> mapDelimiteddatamapdetailtovendordatamodelsByStatusId) {
        this.mapDelimiteddatamapdetailtovendordatamodelsByStatusId = mapDelimiteddatamapdetailtovendordatamodelsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<MapDelimiteddatamappingdetailEntity> getMapDelimiteddatamappingdetailsByStatusId() {
        return mapDelimiteddatamappingdetailsByStatusId;
    }

    public void setMapDelimiteddatamappingdetailsByStatusId(Collection<MapDelimiteddatamappingdetailEntity> mapDelimiteddatamappingdetailsByStatusId) {
        this.mapDelimiteddatamappingdetailsByStatusId = mapDelimiteddatamappingdetailsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<MapDelimiteddatamappingheaderEntity> getMapDelimiteddatamappingheadersByStatusId() {
        return mapDelimiteddatamappingheadersByStatusId;
    }

    public void setMapDelimiteddatamappingheadersByStatusId(Collection<MapDelimiteddatamappingheaderEntity> mapDelimiteddatamappingheadersByStatusId) {
        this.mapDelimiteddatamappingheadersByStatusId = mapDelimiteddatamappingheadersByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<MapHcinterfacedatamapdetailEntity> getMapHcinterfacedatamapdetailsByStatusId() {
        return mapHcinterfacedatamapdetailsByStatusId;
    }

    public void setMapHcinterfacedatamapdetailsByStatusId(Collection<MapHcinterfacedatamapdetailEntity> mapHcinterfacedatamapdetailsByStatusId) {
        this.mapHcinterfacedatamapdetailsByStatusId = mapHcinterfacedatamapdetailsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<MapHcinterfacedatamapdetailtocodesetsEntity> getMapHcinterfacedatamapdetailtocodesetsByStatusId() {
        return mapHcinterfacedatamapdetailtocodesetsByStatusId;
    }

    public void setMapHcinterfacedatamapdetailtocodesetsByStatusId(Collection<MapHcinterfacedatamapdetailtocodesetsEntity> mapHcinterfacedatamapdetailtocodesetsByStatusId) {
        this.mapHcinterfacedatamapdetailtocodesetsByStatusId = mapHcinterfacedatamapdetailtocodesetsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<MapHcinterfacedatamapdetailtodataattributesEntity> getMapHcinterfacedatamapdetailtodataattributesByStatusId() {
        return mapHcinterfacedatamapdetailtodataattributesByStatusId;
    }

    public void setMapHcinterfacedatamapdetailtodataattributesByStatusId(Collection<MapHcinterfacedatamapdetailtodataattributesEntity> mapHcinterfacedatamapdetailtodataattributesByStatusId) {
        this.mapHcinterfacedatamapdetailtodataattributesByStatusId = mapHcinterfacedatamapdetailtodataattributesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<MapHcinterfacedatamapdetailtovendordatamodelEntity> getMapHcinterfacedatamapdetailtovendordatamodelsByStatusId() {
        return mapHcinterfacedatamapdetailtovendordatamodelsByStatusId;
    }

    public void setMapHcinterfacedatamapdetailtovendordatamodelsByStatusId(Collection<MapHcinterfacedatamapdetailtovendordatamodelEntity> mapHcinterfacedatamapdetailtovendordatamodelsByStatusId) {
        this.mapHcinterfacedatamapdetailtovendordatamodelsByStatusId = mapHcinterfacedatamapdetailtovendordatamodelsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<MapHcinterfacedatamapheaderEntity> getMapHcinterfacedatamapheadersByStatusId() {
        return mapHcinterfacedatamapheadersByStatusId;
    }

    public void setMapHcinterfacedatamapheadersByStatusId(Collection<MapHcinterfacedatamapheaderEntity> mapHcinterfacedatamapheadersByStatusId) {
        this.mapHcinterfacedatamapheadersByStatusId = mapHcinterfacedatamapheadersByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<MapVendordatamappingdetailEntity> getMapVendordatamappingdetailsByStatusId() {
        return mapVendordatamappingdetailsByStatusId;
    }

    public void setMapVendordatamappingdetailsByStatusId(Collection<MapVendordatamappingdetailEntity> mapVendordatamappingdetailsByStatusId) {
        this.mapVendordatamappingdetailsByStatusId = mapVendordatamappingdetailsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<MapVendordatamappingdetailtocodesetsEntity> getMapVendordatamappingdetailtocodesetsByStatusId() {
        return mapVendordatamappingdetailtocodesetsByStatusId;
    }

    public void setMapVendordatamappingdetailtocodesetsByStatusId(Collection<MapVendordatamappingdetailtocodesetsEntity> mapVendordatamappingdetailtocodesetsByStatusId) {
        this.mapVendordatamappingdetailtocodesetsByStatusId = mapVendordatamappingdetailtocodesetsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<MapVendordatamappingdetailtodataattributesEntity> getMapVendordatamappingdetailtodataattributesByStatusId() {
        return mapVendordatamappingdetailtodataattributesByStatusId;
    }

    public void setMapVendordatamappingdetailtodataattributesByStatusId(Collection<MapVendordatamappingdetailtodataattributesEntity> mapVendordatamappingdetailtodataattributesByStatusId) {
        this.mapVendordatamappingdetailtodataattributesByStatusId = mapVendordatamappingdetailtodataattributesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<MapVendordatamappingheaderEntity> getMapVendordatamappingheadersByStatusId() {
        return mapVendordatamappingheadersByStatusId;
    }

    public void setMapVendordatamappingheadersByStatusId(Collection<MapVendordatamappingheaderEntity> mapVendordatamappingheadersByStatusId) {
        this.mapVendordatamappingheadersByStatusId = mapVendordatamappingheadersByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<PlatformAppsettingEntity> getPlatformAppsettingsByStatusId() {
        return platformAppsettingsByStatusId;
    }

    public void setPlatformAppsettingsByStatusId(Collection<PlatformAppsettingEntity> platformAppsettingsByStatusId) {
        this.platformAppsettingsByStatusId = platformAppsettingsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<PlatformDataattributesEntity> getPlatformDataattributesByStatusId() {
        return platformDataattributesByStatusId;
    }

    public void setPlatformDataattributesByStatusId(Collection<PlatformDataattributesEntity> platformDataattributesByStatusId) {
        this.platformDataattributesByStatusId = platformDataattributesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<PlatformDatagenconfigEntity> getPlatformDatagenconfigsByStatusId() {
        return platformDatagenconfigsByStatusId;
    }

    public void setPlatformDatagenconfigsByStatusId(Collection<PlatformDatagenconfigEntity> platformDatagenconfigsByStatusId) {
        this.platformDatagenconfigsByStatusId = platformDatagenconfigsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<PlatformDatastructuresEntity> getPlatformDatastructuresByStatusId() {
        return platformDatastructuresByStatusId;
    }

    public void setPlatformDatastructuresByStatusId(Collection<PlatformDatastructuresEntity> platformDatastructuresByStatusId) {
        this.platformDatastructuresByStatusId = platformDatastructuresByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<PlatformDatastructurestodataattributesEntity> getPlatformDatastructurestodataattributesByStatusId() {
        return platformDatastructurestodataattributesByStatusId;
    }

    public void setPlatformDatastructurestodataattributesByStatusId(Collection<PlatformDatastructurestodataattributesEntity> platformDatastructurestodataattributesByStatusId) {
        this.platformDatastructurestodataattributesByStatusId = platformDatastructurestodataattributesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<PlatformRulesetsEntity> getPlatformRulesetsByStatusId() {
        return platformRulesetsByStatusId;
    }

    public void setPlatformRulesetsByStatusId(Collection<PlatformRulesetsEntity> platformRulesetsByStatusId) {
        this.platformRulesetsByStatusId = platformRulesetsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<PlatformRulesetsattributesEntity> getPlatformRulesetsattributesByStatusId() {
        return platformRulesetsattributesByStatusId;
    }

    public void setPlatformRulesetsattributesByStatusId(Collection<PlatformRulesetsattributesEntity> platformRulesetsattributesByStatusId) {
        this.platformRulesetsattributesByStatusId = platformRulesetsattributesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<PlatformRulesetsdefinitionsEntity> getPlatformRulesetsdefinitionsByStatusId() {
        return platformRulesetsdefinitionsByStatusId;
    }

    public void setPlatformRulesetsdefinitionsByStatusId(Collection<PlatformRulesetsdefinitionsEntity> platformRulesetsdefinitionsByStatusId) {
        this.platformRulesetsdefinitionsByStatusId = platformRulesetsdefinitionsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<RefdataAddressformattypeEntity> getRefdataAddressformattypesByStatusId() {
        return refdataAddressformattypesByStatusId;
    }

    public void setRefdataAddressformattypesByStatusId(Collection<RefdataAddressformattypeEntity> refdataAddressformattypesByStatusId) {
        this.refdataAddressformattypesByStatusId = refdataAddressformattypesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<RefdataApplicationEntity> getRefdataApplicationsByStatusId() {
        return refdataApplicationsByStatusId;
    }

    public void setRefdataApplicationsByStatusId(Collection<RefdataApplicationEntity> refdataApplicationsByStatusId) {
        this.refdataApplicationsByStatusId = refdataApplicationsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<RefdataCodesetEntity> getRefdataCodesetsByStatusId() {
        return refdataCodesetsByStatusId;
    }

    public void setRefdataCodesetsByStatusId(Collection<RefdataCodesetEntity> refdataCodesetsByStatusId) {
        this.refdataCodesetsByStatusId = refdataCodesetsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<RefdataCodesetvaluesEntity> getRefdataCodesetvaluesByStatusId() {
        return refdataCodesetvaluesByStatusId;
    }

    public void setRefdataCodesetvaluesByStatusId(Collection<RefdataCodesetvaluesEntity> refdataCodesetvaluesByStatusId) {
        this.refdataCodesetvaluesByStatusId = refdataCodesetvaluesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<RefdataCountriesEntity> getRefdataCountriesByStatusId() {
        return refdataCountriesByStatusId;
    }

    public void setRefdataCountriesByStatusId(Collection<RefdataCountriesEntity> refdataCountriesByStatusId) {
        this.refdataCountriesByStatusId = refdataCountriesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<RefdataIndustrystdEntity> getRefdataIndustrystdsByStatusId() {
        return refdataIndustrystdsByStatusId;
    }

    public void setRefdataIndustrystdsByStatusId(Collection<RefdataIndustrystdEntity> refdataIndustrystdsByStatusId) {
        this.refdataIndustrystdsByStatusId = refdataIndustrystdsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<RefdataOrganizationEntity> getRefdataOrganizationsByStatusId() {
        return refdataOrganizationsByStatusId;
    }

    public void setRefdataOrganizationsByStatusId(Collection<RefdataOrganizationEntity> refdataOrganizationsByStatusId) {
        this.refdataOrganizationsByStatusId = refdataOrganizationsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<RefdataTimezonesEntity> getRefdataTimezonesByStatusId() {
        return refdataTimezonesByStatusId;
    }

    public void setRefdataTimezonesByStatusId(Collection<RefdataTimezonesEntity> refdataTimezonesByStatusId) {
        this.refdataTimezonesByStatusId = refdataTimezonesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<RefdataUsstatesEntity> getRefdataUsstatesByStatusId() {
        return refdataUsstatesByStatusId;
    }

    public void setRefdataUsstatesByStatusId(Collection<RefdataUsstatesEntity> refdataUsstatesByStatusId) {
        this.refdataUsstatesByStatusId = refdataUsstatesByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<RefdataVendorEntity> getRefdataVendorsByStatusId() {
        return refdataVendorsByStatusId;
    }

    public void setRefdataVendorsByStatusId(Collection<RefdataVendorEntity> refdataVendorsByStatusId) {
        this.refdataVendorsByStatusId = refdataVendorsByStatusId;
    }

    @OneToMany(mappedBy = "refdataStatusByStatusId")
    public Collection<TermsCodesetstoapplicationEntity> getTermsCodesetstoapplicationsByStatusId() {
        return termsCodesetstoapplicationsByStatusId;
    }

    public void setTermsCodesetstoapplicationsByStatusId(Collection<TermsCodesetstoapplicationEntity> termsCodesetstoapplicationsByStatusId) {
        this.termsCodesetstoapplicationsByStatusId = termsCodesetstoapplicationsByStatusId;
    }
}
