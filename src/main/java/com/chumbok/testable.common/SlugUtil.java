package com.chumbok.testable.common;

import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * Provides text slug related utils
 */
public class SlugUtil {

    private static final Pattern UNICODE_PATTERN = Pattern.compile("[^\\w-]", Pattern.UNICODE_CHARACTER_CLASS);
    private static final Pattern NON_LATIN_PATTERN = Pattern.compile("[^\\w-]");
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("[\\s]");

    /**
     * Gives slugged text.
     * @param input
     * @return
     */
    public String toSlug(String input) {

        String noWhitespaceString = WHITESPACE_PATTERN.matcher(input).replaceAll("-");
        String normalizedString = Normalizer.normalize(noWhitespaceString, Normalizer.Form.NFD);
        String onlyLatinString = NON_LATIN_PATTERN.matcher(normalizedString).replaceAll("");

        if (onlyLatinString.length() > 0 && onlyLatinString.charAt(onlyLatinString.length() - 1) == '-') {
            onlyLatinString = onlyLatinString.substring(0, onlyLatinString.length() - 1);
        }

        return onlyLatinString.toLowerCase(Locale.ENGLISH);
    }

    /**
     * Gives unide slugged text.
     * @param input
     * @return
     */
    public String toSlugUnicode(String input) {

        String noWhitespaceString = WHITESPACE_PATTERN.matcher(input).replaceAll("-");
        String normalizedString = Normalizer.normalize(noWhitespaceString, Normalizer.Form.NFD);
        String onlyUnicodeString = UNICODE_PATTERN.matcher(normalizedString).replaceAll("");

        if (onlyUnicodeString.length() > 0 && onlyUnicodeString.charAt(onlyUnicodeString.length() - 1) == '-') {
            onlyUnicodeString = onlyUnicodeString.substring(0, onlyUnicodeString.length() - 1);
        }

        return onlyUnicodeString.toLowerCase(Locale.ENGLISH);
    }

}
