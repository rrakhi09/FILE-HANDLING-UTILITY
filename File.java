import java.io.*;
import java.nio.file.*;

class FileOperations {
    
    public static void main(String[] args) {
        
        String fileName = "sample.txt"; // File to read, write, and modify
        String contentToWrite = "This is a sample text file that demonstrates file operations.";
        
        // Write to the file
        writeToFile(fileName, contentToWrite);
        
        // Read from the file
        String contentRead = readFromFile(fileName);
        System.out.println("Content Read from the file:");
        System.out.println(contentRead);
        
        // Modify the file by appending new content
        String contentToAppend = "Appended content: Adding some new text to the file.\n";
        appendToFile(fileName, contentToAppend);
        
        // Read again to show the updated content
        System.out.println("Updated content in the file:");
        String updatedContent = readFromFile(fileName);
        System.out.println(updatedContent);
    }
    
    /**
     * This method writes content to a file. If the file doesn't exist, it will be created.
     */

    public static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content); // Write the content to the file
            System.out.println("Content successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
    
    /**
     * This method reads the content of a file and returns it as a String.
     */

    public static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n"); 
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        
        return content.toString(); // Return the file content as a String
    }
    
    /**
     * This method appends content to an existing file. If the file doesn't exist, it will be created.
     */

    public static void appendToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(content);
            System.out.println("Content successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }
}
