public class ArrayOps {
    public static void main(String[] args) {
        int [] res = {0, 1, 2, 4, 5, 8};
        int [] res1 = {8, 7, 2, -1, 2};
        

        System.out.println(isSorted(res1));
        
        
    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        int arrSum = 0;
        int expectedSum = 0;
        for (int i = 0; i < array.length; i++){
            arrSum += array[i];
        }
        for (int j = 1; j <= array.length; j++){
            expectedSum += j;
        }
        int missing = expectedSum - arrSum;
        return missing;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int secMaxNum = 0; 
        int firstMaxNum = 1;
        int temp = 0;
        for (int i = 0; i < array.length; i++){
            if (secMaxNum < array[i]){
                secMaxNum = array[i];
                if (secMaxNum >= firstMaxNum){
                    temp = firstMaxNum;
                    firstMaxNum = secMaxNum;
                    secMaxNum = temp;
                }
            }
        }
        return secMaxNum;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        boolean contains = true;
        for (int i = 0; i < array1.length; i++) {

            boolean found = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                contains = false;
                break;
            }
        }
        return contains;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        boolean ascending = true;
        boolean descending = true;
    
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                ascending = false;
            }
            if (array[i] < array[i + 1]) {
                descending = false;
            }
        }
        return ascending || descending;
    }

}
