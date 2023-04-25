package kr.ac.kopo.ctc.kopo17.domain;

public class WifiItem {
	private String id;
	private String installationLocationName;
	private String installationLocationDetails;
	private String installationCityName;
	private String installationDistrictName;
	private String installationFacilityType;
	private String installationProviderName;
	private String wifiSsid;
	private String dateOfInsatllation;
	private String roadNameAddress;
	private String lotNumberAddress;
	private String managementAgencyName;
	private String managementAgencyPhoneNumber;
	private String latitude;
	private String longitude;
	private String created;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInstallationLocationName() {
		return installationLocationName;
	}
	public void setInstallationLocationName(String installationLocationName) {
		this.installationLocationName = installationLocationName;
	}
	public String getInstallationLocationDetails() {
		return installationLocationDetails;
	}
	public void setInstallationLocationDetails(String installationLocationDetails) {
		this.installationLocationDetails = installationLocationDetails;
	}
	public String getInstallationCityName() {
		return installationCityName;
	}
	public void setInstallationCityName(String installationCityName) {
		this.installationCityName = installationCityName;
	}
	public String getInstallationDistrictName() {
		return installationDistrictName;
	}
	public void setInstallationDistrictName(String installationDistrictName) {
		this.installationDistrictName = installationDistrictName;
	}
	public String getInstallationFacilityType() {
		return installationFacilityType;
	}
	public void setInstallationFacilityType(String installationFacilityType) {
		this.installationFacilityType = installationFacilityType;
	}
	public String getInstallationProviderName() {
		return installationProviderName;
	}
	public void setInstallationProviderName(String installationProviderName) {
		this.installationProviderName = installationProviderName;
	}
	public String getWifiSsid() {
		return wifiSsid;
	}
	public void setWifiSsid(String wifiSsid) {
		this.wifiSsid = wifiSsid;
	}
	public String getDateOfInsatllation() {
		return dateOfInsatllation;
	}
	public void setDateOfInsatllation(String dateOfInsatllation) {
		this.dateOfInsatllation = dateOfInsatllation;
	}
	public String getRoadNameAddress() {
		return roadNameAddress;
	}
	public void setRoadNameAddress(String roadNameAddress) {
		this.roadNameAddress = roadNameAddress;
	}
	public String getLotNumberAddress() {
		return lotNumberAddress;
	}
	public void setLotNumberAddress(String lotNumberAddress) {
		this.lotNumberAddress = lotNumberAddress;
	}
	public String getManagementAgencyName() {
		return managementAgencyName;
	}
	public void setManagementAgencyName(String managementAgencyName) {
		this.managementAgencyName = managementAgencyName;
	}
	public String getManagementAgencyPhoneNumber() {
		return managementAgencyPhoneNumber;
	}
	public void setManagementAgencyPhoneNumber(String managementAgencyPhoneNumber) {
		this.managementAgencyPhoneNumber = managementAgencyPhoneNumber;
	}
	public String getLatitude() {
		return latitude;
	}
	public double getLatitudeToDouble() {
		double res = Double.parseDouble(latitude);
		return res;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public Double getLongitudeToDouble() {
		double res = Double.parseDouble(longitude);
		return res;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	
	
}
