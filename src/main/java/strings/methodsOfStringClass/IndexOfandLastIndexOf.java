package strings.methodsOfStringClass;

public class IndexOfandLastIndexOf {

    //indexOf(String str) Method
    //Returns the index of the first occurrence of a specified substring or character in a given main String
    //Returns -1 if the substring is not found
    //It will start checking from startindex (0) to last index (lenth()-1) (from left to right)

    //lastIndexOf(String str) Method
    //Returns the index of the last occurrence of a specified substring or character in a given main String
    //Returns -1 if the substring is not found
    //It will start checking from lastindex (lenth()-1) to first index(0) (from right to left)

    public static void main(String[] args) {

        String name = "Mallikarjun";
        int firstIndex = name.indexOf('M');
        int lastIndex = name.indexOf('n');
        System.out.println(firstIndex); //0
        System.out.println(lastIndex);  //10

        System.out.println(name.indexOf('a'));  //1
        System.out.println(name.lastIndexOf('a')); //6

        //-----------------------------------------------------------------------------------

        String sentence = "The quick brown fox jumps over the lazy dog";
        int indexFox = sentence.indexOf("fox");
        int indexTheLast = sentence.lastIndexOf("the");
        System.out.println(indexFox);  //16
        System.out.println(indexTheLast);  //31


        //------------------------------------------------------
        //Real-Time Uses
        //1. getting Domain name, based on index of '@'

        String email = "arjun@google.com";
        String domain =  email.substring(email.indexOf('@')+1);
        System.out.println(domain);

        //2. getting file Extension, based on index of '.'
        String fileName = "document.pdf";
        String extention = fileName.substring(fileName.indexOf('.')+1);
        System.out.println(extention);

    }
}
