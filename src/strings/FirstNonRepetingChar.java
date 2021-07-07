package strings;

public class FirstNonRepetingChar {
    public static void main(String[] args) {

        String test = "Google";
        char[] charArray = test.toLowerCase().toCharArray();
        getFirstElement(charArray);
    }

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
}
