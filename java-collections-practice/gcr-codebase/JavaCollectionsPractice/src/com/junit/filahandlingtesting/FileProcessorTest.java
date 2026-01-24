package com.junit.filahandlingtesting;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class FileProcessorTest {

    FileProcessor processor;
    String filename = "testfile.txt";

    @Before
    public void setUp() {
        processor = new FileProcessor();
    }

    @After
    public void tearDown() {
        File file = new File(filename);
        if (file.exists()) {
            file.delete();   // cleanup after test
        }
    }

    // Test writing and reading content
    @Test
    public void testWriteAndReadFile() throws IOException {
        String content = "Hello JUnit";

        processor.writeToFile(filename, content);
        String result = processor.readFromFile(filename);

        assertEquals(content, result);
    }

    // Test file existence
    @Test
    public void testFileExistsAfterWrite() throws IOException {
        processor.writeToFile(filename, "Test Data");

        File file = new File(filename);
        assertTrue(file.exists());
    }

    // Test exception when file does not exist
    @Test(expected = IOException.class)
    public void testReadFileNotExists() throws IOException {
        processor.readFromFile("nofile.txt");
    }
}
