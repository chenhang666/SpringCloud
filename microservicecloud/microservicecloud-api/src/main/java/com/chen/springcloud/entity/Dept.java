package com.chen.springcloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor  //ȫ�ι��췽��
@NoArgsConstructor	//�޲ι���
@Data	//set get
@Accessors(chain=true)	//��ʽ
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
		dept.setDeptno(1L).setDname("����").setDb_source("db1");
	}

}
