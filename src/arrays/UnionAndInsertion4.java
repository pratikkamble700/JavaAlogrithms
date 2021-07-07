package arrays;

public class UnionAndInsertion4 {
    static int a[] = {1, 3, 4, 5, 7};
    static int b[] = {2, 3, 5, 6};

    static int[] getUnionArray(int a[], int b[], int m, int n) {
        int[] union = new int[m + n];
        int index = 0;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                union[index] = a[i];
                i++;
                index++;
            } else if (a[i] > b[j]) {
                union[index] = b[j];
                index++;
                j++;
            } else {// if values are same
                union[index] = b[j];
                index++;
                i++;
                j++;
            }
        }

        // to add remaining values
        while (i < m) {
            union[index] = a[i];
            index++;
            i++;
        }
        while (j < n) {
            union[index] = b[j];
            index++;
            j++;
        }
        return union;
    }

    static int[] getIntersectionArray(int a[], int b[], int m, int n) {
        int[] intersection;
        if(m < n){intersection = new int[m];}
//        else if(m > n){intersection = new int[n];}
        else {intersection = new int[n];}
        int index = 0;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {// if values are same
                intersection[index] = b[j];
                index++;
                i++;
                j++;
            }
        }


        return intersection;
    }


    public static void main(String[] args) {
        int[] unionResult = getUnionArray(a, b, a.length, b.length);
        System.out.println("Union Array result ");
        for (int item : unionResult) {
            System.out.print(" " + item);
        }
        int[] intersectionResult = getIntersectionArray(a, b, a.length, b.length);
        System.out.println("");
        System.out.println("Intersection Array result ");
        for (int item : intersectionResult) {
            System.out.print(" " + item);
        }

    }
}
