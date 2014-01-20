package com.whiteleys.zoo.service;

import com.whiteleys.zoo.domain.Sex;
import com.whiteleys.zoo.domain.User;
import org.joda.time.LocalDate;

import java.util.Date;

/**
 * A service for administering {@link com.whiteleys.zoo.domain.User users}.
 */
public interface UserService {

    /**
     * Register a new user. The user data must already have been validated as this service does not
     * provide any validation capability. The newly created user will have been assigned a userId.
     *
     * @param username the username
     * @param password the password
     * @param sex      the sex
     * @param dob      the date of birth
     * @param postcode postcode
     * @return the newly created user
     */
    User register(String username, String password, Sex sex, Date dob, String postcode);

    /**
     * Get the user with the given username and password, throwing an exception if the credentials
     * are invalid.
     *
     * @param username the username
     * @param password the password
     * @return the user
     * @throws IllegalArgumentException if the username and password don't match on any users
     * @see #authenticate(String, String)
     */
    User getUser(String username, String password);

    /**
     * Authenticate a user's credentials.
     *
     * @param username the username
     * @param password the password
     * @return true if the credentials are valid, otherwise false
     */
    boolean authenticate(String username, String password);

    /**
     * Does a user with the given username exist on the database.
     *
     * @param username the username
     * @return true if a user with this username already exists, otherwise false
     */
    boolean exists(String username);
}
