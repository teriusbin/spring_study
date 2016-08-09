package com.netmarble.springstudy.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by mydus on 2016-08-01.
 */
public class User {
    private int USER_SEQ;
    @JsonProperty
    private String USER_ID;
    @JsonProperty
    private String USER_PASS;
    @JsonProperty
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((USER_ID == null) ? 0 : USER_ID.hashCode());
		result = prime * result + ((USER_NAME == null) ? 0 : USER_NAME.hashCode());
		result = prime * result + ((USER_PASS == null) ? 0 : USER_PASS.hashCode());
		result = prime * result + USER_SEQ;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (USER_ID == null) {
			if (other.USER_ID != null)
				return false;
		} else if (!USER_ID.equals(other.USER_ID))
			return false;
		if (USER_NAME == null) {
			if (other.USER_NAME != null)
				return false;
		} else if (!USER_NAME.equals(other.USER_NAME))
			return false;
		if (USER_PASS == null) {
			if (other.USER_PASS != null)
				return false;
		} else if (!USER_PASS.equals(other.USER_PASS))
			return false;
		if (USER_SEQ != other.USER_SEQ)
			return false;
		return true;
	}
}
