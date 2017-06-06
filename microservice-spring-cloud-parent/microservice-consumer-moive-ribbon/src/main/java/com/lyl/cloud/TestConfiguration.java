package com.lyl.cloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
@ExcludeFromComponenScan
public class TestConfiguration {

	@Bean
	public IRule ribbonRule() {
		return new RandomRule();
	}
}
