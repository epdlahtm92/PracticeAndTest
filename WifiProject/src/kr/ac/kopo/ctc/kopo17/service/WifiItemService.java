package kr.ac.kopo.ctc.kopo17.service;

import kr.ac.kopo.ctc.kopo17.domain.WifiItem;

public class WifiItemService {
	public double getDistance(WifiItem wifiItem1, WifiItem wifiItem2) {
		double dist = Math.sqrt(Math.pow(Double.parseDouble(wifiItem1.getLongitude()) - Double.parseDouble(wifiItem2.getLongitude()),2) 
				+ Math.pow(Double.parseDouble(wifiItem1.getLatitude()) - Double.parseDouble(wifiItem2.getLatitude()), 2));

		return dist;
	}
}