package com.chumbok.testable.common;

/**
 * Provides System related utils
 */
public class SystemUtil {

    /**
     * Constant for user's home directory key
     */
    private static final String USER_HOME = "user.home";

    /**
     * Return user home directory path.
     * Example: /Users/mossaddeque
     */
    public String getUserHome() {
        return System.getProperty(USER_HOME);
    }

}
