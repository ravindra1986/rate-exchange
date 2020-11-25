/**
 * 
 */
package com.synechron.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.synechron.model.Currency;

/**
 * @author ravindra
 *
 */
public interface XchangeRateRepository extends JpaRepository<Currency, Long>{

}
