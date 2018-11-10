package com.cg;

public class CurrencyConverterImpl implements CurrencyConverter {
	private ExchangeService exchangeService;


	public CurrencyConverterImpl() {
		super();
		System.out.println("currencyConverterImpl()");
		// TODO Auto-generated constructor stub
	}


	public ExchangeService getExchangeService() {
		return exchangeService;
	}


	public void setExchangeService(ExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}


	public double dollarsToRupees(double dollars) {
		// TODO Auto-generated method stub
		System.out.println("dollarsToRupees()");
		return dollars * exchangeService.getExchangeRate();
	}

}
