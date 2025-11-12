package exceptionHandling;

import java.io.*;

public class NormalTryCatchFinally {

    public static void main(String[] args) {
        BufferedReader reader =null;

        try {
           // here using relative file path for data.txt
           // reader = new BufferedReader(new FileReader("src/main/java/exceptionHandling/data.txt"));

           // here using path from resource folder (this means our data.txt file is in resource folder)
            InputStream in =  NormalTryCatchFinally.class.getResourceAsStream("/data.txt");
            reader = new BufferedReader(new InputStreamReader(in));

            System.out.println("file Content " + reader.readLine());

        } catch (IOException e){
            System.out.println("Exception Occurred: " + e.getMessage());
        } finally {
            //manually closing resource
            try {
                if(reader != null) {
                    reader.close();
                    System.out.println("Reader Closed successfully");

                }
            }catch (IOException e){
                System.out.println("Error While closing reader");
            }
        }

        /*
            What’s happening here?
            The FileReader and BufferedReader must be closed manually in the finally block.
            Even if an exception occurs, the finally block ensures cleanup.
            But it’s verbose, and if multiple resources exist, cleanup code becomes messy.

         */



    }

}
