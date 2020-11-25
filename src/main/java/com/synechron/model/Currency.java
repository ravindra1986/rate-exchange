/**
 * 
 */
package com.synechron.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ravindra
 *
 */

@Entity
@Table(name = "xchange")
public class Currency implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 2348595736911995503L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String currency;
	private float monthRate1;
	private float monthRate2;
	private float monthRate3;
	private float monthRate4;
	private float monthRate5;
	private float monthRate6;

	/**
	 * 
	 */
	public Currency() {
		super();
	}

	/**
	 * @param id
	 * @param currency
	 * @param monthRate1
	 * @param monthRate2
	 * @param monthRate3
	 * @param monthRate4
	 * @param monthRate5
	 * @param monthRate6
	 */
	public Currency(Long id, String currency, float monthRate1, float monthRate2, float monthRate3, float monthRate4,
			float monthRate5, float monthRate6) {
		super();
		this.id = id;
		this.currency = currency;
		this.monthRate1 = monthRate1;
		this.monthRate2 = monthRate2;
		this.monthRate3 = monthRate3;
		this.monthRate4 = monthRate4;
		this.monthRate5 = monthRate5;
		this.monthRate6 = monthRate6;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the monthRate1
	 */
	public float getMonthRate1() {
		return monthRate1;
	}

	/**
	 * @param monthRate1 the monthRate1 to set
	 */
	public void setMonthRate1(float monthRate1) {
		this.monthRate1 = monthRate1;
	}

	/**
	 * @return the monthRate2
	 */
	public float getMonthRate2() {
		return monthRate2;
	}

	/**
	 * @param monthRate2 the monthRate2 to set
	 */
	public void setMonthRate2(float monthRate2) {
		this.monthRate2 = monthRate2;
	}

	/**
	 * @return the monthRate3
	 */
	public float getMonthRate3() {
		return monthRate3;
	}

	/**
	 * @param monthRate3 the monthRate3 to set
	 */
	public void setMonthRate3(float monthRate3) {
		this.monthRate3 = monthRate3;
	}

	/**
	 * @return the monthRate4
	 */
	public float getMonthRate4() {
		return monthRate4;
	}

	/**
	 * @param monthRate4 the monthRate4 to set
	 */
	public void setMonthRate4(float monthRate4) {
		this.monthRate4 = monthRate4;
	}

	/**
	 * @return the monthRate5
	 */
	public float getMonthRate5() {
		return monthRate5;
	}

	/**
	 * @param monthRate5 the monthRate5 to set
	 */
	public void setMonthRate5(float monthRate5) {
		this.monthRate5 = monthRate5;
	}

	/**
	 * @return the monthRate6
	 */
	public float getMonthRate6() {
		return monthRate6;
	}

	/**
	 * @param monthRate6 the monthRate6 to set
	 */
	public void setMonthRate6(float monthRate6) {
		this.monthRate6 = monthRate6;
	}

	@Override
	public String toString() {
		return "Currency [id=" + id + ", currency=" + currency + ", monthRate1=" + monthRate1 + ", monthRate2="
				+ monthRate2 + ", monthRate3=" + monthRate3 + ", monthRate4=" + monthRate4 + ", monthRate5="
				+ monthRate5 + ", monthRate6=" + monthRate6 + "]";
	}
	
	

}
