package com.semanticsquare.thrillio.entities;

public class WebLink extends Bookmark {
	private String url;
	private String host;

	protected String getUrl() {
		return url;
	}

	protected void setUrl(String url) {
		this.url = url;
	}

	protected String getHost() {
		return host;
	}

	protected void setHost(String host) {
		this.host = host;
	}

}
