/**
 * 
 */
package com.synechron.model;

import java.io.Serializable;

/**
 * @author Ravindra Chacravarti
 *
 */
public class LatestXchangeRate implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6651676560973537512L;
	private String currency;
	private float rate;

	/**
	 * 
	 */
	public LatestXchangeRate() {
		super();
	}

	/**
	 * @param currency
	 * @param rate
	 */
	public LatestXchangeRate(String currency, float rate) {
		super();
		this.currency = currency;
		this.rate = rate;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the rate
	 */
	public float getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "LatestXchangeRate [currency=" + currency + ", rate=" + rate + "]";
	}

}
