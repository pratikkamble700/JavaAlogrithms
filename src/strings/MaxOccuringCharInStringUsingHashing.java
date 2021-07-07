package strings;

import sun.nio.cs.US_ASCII;

public class MaxOccuringCharInStringUsingHashing {

    public static void main(String[] args) {
        String str = "Shweta Rajendra Jadhav";
        int[] freq = new int[str.length()];
        char minChar = str.charAt(0), maxChar = str.charAt(0);// default get as first char
        int i, j, min, max;

        //Converts given string into character array
        char orginalCharArray[] = str.toCharArray();

        //Count each word in given string and store in array freq
        for (i = 0; i < orginalCharArray.length; i++) {
            freq[i] = 1;
            for (j = i + 1; j < orginalCharArray.length; j++) {
                if (orginalCharArray[i] == orginalCharArray[j] && orginalCharArray[i] != ' ' && orginalCharArray[i] != '0') {
                    freq[i]++;

                    //Set orginalCharArray[j] to 0 to avoid printing visited character
                    orginalCharArray[j] = '0';
                }
            }
        }

        //Determine minimum and maximum occurring characters
        min = max = freq[0];
        for (i = 0; i < freq.length; i++) {

            //If min is greater than frequency of a character
            //then, store frequency in min and corresponding character in minChar
            if (min > freq[i] && freq[i] != '0') {
                min = freq[i];
                minChar = orginalCharArray[i];
            }
            //If max is less than frequency of a character
            //then, store frequency in max and corresponding character in maxChar
            if (max < freq[i]) {
                max = freq[i];
                maxChar = orginalCharArray[i];
            }
        }

        System.out.println("Minimum occurring character: " + minChar + " Occurance is : "+ min);
        System.out.println("Maximum occurring character: " + maxChar+ " Occurance is : "+ max);
    }

}
