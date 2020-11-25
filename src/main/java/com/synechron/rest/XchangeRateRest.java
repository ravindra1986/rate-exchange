/**
 * 
 */
package com.synechron.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.synechron.exception.ResourceNotFoundException;
import com.synechron.model.Currency;
import com.synechron.model.LatestXchangeRate;
import com.synechron.service.XchangeRateService;

/**
 * @author Ravindra Chacravarti
 *
 */
@RestController
@RequestMapping("/api/v1")
public class XchangeRateRest {
	@Autowired
	private XchangeRateService xchangeRateService;

	@GetMapping("/history")
	public List<Currency> getHistory() throws ResourceNotFoundException {
		return xchangeRateService.getAllCurrency();

	}

	@GetMapping("/latest")
	public List<LatestXchangeRate> getlatest() throws ResourceNotFoundException {

		List<LatestXchangeRate> xChangeList = new ArrayList<LatestXchangeRate>();
		List<Currency> currencyList = xchangeRateService.getAllCurrency();
		if (currencyList != null && currencyList.size() > 0) {
			for (Currency cur : currencyList) {
				LatestXchangeRate latestXchangeRate = new LatestXchangeRate();
				latestXchangeRate.setCurrency(cur.getCurrency());
				latestXchangeRate.setRate(cur.getMonthRate1());
				xChangeList.add(latestXchangeRate);
			}
			return xChangeList;
		} else {
			throw new ResourceNotFoundException("Record not found for latest month.");
		}

	}

}
