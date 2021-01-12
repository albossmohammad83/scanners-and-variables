/*
 *  Assignment Chapter 2 pre-Lab
 *  Description: scanners and variables
 *  Name: Mohammad Abdelrahman
 *  ID: 920158652
 *  Class: CSC 211-02
 *  Semester: Fall 2020
 */
import java.util.Scanner;
public class Prelab2 {
    public static void main(String[] args){
        System.out.println("Welcome, to my program!");
        //printing an int value
        System.out.println(99);
        //printing a double value
        System.out.println(99.9);
        //Declaring a String variable
        String studentName;
        //Assigning a value to the String variable
        studentName = "Zack Sims";
        //Declaring an int variable
        int studentAge;
        //Assigning a value to an int variable
        studentAge = 19;
        /*
            Declaring a double variable and
            assigning a value in one line
        */
        double studentGpa = 3.84;
        //Printing all variable values
        System.out.println(studentName);
        System.out.println(studentAge);
        System.out.println(studentGpa);
        Scanner input = new Scanner(System.in);
        //Creating a question to the user
        System.out.print("What is your name? ");
        //Store the user input in a variable
        String userName = input.nextLine();
        //Print the user's name back to the display console
        System.out.print("The user's name is ");
        System.out.println(userName);
    }
}
