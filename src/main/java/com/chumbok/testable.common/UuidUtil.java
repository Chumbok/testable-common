package com.chumbok.testable.common;

import java.util.UUID;

/**
 * Provides UUID related utils
 */
public class UuidUtil {

    /**
     * Returns ramdom UUID as String.
     *
     * @return UUID as string.
     */
    public String getRandomUuid() {
        return UUID.randomUUID().toString();
    }
}
