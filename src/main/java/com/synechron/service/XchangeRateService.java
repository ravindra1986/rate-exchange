/**
 * 
 */
package com.synechron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechron.model.Currency;
import com.synechron.repository.XchangeRateRepository;

/**
 * @author Ravindra Chacravarti
 * @version 1.0
 * @since 19/11/2020
 *
 */
@Service
public class XchangeRateService {
	@Autowired
	private XchangeRateRepository xchangeRateRepository;

	public List<Currency> getAllCurrency() {
		return xchangeRateRepository.findAll();
	}
}
