package com.chumbok.testable.common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Provides file system related utils
 */
public class FileSystemUtil {

    /**
     * Write file byte to provided Path.
     * @param path
     * @param fileBytes
     * @throws IOException
     */
    public void write(Path path, byte[] fileBytes) throws IOException {
        Files.write(path, fileBytes);
    }

    /**
     * Create directories as provided Path.
     * @param path
     * @throws IOException
     */
    public void createDirectories(Path path) throws IOException {
        Files.createDirectories(path);
    }
}
