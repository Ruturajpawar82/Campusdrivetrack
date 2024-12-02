package com.jbk.dup;

import java.sql.Timestamp;
import java.time.Instant;

public class timestamp {
	
	private String msg;
	private String utl;
	private Instant time;
	public timestamp(String msg, String utl, Instant time) {
		super();
		this.msg = msg;
		this.utl = utl;
		this.time = time;
	}
	public timestamp() {
		
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getUtl() {
		return utl;
	}
	public void setUtl(String utl) {
		this.utl = utl;
	}
	public Instant getTime() {
		return time;
	}
	public void setTime(Instant time) {
		this.time = time;
	}
	
	

}
