package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WhatIsExceptionHandling {

    /*
       What Is Exception Handling in Java?
        Exception Handling in Java is a mechanism to handle runtime errors
        (like divide-by-zero, invalid input, file not found, etc.)
        so that the normal flow of the application is not interrupted.
        Without it, your program would terminate abruptly when an Exception occurs.


       Why Do We Need Exception Handling?
        To prevent abnormal termination of the program.
        To gracefully handle unexpected conditions (I/O errors, invalid data, DB connection loss, etc.).
        To separate error-handling code from normal logic — making the program more readable and maintainable.


       Rules of Exception Handling:
       1. Every try block must be followed by either catch or finally
           1. try { }
              catch(Exception e) { }

           2. try { }
              finally { }

        2. We can have multiple catch blocks catch blocks and should be ordered from most specific to most general (child class to parent Class)
            Because exceptions are checked top to bottom — otherwise compile error.

                    try {
                        int a = 10 / 0;
                    } catch (ArithmeticException e) {
                        System.out.println("Arithmetic error");
                    } catch (Exception e) {
                        System.out.println("General error");

          3. finally always executes
                Even if:
                      1.  an exception is not caught or not
                      2.  there is a return in try or catch
                Ex:     try {
                        int data = 50 / 0;
                    } catch (ArithmeticException e) {
                        System.out.println("Exception handled");
                        return;
                    } finally {
                        System.out.println("Finally always runs");
                    }
             4. You can rethrow exceptions
                  Useful when you want to handle and still propagate.
                   Ex:     try {
                            riskyOperation();
                        } catch (SQLException e) {
                            log(e);
                            throw e; // rethrow
                        }


            Difference Between Normal Try-Catch-Finally and Try-With-Resources
            Feature     	              Normal Try-Catch-Finally	                            Try-With-Resources
            Resource closing	          Must be done manually in finally	                    Automatically done by JVM
            Code length	                  More verbose	                                        Cleaner and shorter
            Risk of missing close()	      High — may cause resource leaks	                    Low — automatically handled
            Multiple resources            Nested try or multiple close calls	                All declared in one line
            Introduced in	              Available since Java 1.0	                            Introduced in Java 7
            Implements	                  No requirement	                                    Resource must implement AutoCloseable


     */

    public static void main(String[] args) {

        // Real-Time Examples in Applications

        // 1. Reading configuration files or user uploads.

                try (FileReader fr = new FileReader("config.txt")){
                    //code for reading the file
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

         // 2. Handling connectivity or SQL errors.

                String url = "databases url";
                String user = "DB userid" ;
                String pass = "DB Password";
                Connection con;

                try {
                    con = DriverManager.getConnection(url, user, pass);
                    // execute query
                } catch (SQLException e) {
                    System.out.println("Database error: " + e.getMessage());
                }finally {
                    con = null;
                }

        // 3. Web Applications



                try {
         //           int id = Integer.parseInt(request.getParameter("userId"));
                } catch (NumberFormatException e) {
        //            response.sendError(400, "Invalid user ID");
                }


    }
}
