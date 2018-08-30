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
@Table(name = "banks")
@Component
@Getter
@Setter
public class Bank {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	public String name;
}
