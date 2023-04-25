package kr.ac.kopo.ctc.kopo17;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo17.dao.WifiItemDao;
import kr.ac.kopo.ctc.kopo17.domain.WifiItem;
import kr.ac.kopo.ctc.kopo17.service.WifiItemService;

public class WifiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WifiItemService wifiItemService = new WifiItemService();
		WifiItemDao wifiItemDao = new WifiItemDao();
		List<WifiItem> wifiItems = wifiItemDao.selectAll();

		WifiItem me = new WifiItem();
		me.setLatitude("37.3860521");
		me.setLongitude("127.1214038");

		List<Double> distanceList = new ArrayList<Double>();
		for (WifiItem target : wifiItems) {
			double d = wifiItemService.getDistance(me, target);
			distanceList.add(d);
		}
		int index = 0;
		int maxI = 0;
		int minI =0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		for(double d : distanceList) {
			if (d >= max) {
				maxI = index;
				max = d;
			}
			if (d < min) {
				minI = index;
				min = d;
			}
			index++;
		}

		System.out.printf("%s %s %s\n%s\n%s\n%f\n", wifiItems.get(maxI).getInstallationCityName(), wifiItems.get(maxI).getInstallationDistrictName(), wifiItems.get(maxI).getInstallationLocationDetails(), wifiItems.get(maxI).getRoadNameAddress(), wifiItems.get(maxI).getInstallationLocationName(), max);
		System.out.printf("%s %s %s\n%s\n%s\n%f", wifiItems.get(minI).getInstallationCityName(), wifiItems.get(minI).getInstallationDistrictName(), wifiItems.get(minI).getInstallationLocationDetails(), wifiItems.get(minI).getRoadNameAddress(), wifiItems.get(minI).getInstallationLocationName(), min);

	}


}
