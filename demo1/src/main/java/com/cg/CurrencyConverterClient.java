package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CurrencyConverterClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory=new ClassPathXmlApplicationContext("CurrencyConverter.xml");
		CurrencyConverter curr=(CurrencyConverter) factory.getBean("currencyConverter");
		double rupees= curr.dollarsToRupees(50.0);
		System.out.println("50 $ is"+ rupees+"Rs.");

	}

}
