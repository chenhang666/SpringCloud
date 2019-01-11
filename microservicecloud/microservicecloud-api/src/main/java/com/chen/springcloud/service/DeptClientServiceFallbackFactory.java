package com.chen.springcloud.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.chen.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable cause) {
		
		return new DeptClientService() {
			
			@Override
			public List<Dept> list() {
				
				return null;
			}
			
			@Override
			public Dept get(long id) {
				return new Dept().setDeptno(id)
						.setDname("该服务已暂停服务")
						.setDb_source("no this database in MySQL");
			}
			
			@Override
			public boolean add(Dept dept) {
				
				return false;
			}
		};
	}

}
