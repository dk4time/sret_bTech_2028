/*
 * Topic: File Handling
 * Core idea: try-with-resources (Java's closest match to Python's `with`)
 * closes a resource automatically, even if an exception is thrown mid-read -
 * manual open/close is easy to get wrong. Modern Java code leads with this.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileHandling {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("sample.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("Welcome To Java\n");
            writer.write("File Handling Example");
        }

        // Simplest way to read a whole small file
        System.out.println(Files.readString(path));

        // Line by line, still auto-closing
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line.strip());
            }
        }

        // Whole file as a List<String> in one call
        List<String> lines = Files.readAllLines(path);
        System.out.println(lines);

        // Appending
        try (BufferedWriter appender = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
            appender.write("\nLearning Java");
        }

        System.out.println(Files.readString(path));
    }
}
