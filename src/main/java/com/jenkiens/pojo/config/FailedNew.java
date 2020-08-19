package com.jenkiens.pojo.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FailedNew {

	   
	   @JsonProperty("failedNewAll")
	    private Object failedNewAll;
	    @JsonProperty("failedNewHigh")
	    private Object failedNewHigh;
	    @JsonProperty("failedNewNormal")
	    private Object failedNewNormal;
	    @JsonProperty("failedNewLow")
	    private Object failedNewLow;


	    private boolean flagFailedNew;
	   
	    
	    
	    public boolean isFlagFailedNew() {
			return flagFailedNew;
		}
		public void setFlagFailedNew(boolean flagFailedNew) {
			this.flagFailedNew = flagFailedNew;
		}
		public Object getFailedNewAll() {
			return failedNewAll;
		}
		public void setFailedNewAll(Object failedNewAll) {
			this.failedNewAll = failedNewAll;
		}
		public Object getFailedNewHigh() {
			return failedNewHigh;
		}
		public void setFailedNewHigh(Object failedNewHigh) {
			this.failedNewHigh = failedNewHigh;
		}
		public Object getFailedNewNormal() {
			return failedNewNormal;
		}
		public void setFailedNewNormal(Object failedNewNormal) {
			this.failedNewNormal = failedNewNormal;
		}
		public Object getFailedNewLow() {
			return failedNewLow;
		}
		public void setFailedNewLow(Object failedNewLow) {
			this.failedNewLow = failedNewLow;
		}
		@Override
		public String toString() {
			return "FailedNew [failedNewAll=" + failedNewAll + ", failedNewHigh=" + failedNewHigh + ", failedNewNormal="
					+ failedNewNormal + ", failedNewLow=" + failedNewLow + ", flag=" + flagFailedNew + "]";
		}
			   
}
