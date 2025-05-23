package com.rogers.data.pojos;

public class SauceOptions {
	private String seleniumVersion;
	private String name;
	private String maxDuration;
	private String commandTimeout;
	private String idleTimeout;
	private String build;
	/**
	 * @return the seleniumVersion
	 */
	public String getSeleniumVersion() {
		return seleniumVersion;
	}
	/**
	 * @param seleniumVersion the seleniumVersion to set
	 */
	public void setSeleniumVersion(String seleniumVersion) {
		this.seleniumVersion = seleniumVersion;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the maxDuration
	 */
	public String getMaxDuration() {
		return maxDuration;
	}
	/**
	 * @param maxDuration the maxDuration to set
	 */
	public void setMaxDuration(String maxDuration) {
		this.maxDuration = maxDuration;
	}
	/**
	 * @return the commandTimeout
	 */
	public String getCommandTimeout() {
		return commandTimeout;
	}
	/**
	 * @param commandTimeout the commandTimeout to set
	 */
	public void setCommandTimeout(String commandTimeout) {
		this.commandTimeout = commandTimeout;
	}
	/**
	 * @return the idleTimeout
	 */
	public String getIdleTimeout() {
		return idleTimeout;
	}
	/**
	 * @param idleTimeout the idleTimeout to set
	 */
	public void setIdleTimeout(String idleTimeout) {
		this.idleTimeout = idleTimeout;
	}
	/**
	 * @return the build
	 */
	public String getBuild() {
		return build;
	}
	/**
	 * @param build the build to set
	 */
	public void setBuild(String build) {
		this.build = build;
	} 
}

