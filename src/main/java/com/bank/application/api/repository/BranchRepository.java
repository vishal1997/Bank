/**
 * 
 */
package com.bank.application.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.application.api.model.Branch;

/**
 * @author Vishal Gupta
 *
 */
@Repository
public interface BranchRepository extends CrudRepository<Branch, String>{

}
