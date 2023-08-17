package com.goorm.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class TestFileUtil {

    private TestFileUtil() { throw new AssertionError();}
    private static File getFile(Class<?> className, String fileName) {
        ClassLoader classLoader = className.getClassLoader();
        return new File( Objects.requireNonNull( classLoader.getResource( fileName ) ).getFile()) ;
    }

    public static BufferedReader getReader(Class<?> className, String fileName) throws FileNotFoundException {
        return new BufferedReader( new FileReader( getFile( className, fileName ) ) );
    }

    public static String getString(BufferedReader reader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while((line = reader.readLine()) != null) {
            stringBuilder.append(line).append("\n");
        }
        return stringBuilder.toString().trim();
    }

    public static int getInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public static double getDouble(BufferedReader reader) throws IOException {
        return Double.parseDouble(reader.readLine());
    }

}
