package com.upemor.petstorerest.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Orderpet {
	
	@Id
	@GeneratedValue
	private int id;
	
	private Date created;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pet_id")
    private PetDTO pet;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private UserDTO user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Date getCreated() {
		return created;
	}
	
	public Orderpet() {
		// TODO Auto-generated constructor stub
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}