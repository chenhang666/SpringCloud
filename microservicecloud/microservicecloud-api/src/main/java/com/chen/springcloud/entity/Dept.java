package com.chen.springcloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor  //全参构造方法
@NoArgsConstructor	//无参构造
@Data	//set get
@Accessors(chain=true)	//链式
public class Dept implements Serializable{

	private Long deptno;
	private String dname;
	private String db_source;
	
	public Dept(long deptno) {
		 super();
		 this.deptno = deptno;
	}
	
	public static void main(String[] args) {
		Dept dept = new Dept();
		dept.setDeptno(1L).setDname("张三").setDb_source("db1");
	}

}
