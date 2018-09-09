package com.chumbok.testable.common;

import java.util.UUID;

/**
 * Provides UUID related utils
 */
public class UuidUtil {

    /**
     * Returns ramdom UUID as String
     * @return
     */
    public String getUuid() {
        return UUID.randomUUID().toString();
    }
}
