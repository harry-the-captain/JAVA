 import java.util.Scanner;

public class Student {
    // Class member variables
    private String studentName;
    private String regNum;
    private Book borrowedBooks[] = new Book[3];
    private int booksCount = 0;

    // Creating object of Scanner class to
    // take input from user
    Scanner input = new Scanner(System.in);

    // Constructor
    public Student() {
        // Print statement
        System.out.println("Enter Student Name:");
        // This keywords refers to current instance
        this.studentName = input.nextLine();

        // Print statement
        System.out.println("Enter Registration Number:");
        this.regNum = input.nextLine();
    }

    // Method to register a student
    public void registerStudent() {
        System.out.println("Student Registered Successfully!");
    }

    // Method to display registered students
    public void displayRegisteredStudents() {
        System.out.println("Registered Students:");
        System.out.println("Name: " + studentName + ", Registration Number: " + regNum);
    }

    // Method to check out a book
    public void checkOutBook(Book book) {
        if (booksCount < 3) {
            borrowedBooks[booksCount++] = book;
            System.out.println("Book checked out successfully!");
        } else {
            System.out.println("You have reached the maximum limit of borrowed books.");
        }
    }

    // Method to check in a book
    public void checkInBook(Book book) {
        for (int i = 0; i < booksCount; i++) {
            if (borrowedBooks[i].equals(book)) {
                borrowedBooks[i] = null;
                // Move the last borrowed book to the checked in book's position
                borrowedBooks[i] = borrowedBooks[--booksCount];
                System.out.println("Book checked in successfully!");
                return;
            }
        }
        System.out.println("Book not found in the borrowed list.");
    }
}
 
