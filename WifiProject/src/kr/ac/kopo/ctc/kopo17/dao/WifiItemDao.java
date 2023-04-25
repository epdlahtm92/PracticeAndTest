package kr.ac.kopo.ctc.kopo17.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo17.domain.WifiItem;

public class WifiItemDao {
	public List<WifiItem> selectAll(){
		List<WifiItem> data = new ArrayList<WifiItem>();

		try {
			File f = new File("C:\\kopo17\\Java심화\\강의자료\\PublicWifi.txt");
			BufferedReader br = new BufferedReader(new FileReader(f));

			String readTxt = br.readLine();
			String fieldNames[]	= readTxt.split("\t");

			while((readTxt = br.readLine()) != null){
				WifiItem wifiItem = new WifiItem();
				String fields[] = readTxt.split("\t");

				wifiItem.setId(fields[0]);
				wifiItem.setInstallationLocationName(fields[1]);
				wifiItem.setInstallationLocationDetails(fields[2]);
				wifiItem.setInstallationCityName(fields[3]);
				wifiItem.setInstallationDistrictName(fields[4]);
				wifiItem.setInstallationFacilityType(fields[5]);
				wifiItem.setInstallationProviderName(fields[6]);
				wifiItem.setWifiSsid(fields[7]);
				wifiItem.setDateOfInsatllation(fields[8]);
				wifiItem.setRoadNameAddress(fields[9]);
				wifiItem.setLotNumberAddress(fields[10]);
				wifiItem.setManagementAgencyName(fields[11]);
				wifiItem.setManagementAgencyPhoneNumber(fields[12]);
				wifiItem.setLatitude(fields[13]);
				wifiItem.setLongitude(fields[14]);
				wifiItem.setCreated(fields[15]);

				data.add(wifiItem);

				br.close();
			}
		} catch (IOException e) {

		}

		return data;
	}
}

