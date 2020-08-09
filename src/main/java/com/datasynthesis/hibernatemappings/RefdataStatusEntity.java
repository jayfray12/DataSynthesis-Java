package com.datasynthesis.hibernatemappings;

import java.sql.Timestamp;
import java.util.Collection;

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

    public short getStatusId() {
        return statusId;
    }

    public void setStatusId(short statusId) {
        this.statusId = statusId;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
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

    public Collection<AuditingDatarequestEntity> getAuditingDatarequestsByStatusId() {
        return auditingDatarequestsByStatusId;
    }

    public void setAuditingDatarequestsByStatusId(Collection<AuditingDatarequestEntity> auditingDatarequestsByStatusId) {
        this.auditingDatarequestsByStatusId = auditingDatarequestsByStatusId;
    }

    public Collection<AuditingDatarequestdetailEntity> getAuditingDatarequestdetailsByStatusId() {
        return auditingDatarequestdetailsByStatusId;
    }

    public void setAuditingDatarequestdetailsByStatusId(Collection<AuditingDatarequestdetailEntity> auditingDatarequestdetailsByStatusId) {
        this.auditingDatarequestdetailsByStatusId = auditingDatarequestdetailsByStatusId;
    }

    public Collection<DatabuiltAddressEntity> getDatabuiltAddressesByStatusId() {
        return databuiltAddressesByStatusId;
    }

    public void setDatabuiltAddressesByStatusId(Collection<DatabuiltAddressEntity> databuiltAddressesByStatusId) {
        this.databuiltAddressesByStatusId = databuiltAddressesByStatusId;
    }

    public Collection<DatabuiltNamesEntity> getDatabuiltNamesByStatusId() {
        return databuiltNamesByStatusId;
    }

    public void setDatabuiltNamesByStatusId(Collection<DatabuiltNamesEntity> databuiltNamesByStatusId) {
        this.databuiltNamesByStatusId = databuiltNamesByStatusId;
    }

    public Collection<DatabuiltPhonenumbersEntity> getDatabuiltPhonenumbersByStatusId() {
        return databuiltPhonenumbersByStatusId;
    }

    public void setDatabuiltPhonenumbersByStatusId(Collection<DatabuiltPhonenumbersEntity> databuiltPhonenumbersByStatusId) {
        this.databuiltPhonenumbersByStatusId = databuiltPhonenumbersByStatusId;
    }

    public Collection<DatabuiltPhonenumbersEntity> getDatabuiltPhonenumbersByStatusId_0() {
        return databuiltPhonenumbersByStatusId_0;
    }

    public void setDatabuiltPhonenumbersByStatusId_0(Collection<DatabuiltPhonenumbersEntity> databuiltPhonenumbersByStatusId_0) {
        this.databuiltPhonenumbersByStatusId_0 = databuiltPhonenumbersByStatusId_0;
    }

    public Collection<DataexistingAbabankingEntity> getDataexistingAbabankingsByStatusId() {
        return dataexistingAbabankingsByStatusId;
    }

    public void setDataexistingAbabankingsByStatusId(Collection<DataexistingAbabankingEntity> dataexistingAbabankingsByStatusId) {
        this.dataexistingAbabankingsByStatusId = dataexistingAbabankingsByStatusId;
    }

    public Collection<DataexistingAreacodeEntity> getDataexistingAreacodesByStatusId() {
        return dataexistingAreacodesByStatusId;
    }

    public void setDataexistingAreacodesByStatusId(Collection<DataexistingAreacodeEntity> dataexistingAreacodesByStatusId) {
        this.dataexistingAreacodesByStatusId = dataexistingAreacodesByStatusId;
    }

    public Collection<DataexistingAreacodeintlEntity> getDataexistingAreacodeintlsByStatusId() {
        return dataexistingAreacodeintlsByStatusId;
    }

    public void setDataexistingAreacodeintlsByStatusId(Collection<DataexistingAreacodeintlEntity> dataexistingAreacodeintlsByStatusId) {
        this.dataexistingAreacodeintlsByStatusId = dataexistingAreacodeintlsByStatusId;
    }

    public Collection<DataexistingCompaniesEntity> getDataexistingCompaniesByStatusId() {
        return dataexistingCompaniesByStatusId;
    }

    public void setDataexistingCompaniesByStatusId(Collection<DataexistingCompaniesEntity> dataexistingCompaniesByStatusId) {
        this.dataexistingCompaniesByStatusId = dataexistingCompaniesByStatusId;
    }

    public Collection<DataexistingNamefirstEntity> getDataexistingNamefirstsByStatusId() {
        return dataexistingNamefirstsByStatusId;
    }

    public void setDataexistingNamefirstsByStatusId(Collection<DataexistingNamefirstEntity> dataexistingNamefirstsByStatusId) {
        this.dataexistingNamefirstsByStatusId = dataexistingNamefirstsByStatusId;
    }

    public Collection<DataexistingNamelastEntity> getDataexistingNamelastsByStatusId() {
        return dataexistingNamelastsByStatusId;
    }

    public void setDataexistingNamelastsByStatusId(Collection<DataexistingNamelastEntity> dataexistingNamelastsByStatusId) {
        this.dataexistingNamelastsByStatusId = dataexistingNamelastsByStatusId;
    }

    public Collection<DataexistingUpccodesEntity> getDataexistingUpccodesByStatusId() {
        return dataexistingUpccodesByStatusId;
    }

    public void setDataexistingUpccodesByStatusId(Collection<DataexistingUpccodesEntity> dataexistingUpccodesByStatusId) {
        this.dataexistingUpccodesByStatusId = dataexistingUpccodesByStatusId;
    }

    public Collection<DataexistingZipcodeintlEntity> getDataexistingZipcodeintlsByStatusId() {
        return dataexistingZipcodeintlsByStatusId;
    }

    public void setDataexistingZipcodeintlsByStatusId(Collection<DataexistingZipcodeintlEntity> dataexistingZipcodeintlsByStatusId) {
        this.dataexistingZipcodeintlsByStatusId = dataexistingZipcodeintlsByStatusId;
    }

    public Collection<DataexistingZipcodeusEntity> getDataexistingZipcodeusesByStatusId() {
        return dataexistingZipcodeusesByStatusId;
    }

    public void setDataexistingZipcodeusesByStatusId(Collection<DataexistingZipcodeusEntity> dataexistingZipcodeusesByStatusId) {
        this.dataexistingZipcodeusesByStatusId = dataexistingZipcodeusesByStatusId;
    }

    public Collection<DatageneratedAccountnumbersEntity> getDatageneratedAccountnumbersByStatusId() {
        return datageneratedAccountnumbersByStatusId;
    }

    public void setDatageneratedAccountnumbersByStatusId(Collection<DatageneratedAccountnumbersEntity> datageneratedAccountnumbersByStatusId) {
        this.datageneratedAccountnumbersByStatusId = datageneratedAccountnumbersByStatusId;
    }

    public Collection<DatageneratedAccountnumbersEntity> getDatageneratedAccountnumbersByStatusId_0() {
        return datageneratedAccountnumbersByStatusId_0;
    }

    public void setDatageneratedAccountnumbersByStatusId_0(Collection<DatageneratedAccountnumbersEntity> datageneratedAccountnumbersByStatusId_0) {
        this.datageneratedAccountnumbersByStatusId_0 = datageneratedAccountnumbersByStatusId_0;
    }

    public Collection<DatageneratedAddressesEntity> getDatageneratedAddressesByStatusId() {
        return datageneratedAddressesByStatusId;
    }

    public void setDatageneratedAddressesByStatusId(Collection<DatageneratedAddressesEntity> datageneratedAddressesByStatusId) {
        this.datageneratedAddressesByStatusId = datageneratedAddressesByStatusId;
    }

    public Collection<DatageneratedBankaccountEntity> getDatageneratedBankaccountsByStatusId() {
        return datageneratedBankaccountsByStatusId;
    }

    public void setDatageneratedBankaccountsByStatusId(Collection<DatageneratedBankaccountEntity> datageneratedBankaccountsByStatusId) {
        this.datageneratedBankaccountsByStatusId = datageneratedBankaccountsByStatusId;
    }

    public Collection<DatageneratedCreditcardEntity> getDatageneratedCreditcardsByStatusId() {
        return datageneratedCreditcardsByStatusId;
    }

    public void setDatageneratedCreditcardsByStatusId(Collection<DatageneratedCreditcardEntity> datageneratedCreditcardsByStatusId) {
        this.datageneratedCreditcardsByStatusId = datageneratedCreditcardsByStatusId;
    }

    public Collection<DatageneratedDateofbirthEntity> getDatageneratedDateofbirthsByStatusId() {
        return datageneratedDateofbirthsByStatusId;
    }

    public void setDatageneratedDateofbirthsByStatusId(Collection<DatageneratedDateofbirthEntity> datageneratedDateofbirthsByStatusId) {
        this.datageneratedDateofbirthsByStatusId = datageneratedDateofbirthsByStatusId;
    }

    public Collection<DatageneratedDriverslicensesEntity> getDatageneratedDriverslicensesByStatusId() {
        return datageneratedDriverslicensesByStatusId;
    }

    public void setDatageneratedDriverslicensesByStatusId(Collection<DatageneratedDriverslicensesEntity> datageneratedDriverslicensesByStatusId) {
        this.datageneratedDriverslicensesByStatusId = datageneratedDriverslicensesByStatusId;
    }

    public Collection<DatageneratedEinEntity> getDatageneratedEinsByStatusId() {
        return datageneratedEinsByStatusId;
    }

    public void setDatageneratedEinsByStatusId(Collection<DatageneratedEinEntity> datageneratedEinsByStatusId) {
        this.datageneratedEinsByStatusId = datageneratedEinsByStatusId;
    }

    public Collection<DatageneratedPhonenumberEntity> getDatageneratedPhonenumbersByStatusId() {
        return datageneratedPhonenumbersByStatusId;
    }

    public void setDatageneratedPhonenumbersByStatusId(Collection<DatageneratedPhonenumberEntity> datageneratedPhonenumbersByStatusId) {
        this.datageneratedPhonenumbersByStatusId = datageneratedPhonenumbersByStatusId;
    }

    public Collection<DatageneratedPhonenumbersintlEntity> getDatageneratedPhonenumbersintlsByStatusId() {
        return datageneratedPhonenumbersintlsByStatusId;
    }

    public void setDatageneratedPhonenumbersintlsByStatusId(Collection<DatageneratedPhonenumbersintlEntity> datageneratedPhonenumbersintlsByStatusId) {
        this.datageneratedPhonenumbersintlsByStatusId = datageneratedPhonenumbersintlsByStatusId;
    }

    public Collection<DatageneratedSocialsecuritynumberEntity> getDatageneratedSocialsecuritynumbersByStatusId() {
        return datageneratedSocialsecuritynumbersByStatusId;
    }

    public void setDatageneratedSocialsecuritynumbersByStatusId(Collection<DatageneratedSocialsecuritynumberEntity> datageneratedSocialsecuritynumbersByStatusId) {
        this.datageneratedSocialsecuritynumbersByStatusId = datageneratedSocialsecuritynumbersByStatusId;
    }

    public Collection<DatageneratedUseridentitiesEntity> getDatageneratedUseridentitiesByStatusId() {
        return datageneratedUseridentitiesByStatusId;
    }

    public void setDatageneratedUseridentitiesByStatusId(Collection<DatageneratedUseridentitiesEntity> datageneratedUseridentitiesByStatusId) {
        this.datageneratedUseridentitiesByStatusId = datageneratedUseridentitiesByStatusId;
    }

    public Collection<MapDelimiteddatamapdetailtocodesetsEntity> getMapDelimiteddatamapdetailtocodesetsByStatusId() {
        return mapDelimiteddatamapdetailtocodesetsByStatusId;
    }

    public void setMapDelimiteddatamapdetailtocodesetsByStatusId(Collection<MapDelimiteddatamapdetailtocodesetsEntity> mapDelimiteddatamapdetailtocodesetsByStatusId) {
        this.mapDelimiteddatamapdetailtocodesetsByStatusId = mapDelimiteddatamapdetailtocodesetsByStatusId;
    }

    public Collection<MapDelimiteddatamapdetailtodataattributesEntity> getMapDelimiteddatamapdetailtodataattributesByStatusId() {
        return mapDelimiteddatamapdetailtodataattributesByStatusId;
    }

    public void setMapDelimiteddatamapdetailtodataattributesByStatusId(Collection<MapDelimiteddatamapdetailtodataattributesEntity> mapDelimiteddatamapdetailtodataattributesByStatusId) {
        this.mapDelimiteddatamapdetailtodataattributesByStatusId = mapDelimiteddatamapdetailtodataattributesByStatusId;
    }

    public Collection<MapDelimiteddatamapdetailtovendordatamodelEntity> getMapDelimiteddatamapdetailtovendordatamodelsByStatusId() {
        return mapDelimiteddatamapdetailtovendordatamodelsByStatusId;
    }

    public void setMapDelimiteddatamapdetailtovendordatamodelsByStatusId(Collection<MapDelimiteddatamapdetailtovendordatamodelEntity> mapDelimiteddatamapdetailtovendordatamodelsByStatusId) {
        this.mapDelimiteddatamapdetailtovendordatamodelsByStatusId = mapDelimiteddatamapdetailtovendordatamodelsByStatusId;
    }

    public Collection<MapDelimiteddatamappingdetailEntity> getMapDelimiteddatamappingdetailsByStatusId() {
        return mapDelimiteddatamappingdetailsByStatusId;
    }

    public void setMapDelimiteddatamappingdetailsByStatusId(Collection<MapDelimiteddatamappingdetailEntity> mapDelimiteddatamappingdetailsByStatusId) {
        this.mapDelimiteddatamappingdetailsByStatusId = mapDelimiteddatamappingdetailsByStatusId;
    }

    public Collection<MapDelimiteddatamappingheaderEntity> getMapDelimiteddatamappingheadersByStatusId() {
        return mapDelimiteddatamappingheadersByStatusId;
    }

    public void setMapDelimiteddatamappingheadersByStatusId(Collection<MapDelimiteddatamappingheaderEntity> mapDelimiteddatamappingheadersByStatusId) {
        this.mapDelimiteddatamappingheadersByStatusId = mapDelimiteddatamappingheadersByStatusId;
    }

    public Collection<MapHcinterfacedatamapdetailEntity> getMapHcinterfacedatamapdetailsByStatusId() {
        return mapHcinterfacedatamapdetailsByStatusId;
    }

    public void setMapHcinterfacedatamapdetailsByStatusId(Collection<MapHcinterfacedatamapdetailEntity> mapHcinterfacedatamapdetailsByStatusId) {
        this.mapHcinterfacedatamapdetailsByStatusId = mapHcinterfacedatamapdetailsByStatusId;
    }

    public Collection<MapHcinterfacedatamapdetailtocodesetsEntity> getMapHcinterfacedatamapdetailtocodesetsByStatusId() {
        return mapHcinterfacedatamapdetailtocodesetsByStatusId;
    }

    public void setMapHcinterfacedatamapdetailtocodesetsByStatusId(Collection<MapHcinterfacedatamapdetailtocodesetsEntity> mapHcinterfacedatamapdetailtocodesetsByStatusId) {
        this.mapHcinterfacedatamapdetailtocodesetsByStatusId = mapHcinterfacedatamapdetailtocodesetsByStatusId;
    }

    public Collection<MapHcinterfacedatamapdetailtodataattributesEntity> getMapHcinterfacedatamapdetailtodataattributesByStatusId() {
        return mapHcinterfacedatamapdetailtodataattributesByStatusId;
    }

    public void setMapHcinterfacedatamapdetailtodataattributesByStatusId(Collection<MapHcinterfacedatamapdetailtodataattributesEntity> mapHcinterfacedatamapdetailtodataattributesByStatusId) {
        this.mapHcinterfacedatamapdetailtodataattributesByStatusId = mapHcinterfacedatamapdetailtodataattributesByStatusId;
    }

    public Collection<MapHcinterfacedatamapdetailtovendordatamodelEntity> getMapHcinterfacedatamapdetailtovendordatamodelsByStatusId() {
        return mapHcinterfacedatamapdetailtovendordatamodelsByStatusId;
    }

    public void setMapHcinterfacedatamapdetailtovendordatamodelsByStatusId(Collection<MapHcinterfacedatamapdetailtovendordatamodelEntity> mapHcinterfacedatamapdetailtovendordatamodelsByStatusId) {
        this.mapHcinterfacedatamapdetailtovendordatamodelsByStatusId = mapHcinterfacedatamapdetailtovendordatamodelsByStatusId;
    }

    public Collection<MapHcinterfacedatamapheaderEntity> getMapHcinterfacedatamapheadersByStatusId() {
        return mapHcinterfacedatamapheadersByStatusId;
    }

    public void setMapHcinterfacedatamapheadersByStatusId(Collection<MapHcinterfacedatamapheaderEntity> mapHcinterfacedatamapheadersByStatusId) {
        this.mapHcinterfacedatamapheadersByStatusId = mapHcinterfacedatamapheadersByStatusId;
    }

    public Collection<MapVendordatamappingdetailEntity> getMapVendordatamappingdetailsByStatusId() {
        return mapVendordatamappingdetailsByStatusId;
    }

    public void setMapVendordatamappingdetailsByStatusId(Collection<MapVendordatamappingdetailEntity> mapVendordatamappingdetailsByStatusId) {
        this.mapVendordatamappingdetailsByStatusId = mapVendordatamappingdetailsByStatusId;
    }

    public Collection<MapVendordatamappingdetailtocodesetsEntity> getMapVendordatamappingdetailtocodesetsByStatusId() {
        return mapVendordatamappingdetailtocodesetsByStatusId;
    }

    public void setMapVendordatamappingdetailtocodesetsByStatusId(Collection<MapVendordatamappingdetailtocodesetsEntity> mapVendordatamappingdetailtocodesetsByStatusId) {
        this.mapVendordatamappingdetailtocodesetsByStatusId = mapVendordatamappingdetailtocodesetsByStatusId;
    }

    public Collection<MapVendordatamappingdetailtodataattributesEntity> getMapVendordatamappingdetailtodataattributesByStatusId() {
        return mapVendordatamappingdetailtodataattributesByStatusId;
    }

    public void setMapVendordatamappingdetailtodataattributesByStatusId(Collection<MapVendordatamappingdetailtodataattributesEntity> mapVendordatamappingdetailtodataattributesByStatusId) {
        this.mapVendordatamappingdetailtodataattributesByStatusId = mapVendordatamappingdetailtodataattributesByStatusId;
    }

    public Collection<MapVendordatamappingheaderEntity> getMapVendordatamappingheadersByStatusId() {
        return mapVendordatamappingheadersByStatusId;
    }

    public void setMapVendordatamappingheadersByStatusId(Collection<MapVendordatamappingheaderEntity> mapVendordatamappingheadersByStatusId) {
        this.mapVendordatamappingheadersByStatusId = mapVendordatamappingheadersByStatusId;
    }

    public Collection<PlatformAppsettingEntity> getPlatformAppsettingsByStatusId() {
        return platformAppsettingsByStatusId;
    }

    public void setPlatformAppsettingsByStatusId(Collection<PlatformAppsettingEntity> platformAppsettingsByStatusId) {
        this.platformAppsettingsByStatusId = platformAppsettingsByStatusId;
    }

    public Collection<PlatformDataattributesEntity> getPlatformDataattributesByStatusId() {
        return platformDataattributesByStatusId;
    }

    public void setPlatformDataattributesByStatusId(Collection<PlatformDataattributesEntity> platformDataattributesByStatusId) {
        this.platformDataattributesByStatusId = platformDataattributesByStatusId;
    }

    public Collection<PlatformDatagenconfigEntity> getPlatformDatagenconfigsByStatusId() {
        return platformDatagenconfigsByStatusId;
    }

    public void setPlatformDatagenconfigsByStatusId(Collection<PlatformDatagenconfigEntity> platformDatagenconfigsByStatusId) {
        this.platformDatagenconfigsByStatusId = platformDatagenconfigsByStatusId;
    }

    public Collection<PlatformDatastructuresEntity> getPlatformDatastructuresByStatusId() {
        return platformDatastructuresByStatusId;
    }

    public void setPlatformDatastructuresByStatusId(Collection<PlatformDatastructuresEntity> platformDatastructuresByStatusId) {
        this.platformDatastructuresByStatusId = platformDatastructuresByStatusId;
    }

    public Collection<PlatformDatastructurestodataattributesEntity> getPlatformDatastructurestodataattributesByStatusId() {
        return platformDatastructurestodataattributesByStatusId;
    }

    public void setPlatformDatastructurestodataattributesByStatusId(Collection<PlatformDatastructurestodataattributesEntity> platformDatastructurestodataattributesByStatusId) {
        this.platformDatastructurestodataattributesByStatusId = platformDatastructurestodataattributesByStatusId;
    }

    public Collection<PlatformRulesetsEntity> getPlatformRulesetsByStatusId() {
        return platformRulesetsByStatusId;
    }

    public void setPlatformRulesetsByStatusId(Collection<PlatformRulesetsEntity> platformRulesetsByStatusId) {
        this.platformRulesetsByStatusId = platformRulesetsByStatusId;
    }

    public Collection<PlatformRulesetsattributesEntity> getPlatformRulesetsattributesByStatusId() {
        return platformRulesetsattributesByStatusId;
    }

    public void setPlatformRulesetsattributesByStatusId(Collection<PlatformRulesetsattributesEntity> platformRulesetsattributesByStatusId) {
        this.platformRulesetsattributesByStatusId = platformRulesetsattributesByStatusId;
    }

    public Collection<PlatformRulesetsdefinitionsEntity> getPlatformRulesetsdefinitionsByStatusId() {
        return platformRulesetsdefinitionsByStatusId;
    }

    public void setPlatformRulesetsdefinitionsByStatusId(Collection<PlatformRulesetsdefinitionsEntity> platformRulesetsdefinitionsByStatusId) {
        this.platformRulesetsdefinitionsByStatusId = platformRulesetsdefinitionsByStatusId;
    }

    public Collection<RefdataAddressformattypeEntity> getRefdataAddressformattypesByStatusId() {
        return refdataAddressformattypesByStatusId;
    }

    public void setRefdataAddressformattypesByStatusId(Collection<RefdataAddressformattypeEntity> refdataAddressformattypesByStatusId) {
        this.refdataAddressformattypesByStatusId = refdataAddressformattypesByStatusId;
    }

    public Collection<RefdataApplicationEntity> getRefdataApplicationsByStatusId() {
        return refdataApplicationsByStatusId;
    }

    public void setRefdataApplicationsByStatusId(Collection<RefdataApplicationEntity> refdataApplicationsByStatusId) {
        this.refdataApplicationsByStatusId = refdataApplicationsByStatusId;
    }

    public Collection<RefdataCodesetEntity> getRefdataCodesetsByStatusId() {
        return refdataCodesetsByStatusId;
    }

    public void setRefdataCodesetsByStatusId(Collection<RefdataCodesetEntity> refdataCodesetsByStatusId) {
        this.refdataCodesetsByStatusId = refdataCodesetsByStatusId;
    }

    public Collection<RefdataCodesetvaluesEntity> getRefdataCodesetvaluesByStatusId() {
        return refdataCodesetvaluesByStatusId;
    }

    public void setRefdataCodesetvaluesByStatusId(Collection<RefdataCodesetvaluesEntity> refdataCodesetvaluesByStatusId) {
        this.refdataCodesetvaluesByStatusId = refdataCodesetvaluesByStatusId;
    }

    public Collection<RefdataCountriesEntity> getRefdataCountriesByStatusId() {
        return refdataCountriesByStatusId;
    }

    public void setRefdataCountriesByStatusId(Collection<RefdataCountriesEntity> refdataCountriesByStatusId) {
        this.refdataCountriesByStatusId = refdataCountriesByStatusId;
    }

    public Collection<RefdataIndustrystdEntity> getRefdataIndustrystdsByStatusId() {
        return refdataIndustrystdsByStatusId;
    }

    public void setRefdataIndustrystdsByStatusId(Collection<RefdataIndustrystdEntity> refdataIndustrystdsByStatusId) {
        this.refdataIndustrystdsByStatusId = refdataIndustrystdsByStatusId;
    }

    public Collection<RefdataOrganizationEntity> getRefdataOrganizationsByStatusId() {
        return refdataOrganizationsByStatusId;
    }

    public void setRefdataOrganizationsByStatusId(Collection<RefdataOrganizationEntity> refdataOrganizationsByStatusId) {
        this.refdataOrganizationsByStatusId = refdataOrganizationsByStatusId;
    }

    public Collection<RefdataTimezonesEntity> getRefdataTimezonesByStatusId() {
        return refdataTimezonesByStatusId;
    }

    public void setRefdataTimezonesByStatusId(Collection<RefdataTimezonesEntity> refdataTimezonesByStatusId) {
        this.refdataTimezonesByStatusId = refdataTimezonesByStatusId;
    }

    public Collection<RefdataUsstatesEntity> getRefdataUsstatesByStatusId() {
        return refdataUsstatesByStatusId;
    }

    public void setRefdataUsstatesByStatusId(Collection<RefdataUsstatesEntity> refdataUsstatesByStatusId) {
        this.refdataUsstatesByStatusId = refdataUsstatesByStatusId;
    }

    public Collection<RefdataVendorEntity> getRefdataVendorsByStatusId() {
        return refdataVendorsByStatusId;
    }

    public void setRefdataVendorsByStatusId(Collection<RefdataVendorEntity> refdataVendorsByStatusId) {
        this.refdataVendorsByStatusId = refdataVendorsByStatusId;
    }

    public Collection<TermsCodesetstoapplicationEntity> getTermsCodesetstoapplicationsByStatusId() {
        return termsCodesetstoapplicationsByStatusId;
    }

    public void setTermsCodesetstoapplicationsByStatusId(Collection<TermsCodesetstoapplicationEntity> termsCodesetstoapplicationsByStatusId) {
        this.termsCodesetstoapplicationsByStatusId = termsCodesetstoapplicationsByStatusId;
    }
}
