package com.mycompany.security;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User getUser(String username);
    List<User> getUsers();

    Role saveRole(Role role);

    void addRoleToUser(String username, String role_name);


}
