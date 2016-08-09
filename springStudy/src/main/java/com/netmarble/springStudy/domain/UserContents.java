package com.netmarble.springStudy.domain;

public class UserContents {
	private int USER_SEQ;
    private String USER_ID;
    private String USER_PASS;
    private String USER_NAME;
        
    public int getUSER_SEQ() {
        return USER_SEQ;
    }

    public void setUSER_SEQ(int USER_SEQ) {
        this.USER_SEQ = USER_SEQ;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSER_PASS() {
        return USER_PASS;
    }

    public void setUSER_PASS(String USER_PASS) {
        this.USER_PASS = USER_PASS;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }


}
