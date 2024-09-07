package com.edu.seiryo.data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Data {
	private String array[];
	private List<String> list;
	private Set<String> set;
	private Map<Integer, String> map;
	private Properties properties;
	public String[] getArray() {
		return array;
	}
	public void setArray(String[] array) {
		this.array = array;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public Data(String[] array, List<String> list, Set<String> set, Map<Integer, String> map, Properties properties) {
		super();
		this.array = array;
		this.list = list;
		this.set = set;
		this.map = map;
		this.properties = properties;
	}
	public Data() {
		super();
	}
	@Override
	public String toString() {
		return "Data [array=" + Arrays.toString(array) + ", list=" + list + ", set=" + set + ", map=" + map
				+ ", properties=" + properties + "]";
	}
	
}
