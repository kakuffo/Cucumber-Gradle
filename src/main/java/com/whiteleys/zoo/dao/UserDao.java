package com.whiteleys.zoo.dao;

import com.whiteleys.zoo.domain.User;

/**
 * A data access interface for administering users.
 */
public interface UserDao {

    /**
     * Saves a new user to a persistant storage. A copy of the newly created user is returned (since
     * {@link com.whiteleys.zoo.domain.User} instances are immutable).
     *
     * @param user the user to save
     * @return the newly created user (which is not the same instance as the 'user' parameter)
     */
    void save(User user);

    /**
     * Retrieve a user from the database with the given username and password.
     *
     * @param username the username
     * @param password the password
     * @return the user, or null if no users match the credentials
     */
    User find(String username, String password);

    /**
     * Does a user with the given username exist on the database.
     *
     * @param username the username
     * @return true if a user with this username already exists, otherwise false
     */
    boolean exists(String username);
}
