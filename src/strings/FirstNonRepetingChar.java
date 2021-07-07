package strings;

public class FirstNonRepetingChar {
    public static void main(String[] args) {
        String test = "Google";
        char[] charArray = test.toLowerCase().toCharArray();
//        getFirstElement(charArray); //O[n2] Approach

        //O[n] Approach
        int index = getIndexOfFirstNonrepeatingChar(charArray);
        System.out.println(charArray[index]);

    }
    //O[n2] Approach
    public static void getFirstElement(char[] charArray) {
        boolean isFoundFirstElement = false;
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (i != j && charArray[i] == charArray[j]) {
                    break;
                }
                else if (j == charArray.length-1) {
                    isFoundFirstElement = true;
                    break;
                }
            }
            if(isFoundFirstElement){
                System.out.println(charArray[i]);
                break;
            }
        }

    }

    static int count1[] = new int[26];
    //O[n] Approach
    public static void getCharArrayCount(char [] chara){
        for (int i = 0; i < chara.length ; i++)
            count1[chara[i] -'a']++;
    }
    public static int getIndexOfFirstNonrepeatingChar(char[] charArray){
       int index = -1;
        getCharArrayCount(charArray);
        for (int i = 0; i < charArray.length; i++) {
            if (count1[charArray[i]-'a'] == 1) {
                index = i;
                break;
            }
        }
       return index;
    }
}
