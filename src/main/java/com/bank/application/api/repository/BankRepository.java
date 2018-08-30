/**
 * 
 */
package com.bank.application.api.repository;

import java.util.Optional;

/**
 * @author Vishal Gupta
 *
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bank.application.api.model.Bank;

@Repository
public interface BankRepository extends CrudRepository<Bank, Integer> {
	Optional<Bank> findByName(String bank_name);
}
