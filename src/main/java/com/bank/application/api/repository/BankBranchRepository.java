/**
 * 
 */
package com.bank.application.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.bank.application.api.model.BankBranch;
import com.bank.application.api.model.Branch;

/**
 * @author Vishal Gupta
 *
 */
@Repository
public interface BankBranchRepository extends JpaRepository<BankBranch, Integer> {

	@Query("select b from BankBranch b where b.bank_name=?1 and b.city=?2")
	Optional<BankBranch> findByBankNameAndCityAll(String bank_name, String city );
	Optional<Branch> findByCity(String city);
}
