package patternPrinting.type_04_SpecialPatterns;

import java.io.File;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
       String filepath = "F:\\";
       File file = new File(filepath );
       String[] names = file.list();
        System.out.println(names.length);
       for (String string : names){
           System.out.println(string);
       }



    }




}
