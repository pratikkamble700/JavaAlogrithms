package strings;

public class ReverseStringUsingArray {

    public static void main(String[] args) {
        System.out.println("");
        String str = "Prajtik";
        // Creating array of string length
        char[] ch =  str.toCharArray();

        char[] reverseCH = reverseArray(ch);
        System.out.println("");
        System.out.println("Original  String");
        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println("");
        System.out.println("Reversed String");
        for (char c : reverseCH) {
            System.out.print(c);
        }
    }

    private static char[] reverseArray(char[] temparray) {

        int left, right = temparray.length - 1;

        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
        }

        return temparray;
    }
}
