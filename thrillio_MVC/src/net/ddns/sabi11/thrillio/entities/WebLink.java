package net.ddns.sabi11.thrillio.entities;

import net.ddns.sabi11.thrillio.partner.Shareable;

public class WebLink extends Bookmark implements Shareable {

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
	@Override
	public String getItemData() {
		StringBuilder builder = new StringBuilder();
		builder.append("<item>");
			builder.append("<type>WebLink</type>");
			builder.append("<title>").append(getTitle()).append("</title>");
			builder.append("url").append(url).append("</url>");
			builder.append("host").append(host).append("</host>");
		builder.append("</item>");
		
		return builder.toString();
	}
	
	
	
}
