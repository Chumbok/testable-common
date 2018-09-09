package com.chumbok.testable.common;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Provides URL related utils
 */
public class UrlUtil {

    /**
     * Extract url query params as Map
     *
     * @param url
     * @return
     */
    public Map<String, String> getQueryMap(String url) {

        int queryStringStartIndex = url.indexOf('?');
        String queryString = queryStringStartIndex != -1 ? url.substring(queryStringStartIndex + 1) : "";

        if (queryString == null || "".equals(queryString.trim())) {
            return Collections.emptyMap();
        }

        String[] params = queryString.split("&");
        Map<String, String> map = new HashMap<>();
        for (String param : params) {
            String name = param.split("=")[0];
            String value = param.split("=")[1];
            map.put(name, value);
        }

        return map;
    }

    /**
     * Encode text
     *
     * @param value
     * @return
     */
    public String utf8Encode(String value) {
        try {
            return URLEncoder.encode(value, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Decode text
     *
     * @param value
     * @return
     */
    public String utf8Decode(String value) {
        try {
            return URLDecoder.decode(value, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }
}
