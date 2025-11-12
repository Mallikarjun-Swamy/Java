package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TryWithResourcesExample {

    public static void main(String[] args) {
        // here we dont need to use finally block for clsoing resources
        try(InputStream in = TryWithResourcesExample.class.getResourceAsStream("/data.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(in))){

            System.out.println("Fie Content :" + reader.readLine());

        }catch (IOException e){
            System.out.println("Exception Occurred : " + e.getMessage());
        }

    }



}



