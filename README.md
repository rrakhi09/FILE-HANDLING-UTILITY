# FILE-HANDLING-UTILITY

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: RAKHI RATHI

*INTERN ID*: CT080FA

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 4 WEEKS

*MENTOR*:NEELA SANTOSH

##DESCRIPTION OF TASK
File Handling is an integral part of any programming language as file handling enables us to store the output of any particular program in a file and allows us to perform certain operations on it.
In simple words, file handling means reading and writing data to a file.

File Operations
The following are the several operations that can be performed on a file in Java:

Create a File
Read from a File
Write to a File

File Writing (writeToFile method):

This method creates a new file or overwrites an existing file and writes the specified content to it.
It uses BufferedWriter wrapped around FileWriter to improve performance during writing.
File Reading (readFromFile method):

This method reads the content of a file line by line and returns the entire file content as a single String.
It uses BufferedReader wrapped around FileReader to read each line efficiently.
File Appending (appendToFile method):

This method appends new content to the end of an existing file without overwriting the original content.
It uses FileWriter in append mode by passing true as the second argument, which ensures content is added to the file instead of replacing it.

The Java program presented above is designed to demonstrate how to perform basic file operations such as reading, writing, and modifying text files. These operations are essential when working with file-based input and output (I/O) in Java. The program is structured into methods to handle each of these operations, and it uses built-in Java classes like BufferedWriter, BufferedReader, and FileWriter to interact with text files. Below, we'll break down the components of the program and explain how each part works in detail.

- Imports and Class Definition
The program begins by importing the necessary classes from Java's I/O library. Specifically, it uses BufferedWriter, BufferedReader, FileWriter, and FileReader to handle file writing, reading, and appending. Additionally, java.nio.file.Files could be used for other advanced file handling operations, but it’s not necessary in this specific example. The class FileOperations is defined as the container for the operations.
- Main Method
The main method serves as the entry point for the program. Here, the program defines the name of the file (sample.txt) that will be used for reading, writing, and modifying. It also defines the content to be written and appended to the file. The flow of operations is executed in sequence:

First, it writes initial content to the file.
Second, it reads and prints the current content of the file.
Third, it appends new content to the file.
Finally, it reads and prints the updated content.
-Writing to a File: writeToFile Method
The writeToFile method is responsible for creating a file (if it doesn't already exist) and writing the provided content to it. The method takes two arguments: the file name (fileName) and the content to be written (content). It uses BufferedWriter wrapped around a FileWriter to perform the actual writing. The BufferedWriter provides a more efficient way to write text, as it buffers the data before writing it to the file.
-Reading from a File: readFromFile Method
The readFromFile method reads the content from a specified file. It uses a BufferedReader wrapped around a FileReader to read the file line by line. The method appends each line to a StringBuilder object, which is used to efficiently concatenate the lines. After reading the file, the method returns the complete content as a string.
-Appending to a File: appendToFile Method
The appendToFile method is similar to the writeToFile method but with a key difference: it appends the new content to the end of the file rather than overwriting the existing content. This is accomplished by passing true as the second argument to the FileWriter constructor, which enables the append mode.

output:
![Image](https://github.com/user-attachments/assets/7397d15f-d047-4c6c-9b7e-83dd2cfcc2dd)
