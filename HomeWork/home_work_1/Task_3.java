public class Task_3 {
    public static void main(String[] arg) {
        String s = "a good   example";
        String result = reverseWords(s);
        System.out.println(result);
    }

    public static String reverseWords(String s) {
        s = s.trim().replaceAll(" +", " ");
        // String[] words = s.split(" ");
        int numSpace = 0; 
        char[] symbolArray = s.toCharArray();

        for (int i = 0; i < symbolArray.length; i++) {
            if (symbolArray[i] == ' ') {
                numSpace++;
            }
        }

        String temp = "";
        String[] words = new String[numSpace + 1];
        int index = 0;
        for (int i = 0; i < symbolArray.length; i++) {
             if (symbolArray[i] == ' ') {
                words[index++] = temp;
                temp = "";
            } else
                temp = temp + symbolArray[i];
        }
        words[index] = temp;
        
        String[] newArray = new String[words.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[newArray.length - 1 - i] = words[i];
        }
        
        String result = String.join(" ", newArray);
        return result;
    }
}
