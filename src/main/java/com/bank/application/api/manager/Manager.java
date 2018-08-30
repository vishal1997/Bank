/**
 * 
 */
package com.bank.application.api.manager;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.bank.application.api.model.BankBranch;
import com.bank.application.api.model.Branch;

/**
 * @author Vishal Gupta
 *
 */
@Component
public interface Manager {
	public Optional<Branch> getBranchDetailsByIfsc(String ifsc);
	public List<BankBranch> getBranchDetailsByBankNameAndCity(String bankName, String city);
}
