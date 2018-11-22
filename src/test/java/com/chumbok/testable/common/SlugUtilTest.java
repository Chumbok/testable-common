package com.chumbok.testable.common;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlugUtilTest {

    @Test
    public void toSlugReplaceWhitespaceWithHyphenTest() {
        assertEquals("hello-world", new SlugUtil().toSlug("hello world"));
    }

    @Test
    public void toSlugNormalizeTest() {
        assertEquals("hello-world", new SlugUtil().toSlug("hellô world"));
    }

    @Test
    public void toSlugRemoveNonLatinAndRemoveLastHyphenTest() {
        assertEquals("hello-world", new SlugUtil().toSlug("hello world مرحبا"));
    }

    @Test
    public void toSlugtoLowercaseTest() {
        assertEquals("hello-world", new SlugUtil().toSlug("Hello World"));
    }

    @Test
    public void toSlugUnicodeContainsUnicode() {
        assertEquals("hello-বাংলাদেশ-hello", new SlugUtil().toSlugUnicode("Hello বাংলাদেশ! Hello!"));
    }
}