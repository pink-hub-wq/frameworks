package com.seiryo.po;

import java.util.List;

public class Dormitory {
	private Integer d_id;
	private Integer s_dormitoryid;
	private String d_dormbuilding;
	private String d_bedtotal;
	private String d_bed;
	private String a_name;
	private List<Student> list;

	public Integer getD_id() {
		return d_id;
	}

	public void setD_id(Integer d_id) {
		this.d_id = d_id;
	}

	public Integer getS_dormitoryid() {
		return s_dormitoryid;
	}

	public void setS_dormitoryid(Integer s_dormitoryid) {
		this.s_dormitoryid = s_dormitoryid;
	}

	public String getD_dormbuilding() {
		return d_dormbuilding;
	}

	public void setD_dormbuilding(String d_dormbuilding) {
		this.d_dormbuilding = d_dormbuilding;
	}

	public String getD_bedtotal() {
		return d_bedtotal;
	}

	public void setD_bedtotal(String d_bedtotal) {
		this.d_bedtotal = d_bedtotal;
	}

	public String getD_bed() {
		return d_bed;
	}

	public void setD_bed(String d_bed) {
		this.d_bed = d_bed;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public Dormitory(Integer d_id, Integer s_dormitoryid, String d_dormbuilding, String d_bedtotal, String d_bed,
			String a_name, List<Student> list) {
		super();
		this.d_id = d_id;
		this.s_dormitoryid = s_dormitoryid;
		this.d_dormbuilding = d_dormbuilding;
		this.d_bedtotal = d_bedtotal;
		this.d_bed = d_bed;
		this.a_name = a_name;
		this.list = list;
	}

	public Dormitory(Integer d_id, Integer s_dormitoryid, String d_dormbuilding, String d_bedtotal, String d_bed,
			String a_name) {
		super();
		this.d_id = d_id;
		this.s_dormitoryid = s_dormitoryid;
		this.d_dormbuilding = d_dormbuilding;
		this.d_bedtotal = d_bedtotal;
		this.d_bed = d_bed;
		this.a_name = a_name;
	}

	public Dormitory() {
		super();
	}

	@Override
	public String toString() {
		return "Dormitory [d_id=" + d_id + ", s_dormitoryid=" + s_dormitoryid + ", d_dormbuilding=" + d_dormbuilding
				+ ", d_bedtotal=" + d_bedtotal + ", d_bed=" + d_bed + ", a_name=" + a_name + ", list=" + list + "]";
	}
}
