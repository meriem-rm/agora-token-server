package com.example.demo.model;
public class AgoraBody {
//	private String appId = "APP_ID";
//	private String appCertificate ="APP_CERIFICATE";
    private String channelName;
    private int uid = 0; // By default 0
    private int expirationTimeInSeconds = 3600; // By default 3600
    private int role ; // By d
	
//	public String getAppId() {
//		return appId;
//	}
//	public void setAppId(String appId) {
//		this.appId = appId;
//	}
//	public String getAppCertificate() {
//		return appCertificate;
//	}
//	public void setAppCertificate(String appCertificate) {
//		this.appCertificate = appCertificate;
//	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getExpirationTimeInSeconds() {
		return expirationTimeInSeconds;
	}
	public void setExpirationTimeInSeconds(int expirationTimeInSeconds) {
		this.expirationTimeInSeconds = expirationTimeInSeconds;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
    
    
}
