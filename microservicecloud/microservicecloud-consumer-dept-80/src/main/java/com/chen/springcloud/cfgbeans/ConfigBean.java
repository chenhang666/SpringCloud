package com.chen.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;

@Configuration    //等同于spring applicationContext.xml
public class ConfigBean {

	@Bean
	@LoadBalanced   //自带负载均衡  默认轮询
	public RestTemplate geRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public IRule myRule() {
		return new RandomRule();
		//return new RetryRule();
	}
	
}
