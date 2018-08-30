/**
 * 
 */
package com.bank.application.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Vishal Gupta
 *
 */

@Entity 
@Table(name = "branches")
@Component
@Getter
@Setter
public class Branch {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public String ifsc;
	public int bank_id;
	public String branch;
	public String address;
	public String city;
	public String district;
	public String state;
}
