// package HomeWork;

// import java.util.Scanner;

// /**
//  * home_work_1
//  */
// public class home_work_1 {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Введите длину массива: ");
//         int size = input.nextInt();
//         int[] nums = new int[size];
//         System.out.println("Введите элементы массива через Enter: ");
//         for (int i = 0; i < size; i++) {
//             nums[i] = input.nextInt();
//         }

//         int[] ans = new int[size];
//         for (int i = 0; i < ans.length; i++) {
//             ans[i] = nums[nums[i]];
//         }
        
//         System.out.println("Получим массив: ");
//         for (int i : ans) {
//             System.out.print(" " + i);
//         }

//         input.close();

//         }
// }



// class Solution {
//     public int[] buildArray(int[] nums) {
//         // Scanner input = new Scanner(System.in);
//         // System.out.println("Введите длину массива: ");
//         // int size = input.nextInt();
//         // int[] nums = new int[size];
//         // System.out.println("Введите элементы массива через Enter: ");
//         // for (int i = 0; i < size; i++) {
//         //     nums[i] = input.nextInt();
//         // }
        
//         int size = nums.length;
//         int[] ans = new int[size];
//         for (int i = 0; i < size; i++) {
//             ans[i] = nums[nums[i]];
//         }
        
//         // System.out.println("Получим массив: ");
//         // for (int i : ans) {
//         //     System.out.print(" " + i);
//         // }
//         // System.out.println(Arrays.asList(ans));
//         System.out.println(Arrays.toString(ans));

//         // input.close();
        
//     }