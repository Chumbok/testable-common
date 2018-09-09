package com.chumbok.testable.common;

import javax.servlet.http.Cookie;

/**
 * Provides cookie related utils
 */
public class CookieUtil {

    /**
     * Create new instance of Cookie.
     *
     * @param name
     * @param value
     * @return new Cookie instance
     */
    public Cookie getCookie(String name, String value) {
        return new Cookie(name, value);
    }
}
