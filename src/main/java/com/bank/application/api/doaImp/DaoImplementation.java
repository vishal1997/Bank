/**
 * 
 */
package com.bank.application.api.doaImp;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.bank.application.api.doa.Dao;
import com.bank.application.api.model.BankBranch;
import com.bank.application.api.model.Branch;
import com.bank.application.api.repository.BankBranchRepository;
import com.bank.application.api.repository.BranchRepository;

/**
 * @author Vishal Gupta
 *
 */
@Component
public class DaoImplementation implements Dao {
	
	@Autowired
	private BranchRepository branchRepo;
	
	@PersistenceContext
	 private EntityManager entityManager;
	/* (non-Javadoc)
	 * @see com.bank.application.api.doa.Doa#getBranchDetailsByIfsc(int)
	 */
	@Override
	public Optional<Branch> getBranchDetailsByIfsc(String ifsc) {
		
		try {
			return branchRepo.findById(ifsc);
		} catch(NullPointerException ex) {
			throw new RuntimeException("Branch cannot be null Null", ex);
		}
	}

	@Override
	public List<BankBranch> getBranchDetailsByBankNameAndCity(String bankName, String city) {

		try {
			Query query = entityManager.createNamedQuery(
					   "BankBranch.findByNameAndCity", BankBranch.class);
			query.setParameter(1,bankName);
			query.setParameter(2, city);
			return query.getResultList();
		} catch(NullPointerException ex) {
			throw new RuntimeException("Branch cannot be null Null", ex);
		}
	}
}
