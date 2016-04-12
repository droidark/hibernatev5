package net.virux.login.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import net.virux.login.dao.UserDao;
import net.virux.login.model.UserRole;

public class MyUserDetailService implements UserDetailsService{

	private UserDao userDao;
	
	public UserDao getUserDao(){
		return userDao;
	}
	
	public void setUserDao(UserDao userDao){
		this.userDao = userDao;
	}
	
	@Override
	public UserDetails loadUserByUsername(final String username) 
			throws UsernameNotFoundException {
		net.virux.login.model.User user = userDao.findByUserName(username);
		List<GrantedAuthority> authorities = buildUserAuthority(user.getUserRole());
		return buildUserForAuthentication(user, authorities);
	}

	private User buildUserForAuthentication(net.virux.login.model.User user, 
			List<GrantedAuthority> authorities){
		return new User(user.getUsername(), user.getPassword(), user.isEnabled(), 
				true, true, true, authorities);
	}
	
	private List<GrantedAuthority> buildUserAuthority(Set<UserRole> userRoles){
		
		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
		
		//	Build users authorities
		for(UserRole userRole : userRoles){
			setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
		}
		
		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);
		
		return Result;
	}
	
}
