package strings.w3ResourcePrograms;

public class SurrogatePairs {
    //Java stores, emojis in Surrogate pairs,
    //Each char is 16 bits (2 bytes).
    //Unicode code points above U+FFFF (like emojis) don’t fit in one char
    //So Java represents them as two chars:
    // 1. High surrogate (in range U+D800–U+DBFF)
    // 2. Low surrogate (in range U+DC00–U+DFFF)


    public static void main(String[] args) {
        String emoji = "🤣";

        int codePointOfEmoji = emoji.codePointAt(0);
        char[] surrogateChars = Character.toChars(codePointOfEmoji);

        char high = surrogateChars[0];
        char low = surrogateChars[1];
        System.out.printf("Code point of emoji in Hex U+%X%n",codePointOfEmoji);
        System.out.printf("High surrogate is U+%04X%n", (int) high);
        System.out.printf("Low surrogate is U+%04X%n", (int) low);




    }





}
