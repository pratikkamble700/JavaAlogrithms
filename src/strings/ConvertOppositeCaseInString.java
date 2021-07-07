package strings;

/***
 * ASCII VALUES A-Z = 65 to 90
 * and a-z = 97 to 122
 * A = a-32 and a= A+32
 *  UpperCase = LowerCase -32
 *  LowerCase = UpperCase +32
 */
public class ConvertOppositeCaseInString {

    static String convertOpposite(String str)
    {
        String result ="";
        int ln = str.length();

      /*  // Conversion using predefined methods
        for (int i = 0; i < ln; i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c))
                str.replace(i, i + 1,
                        Character.toUpperCase(c) + "");
            else
                str.replace(i, i + 1,
                        Character.toLowerCase(c) + "");
        }*/

        for (int i = 0; i < ln; i++) {
            char c = str.charAt(i);
            if(c != ' '){
                int ascii = c;
                if (ascii >= 97) {
                    ascii -= 32;
                } else {
                    ascii += 32;
                }
                result += ((char) ascii);
            }else{
                result +=" ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Test Opposite Case";
        // Creating array of string length
        char[] ch = str.toCharArray();

        System.out.println("Original String : " + str);
        System.out.println("Converted String : " + convertOpposite(str));
    }
}

/***
 * Result IS
 * Original String : Test Opposite Case
 * Converted String : tEST oPPOSITE cASE
 */
