/**
 * 
 */
package com.bank.application.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Vishal Gupta
 *
 */

@Entity 
@Table(name = "bank_branches")
@Component
@Getter
@Setter
@NamedQuery(name = "BankBranch.findByNameAndCity",
query = "select b from BankBranch b where b.bank_name=?1 and b.city=?2")
public class BankBranch {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public String ifsc;
	public int bank_id;
	public String branch;
	public String address;
	public String city;
	public String district;
	public String state;
	public String bank_name;
}
