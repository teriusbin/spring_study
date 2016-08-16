package com.netmarble.springstudy.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by mydus on 2016-08-01.
 */
public class User {
    private int seq;
    @JsonProperty
    private String id;
    @JsonProperty
    private String pass;
    @JsonProperty
    private String name;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		User user = (User) o;

		if (seq != user.seq) return false;
		if (!id.equals(user.id)) return false;
		if (!pass.equals(user.pass)) return false;
		return name.equals(user.name);

	}

	@Override
	public int hashCode() {
		int result = seq;
		result = 31 * result + id.hashCode();
		result = 31 * result + pass.hashCode();
		result = 31 * result + name.hashCode();
		return result;
	}
}
