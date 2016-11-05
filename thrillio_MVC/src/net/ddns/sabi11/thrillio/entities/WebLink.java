package net.ddns.sabi11.thrillio.entities;

public class WebLink extends Bookmark {

	//Attributes
	private String url;
	private String host;
	
	
	//Getter and Setter
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	
	@Override
	public String toString() {
		return "WebLink [url=" + url + ", host=" + host + "]";
	}
	
	@Override
	public boolean isKidsFriendlyEligible() {
		if(url.contains("porn") || getTitle().contains("Porn")
				|| host.contains("adult")) {
			return false;
		}
		
		return true;
	}
	
	
}
