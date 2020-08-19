package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UnstableTotalAll {

	@JsonProperty("unstableTotalAll")
	private Object unstableTotalAll;

	@JsonProperty("unstableTotalHigh")
	private String unstableTotalHigh;

	@JsonProperty("unstableTotalNormal")
	private String unstableTotalNormal;
	@JsonProperty("unstableTotalLow")
	private String unstableTotalLow;

	private boolean flagUnstableTotalAll;

	
	
	
	public UnstableTotalAll() {
		super();
		
		this.unstableTotalAll ="NA";
		this.unstableTotalHigh ="NA";
		this.unstableTotalNormal="NA";
		this.unstableTotalLow="NA";
		this.flagUnstableTotalAll=false;
	}

	public Object getUnstableTotalAll() {
		return unstableTotalAll;
	}

	public void setUnstableTotalAll(Object unstableTotalAll) {
		this.unstableTotalAll = unstableTotalAll;
	}

	public String getUnstableTotalHigh() {
		return unstableTotalHigh;
	}

	public void setUnstableTotalHigh(String unstableTotalHigh) {
		this.unstableTotalHigh = unstableTotalHigh;
	}

	public String getUnstableTotalNormal() {
		return unstableTotalNormal;
	}

	public void setUnstableTotalNormal(String unstableTotalNormal) {
		this.unstableTotalNormal = unstableTotalNormal;
	}

	public String getUnstableTotalLow() {
		return unstableTotalLow;
	}

	public void setUnstableTotalLow(String unstableTotalLow) {
		this.unstableTotalLow = unstableTotalLow;
	}

	public boolean isFlagUnstableTotalAll() {
		return flagUnstableTotalAll;
	}

	public void setFlagUnstableTotalAll(boolean flagUnstableTotalAll) {
		this.flagUnstableTotalAll = flagUnstableTotalAll;
	}

	@Override
	public String toString() {
		return "UnstableTotalAll [unstableTotalAll=" + unstableTotalAll + ", unstableTotalHigh=" + unstableTotalHigh
				+ ", unstableTotalNormal=" + unstableTotalNormal + ", unstableTotalLow=" + unstableTotalLow
				+ ", flagUnstableTotalAll=" + flagUnstableTotalAll + "]";
	}

}
