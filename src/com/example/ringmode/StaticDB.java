package com.example.ringmode;

public class StaticDB {
	
	/// for default values ////
	private static String silent="Silent";
	private static String vibrate="Vibrate";
	private static String ring ="Ring";
	
	
	
	public static String getSilent() {
		return silent;
	}
	public static void setSilent(String code) {
		silent = code;
	}
	public static String getVibrate() {
		return vibrate;
	}
	public static void setVibrate(String code) {
		vibrate = code;
	}
	public static String getRing() {
		return ring;
	}
	public static void setRing(String code) {
		ring = code;
	}
	
}
