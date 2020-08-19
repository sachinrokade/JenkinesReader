package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FailedToAll {

	   
	    @JsonProperty("failedTotalAll")
	    private Object failedTotalAll;
	    @JsonProperty("failedTotalHigh")
	    private String failedTotalHigh;
	    @JsonProperty("failedTotalNormal")
	    private String failedTotalNormal;
	    @JsonProperty("failedTotalLow")
	    private String failedTotalLow;

		private boolean flagFailedToAll;
	    
	    
	    public FailedToAll() {
			super();
			    this.failedTotalAll="NA";
			    this.failedTotalHigh="NA";
			    this.failedTotalNormal="NA";
			    this.failedTotalLow="NA";
				this.flagFailedToAll=false;

		}
	    
	    
	    
		
		public boolean isFlagFailedToAll() {
			return flagFailedToAll;
		}
		public void setFlagFailedToAll(boolean flagFailedToAll) {
			this.flagFailedToAll = flagFailedToAll;
		}
		public Object getFailedTotalAll() {
			return failedTotalAll;
		}
		public void setFailedTotalAll(Object failedTotalAll) {
			this.failedTotalAll = failedTotalAll;
		}
		public String getFailedTotalHigh() {
			return failedTotalHigh;
		}
		public void setFailedTotalHigh(String failedTotalHigh) {
			this.failedTotalHigh = failedTotalHigh;
		}
		public String getFailedTotalNormal() {
			return failedTotalNormal;
		}
		public void setFailedTotalNormal(String failedTotalNormal) {
			this.failedTotalNormal = failedTotalNormal;
		}
		public String getFailedTotalLow() {
			return failedTotalLow;
		}
		public void setFailedTotalLow(String failedTotalLow) {
			this.failedTotalLow = failedTotalLow;
		}
		@Override
		public String toString() {
			return "FailedToAll [failedTotalAll=" + failedTotalAll + ", failedTotalHigh=" + failedTotalHigh
					+ ", failedTotalNormal=" + failedTotalNormal + ", failedTotalLow=" + failedTotalLow + ", flag="
					+ flagFailedToAll + "]";
		}
	   
}
