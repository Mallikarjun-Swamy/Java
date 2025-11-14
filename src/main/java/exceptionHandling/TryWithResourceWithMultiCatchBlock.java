package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceWithMultiCatchBlock {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            br.readLine();               //java.io.FileNotFoundException: data.txt (The system cannot find the file specified)
            Thread t1 = new Thread();
            t1.start();
            t1.setPriority(15);
            System.out.println(10/0);

        }catch (ArithmeticException | IllegalArgumentException | IOException e){
            e.printStackTrace();
        }





    }


}
