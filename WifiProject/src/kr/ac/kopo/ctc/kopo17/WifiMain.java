package kr.ac.kopo.ctc.kopo17;

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
		
		WifiItem far = null;
		WifiItem close = null;
		
		WifiItem me = new WifiItem();
		me.setLatitude("37.3860521");
		me.setLongitude("127.1214038");
		
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;

		for (WifiItem target : wifiItems) {
			double d = wifiItemService.getDistance(me, target);
			if (d >= max) {
				far = target;
				max = d;
			}
			if (d < min) {
				close = target;
				min = d;
			}
		}
		
		System.out.println("=================================");
		System.out.printf("%s %s %s\n%s\n%s\n%f\n%f\n%f\n", far.getInstallationCityName(), far.getInstallationDistrictName(), far.getInstallationLocationDetails(), far.getRoadNameAddress(), far.getInstallationLocationName(), max);
		System.out.println("---------------------------------");
		System.out.printf("%s %s %s\n%s\n%s\n%f\n", close.getInstallationCityName(), close.getInstallationDistrictName(), close.getInstallationLocationDetails(), close.getRoadNameAddress(), close.getInstallationLocationName(), min);
		System.out.println("=================================");

	}


}
