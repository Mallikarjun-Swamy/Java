package assesments.onNov9th2025;

public class PercentageElements {

    public static void main(String[] args) {
        String str = "abc12@#31cde";

        int upperOvelsCount = 0;
        int lowerOvelsCount = 0;
        int upperCaseConstoCount = 0;
        int lowerCaseConstoCount = 0;
        int specialCharCount = 0;
        int numbersCount = 0;

        for (int i = 0; i <str.length() ; i++) {
            if(((int) (str.charAt(i)) >= 32 && ((int) (str.charAt(i))) <= 126)){
                if( (int) (str.charAt(i)) >=65 && ((int) (str.charAt(i))) <=(65+26)){
                    if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
                        upperOvelsCount++;
                    }else {
                        upperCaseConstoCount++;
                    }

                }else if((int) (str.charAt(i)) >=97 && ((int) (str.charAt(i))) <=(97+26)){
                    if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                        lowerOvelsCount++;
                    }else {
                        lowerCaseConstoCount++;
                    }

                } else if ((int) (str.charAt(i)) >=48 && ((int) (str.charAt(i))) <=57) {
                    numbersCount++;
                }else {
                    specialCharCount++;
                }

            }else{
                System.out.println("Invalid String");
            }

        }

        double upperVowelPercent = ((double) (upperOvelsCount)/str.length()) * 100;
        double lowerVowelPercent = ((double) lowerOvelsCount/str.length()) * 100;
        double upperConstoPercent = ((double) upperCaseConstoCount/str.length()) * 100;
        double lowerConstoPercent = ((double) lowerCaseConstoCount/str.length()) * 100;
        double specailCharPercent = ((double) specialCharCount/str.length()) * 100;
        double numbersPercent = ((double) numbersCount/str.length()) * 100;

        System.out.println("UpperCase Vowels Percentage in "+ str + " is " + upperVowelPercent);
        System.out.println("LowerCase Vowels Percentage in "+ str + " is " + lowerVowelPercent);
        System.out.println("UpperCase Consonants Percentage in "+ str + " is " + upperConstoPercent);
        System.out.println("LowerCase Consonants Percentage in "+ str + " is " + lowerConstoPercent);
        System.out.println("Special Chars Percentage in "+ str + " is " + specailCharPercent);
        System.out.println("Numbers Percentage in "+ str + " is " + numbersPercent);

    }
}
