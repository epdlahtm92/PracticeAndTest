package kr.ac.kopo.ctc.kopo17.service;

import kr.ac.kopo.ctc.kopo17.domain.WifiItem;

public class WifiItemService {
	public double getDistance(WifiItem wifiItem1, WifiItem wifiItem2) {
		double dist = Math.sqrt(Math.pow(wifiItem1.getLongitudeToDouble() - wifiItem2.getLongitudeToDouble(),2) 
				+ Math.pow(wifiItem1.getLatitudeToDouble() - wifiItem2.getLatitudeToDouble(), 2));

		return dist;
	}
}