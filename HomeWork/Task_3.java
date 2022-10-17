public class Task_3 {
    public static void main(String[] arg) {
        String s = "a good   example";
        String result = reverseWords(s);
        System.out.println(result);
    }

    public static String reverseWords(String s) {
        s = s.trim().replaceAll(" +", " ");
        String[] words = s.split(" ");
        String[] newArray = new String[words.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[newArray.length - 1 - i] = words[i];
        }
        
        String result = String.join(" ", newArray);
        return result;
    }
}
