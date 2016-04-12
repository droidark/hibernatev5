package net.virux.login.dao;

import net.virux.login.model.User;

public interface UserDao {

	User findByUserName(String username);
}
