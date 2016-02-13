package com.fdf.basecode.dao;

import com.fdf.basecode.entity.UserCred;

public interface UserDAO {
    public UserCred getUser(String login);
 
}
