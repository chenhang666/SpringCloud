package com.chen.springcloud.service;

import java.util.List;

import com.chen.springcloud.entity.Dept;

public interface DeptService {

	public boolean add(Dept dept);
	
	public Dept get(Long id);
	
	public List<Dept> list();
	
}
