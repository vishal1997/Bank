/**
 * 
 */
package com.bank.application.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.bank.application.api.manager.Manager;
import com.bank.application.api.model.BankBranch;
import com.bank.application.api.model.Branch;


@org.springframework.web.bind.annotation.RestController
@EnableWebMvc
@RequestMapping("/api/v1/")
public class RestController {

	@Autowired 
	private Manager manager;
	
	@RequestMapping(value = "get/{ifsc}", method = RequestMethod.GET)
	public Optional<Branch> getUser(@PathVariable("ifsc" ) final String ifsc) throws Exception {
	
		try {
			return manager.getBranchDetailsByIfsc(ifsc);
		} catch(Exception ex) {
			throw ex;
		}
	}
	
	@RequestMapping(value = "get/{bankName}/{city}", method = RequestMethod.GET)
	public List<BankBranch> getUser(@PathVariable("bankName") final String bankName,
									@PathVariable("city") final String city) throws Exception {
	
		try {
			return manager.getBranchDetailsByBankNameAndCity(bankName, city);
		} catch(Exception ex) {
			throw ex;
		}
	}
}
