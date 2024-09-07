package com.seiryo.service;

import java.util.List;

import com.seiryo.po.PageInfo;
import com.seiryo.po.Visitor;

public interface VisitorService {
	public PageInfo<Visitor> findPageInfo(String v_name, Integer v_phone, Integer pageIndex, Integer pageSize);

	public int addVisitor(Visitor visitor);

	public List<Visitor> getAll();
}
