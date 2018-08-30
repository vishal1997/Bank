/**
 * 
 */
package com.bank.application.api.managerImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank.application.api.helper.Helper;
import com.bank.application.api.manager.Manager;
import com.bank.application.api.model.BankBranch;
import com.bank.application.api.model.Branch;

/**
 * @author Vishal Gupta
 *
 */
@Component
public class ManagerImplementation implements Manager {

	/* (non-Javadoc)
	 * @see com.bank.application.api.manager.Manager#getBranchDetailsByIfsc(int)
	 */
	
	@Autowired
	private Helper helper;
	
	@Override
	public Optional<Branch> getBranchDetailsByIfsc(String ifsc) {
		return helper.getBranchDetailsByIfsc(ifsc);
	}

	@Override
	public List<BankBranch> getBranchDetailsByBankNameAndCity(String bankName, String city) {
		return helper.getBranchDetailsByBankNameAndCity(bankName, city);
	}

}
