
public class Task_4 {
    public static void main(String[] args) {
        String s = " ab@a";
        boolean result = isPalindrome(s);
        System.out.println(result);
    }

    public static boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i);
            if (ascii >= 33 && ascii <= 47 || ascii >= 58 && ascii <= 64 || ascii >= 91 && ascii <= 96 || ascii >= 123 && ascii <= 127) {
                s = s.replace(s.charAt(i), ' ');
            }
        }
        // s = s.replaceAll(" +", "");
       
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' ) {
                s = s.replace(" ", "");
            }
        }
        // String sReversed = new StringBuilder(s).reverse().toString();

        String sReversed = "";
        for (int i = 0; i < s.length(); i++) {
            sReversed = s.charAt(i) + sReversed;
        }

        if (s == "") return true;
        else return s.equals(sReversed);

    }
}
