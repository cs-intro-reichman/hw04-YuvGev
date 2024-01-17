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
        String str = "  tWo    wordS";
        char j = 'M';
        System.out.println(camelCase(str));
        String s = "TwoWords";
        System.out.println(s);
    }

    public static String capVowelsLowRest(String string) {
        String answer = "";
    
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
    
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || ch == ' ') {
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
      
    public static String lowerCase(String s) {
        int i =0; //will run from the first char ti the last
        String out = "";
        for(i=0; i<s.length(); i++){
            char n = s.charAt(i);
            if((n <= 'Z') && n >= 'A'){ // Uppercase
            n = (char) (n+32);
            } 
        out += n;
        }

        return out;
    }
    
    public static String upCase(String str) {
        String ans = "" + (char) (str.charAt(0) - 32);
        
            for(int i = 0; i < str.length(); i++ ) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (str.charAt(i+1) >= 'a' && str.charAt(i+1) <= 'z'){
                ans = ans + ch + (char) (str.charAt(i + 1) - 32);
                i++;
                }
            } else {
                ans = ans + ch;
            }

        }
        return ans;
    }

    public static String first(String s) {
        String answer = "";
    
        for (int j = 0; j < s.length(); j++) {
            char chr = s.charAt(j);
            
            if (chr >= 'A' && chr <= 'Z' && j == 0) {
                chr = (char) (chr | 32);
            }
    
            answer += chr;
        }
    
        return answer;
    }

        

    public static String camelCase (String string) {
        // Write your code here:
        string = lowerCase(string);
        string  = upCase(string);


        String answer = "";
        for (int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if (ch != ' ')
            answer += ch;
        }
        String camel = (first(answer));
        
        return camel;
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
