package com.chumbok.testable.common;

import org.junit.Test;

import java.time.Instant;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DateUtilTest {

    @Test
    public void shouldReturnCurrentDate() {

        // Given
        Date now = new Date();

        // When
        Date returnedDate = new DateUtil().getCurrentDate();

        // Then
        // Invoke time considered as delta = 10
        assertEquals(now.getTime(), returnedDate.getTime(), 10);

    }

    @Test
    public void shouldReturnCurrentTimeEpochMilli() {

        // Given

        long timeDiffBetweenCalls = 10;
        DateUtil dateUtil = new DateUtil();

        // When
        long nowInEpochMilli = dateUtil.getCurrentTimeEpochMilli();

        // Then
        assertTrue(Instant.now().getEpochSecond() - nowInEpochMilli < timeDiffBetweenCalls);
    }
}