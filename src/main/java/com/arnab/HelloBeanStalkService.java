package com.arnab;

import org.springframework.stereotype.Service;

@Service
public class HelloBeanStalkService {
	public String getHelloBeanStalk() {
		return "<html><h1>Hello Amazon Elastic Beanstalk!!!</h1></html>";
	}
}
