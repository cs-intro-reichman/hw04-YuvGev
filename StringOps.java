public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String str = "One two tHRee world";
        char j = 'M';
        System.out.println(capVowelsLowRest(str));
    }

    public static String capVowelsLowRest(String string) {
        String answer = "";
    
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
    
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    answer += (char) (ch - 'a' + 'A');
                } else if ((ch >= 'A' && ch <= 'Z' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')) {
                    answer += (char) (ch + 32);
                } else {
                answer += ch;
            }
        }
    }
        return answer;
    }
      

    public static String camelCase (String string) {
        // Write your code here:
        String answer = "";
        for (int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if (string.charAt(i) == ' '){
                ch = string.charAt(i + 1);
                if (ch >= 'a' && ch <= 'z'){
                    ch = (char) (ch - 'a' + 'A');
                    answer += ch;
                } else {
                    answer += ch;
                }
                i++;
                continue;
            }
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                answer += (char) (ch | 32); 
            } else {
                answer += ch;
            }
        }
        return answer;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            char n = string.charAt(i);
            if (chr == n){
                count++;
            }
        }
        int[] array = new int[count];
        int arrayIndex = 0;
        for (int i = 0; i < string.length(); i++){
            char n = string.charAt(i);
            if (chr == n){
                array[arrayIndex] = i;
                arrayIndex++;
            }
        }
        return array;
    }
}
