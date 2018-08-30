/**
 * 
 */
package com.bank.application.api.helperImp;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.bank.application.api.doa.Dao;
import com.bank.application.api.helper.Helper;
import com.bank.application.api.model.BankBranch;
import com.bank.application.api.model.Branch;

/**
 * @author Vishal Gupta
 *
 */
@Component
public class HelperImplementation implements Helper {

	/* (non-Javadoc)
	 * @see com.bank.application.api.helper.Helper#getBranchDetailsByIfsc(int)
	 */
	
	@Autowired
	private Dao dao;
	
	@Override
	public Optional<Branch> getBranchDetailsByIfsc(String ifsc) {
		return dao.getBranchDetailsByIfsc(ifsc);
	}

	@Override
	public List<BankBranch> getBranchDetailsByBankNameAndCity(String bankName, String city) {
		bankName = bankName.replaceAll("%20", " ");
		city = city.replaceAll("%20",  " ");
		return dao.getBranchDetailsByBankNameAndCity(bankName, city);
	}	
}
