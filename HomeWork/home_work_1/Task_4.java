public class Task_4 {
    public static void main(String[] args) {
        String s = " race a car";
        boolean result = isPalindrome(s);
        System.out.println(result);
    }

    public static boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i);
            if (ascii >= 33 && ascii <= 47 || ascii == 58 || ascii == 59 || ascii == 63) {
                s = s.replace(s.charAt(i), ' ');
            }
        }
        s = s.replaceAll(" +", "");
        
        // String sReversed = "";
        // for (int i = 0; i < s.length(); i++) {
        //     sReversed = s.charAt(i) + sReversed;
        // }

        String sReversed = new StringBuilder(s).reverse().toString();

        if (s == "") return true;
        else return s.equals(sReversed);

    }
}
