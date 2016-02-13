package com.fdf.basecode.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class UserCred {
     
    @Id
    @GeneratedValue
    private Integer id;
    
	@Column(name="EMAIL")
    private String login;
    
    @Column(name="PASSWORD")
    private String password;
    
    @Column(name="ROLE")
    private int role;

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getLogin() {
        return login;
    }
 
    public void setLogin(String login) {
        this.login = login;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    } 
}
