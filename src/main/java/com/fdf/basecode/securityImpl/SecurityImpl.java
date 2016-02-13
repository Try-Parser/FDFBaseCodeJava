package com.fdf.basecode.securityImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fdf.basecode.dao.UserDAO;
import com.fdf.basecode.entity.UserCred;

@Service("Security")
@Transactional(readOnly = true)
public class SecurityImpl implements UserDetailsService {

	@Autowired
	private UserDAO userdao;
	
	
	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {
		
		UserCred userdomain = userdao.getUser(arg0);
		
        boolean accountEnabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;
        
        if(userdomain.getId()==0) {
        	throw new UsernameNotFoundException("User not found");
        } else {
	        return new User(
	        		userdomain.getLogin(), 
	        		userdomain.getPassword(), 
	                accountEnabled, 
	                accountNonExpired, 
	                credentialsNonExpired, 
	                accountNonLocked,
	                getAuthorities(userdomain.getRole())
	        );
        }
	}

    public Collection<? extends GrantedAuthority> getAuthorities(int i) {
        List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(i));
        return authList;
    }

	private List<String> getRoles(int i) {
        List<String> roles = new ArrayList<String>();
        if (i == 1) {
            roles.add("ROLE_ADMIN");
        } else if (i == 2) {
            roles.add("ROLE_CUSTOMER");
        }else if (i == 3){
        	roles.add("ROLE_USER");
        }
        return roles;
	}
	
    public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
         
        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        return authorities;
    }

}
