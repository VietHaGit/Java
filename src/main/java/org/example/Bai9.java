package org.example;

import java.security.PublicKey;
import java.util.Scanner;

public class Bai9 {

    //Declare a method
    /*
    public static void show(){
        for (int i = 1 ; i <= 10; i ++){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public static int SumofArray(int[] arr){
        int answer = 0 ;
        for (int i = 0 ; i < arr.length; i ++){
            answer +=arr[i];
        }
        return answer;
    }

    public static void main(String[] args){

        show();
        int[] arr1 = {1,2,3};
        int[] arr2 = {2 ,1 ,7};
        int[] arr3 = {3, 2, 2};
        System.out.println(SumofArray(arr1));
        System.out.println(SumofArray(arr2));
        System.out.println(SumofArray(arr3));
    }
     */

    //Write a method that accepts an array arr of integers and returns the sum of all elements in arr on the screen
    /*
    public static int SumOfArray(int[] arr){
        int sum = 0;
        for (int i = 0; i< arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i< n; i++){
            arr[i] = Sc.nextInt();
        }
        System.out.println(SumOfArray(arr));
    }
     */

    //returns all even numbers in an array
    /*
    public static int countEven(int[] arr){
        int answer = 0;
        for (int i = 0; i<arr.length;i++){
            if (arr[i] %2==0){
                answer++;
            }

        }
        return answer;
    }
    public static void main(String[] args){
        int[] arr1 = {1,2,4};
        int[] arr2 = {2,3,5};
        int[] arr3 = {3,4,6};
        System.out.println(countEven(arr1));
        System.out.println(countEven(arr2));
        System.out.println(countEven(arr3));
    }
     */

    // Displays numbers, which are divisible by 3 but not divisible by 5 in arr
    /*
    public static void Show(int[] arr){
        for (int i = 0; i <arr.length; i ++){
            if (arr[i] %3 == 0 && arr[i] %5 !=0){
                System.out.print(arr[i]+ " ");
            }
        }
    }

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++){
            arr[i] = Sc.nextInt();
        }
        Show(arr);
    }

     */
    //Write a method to print strings of length greater than 3 in an array arr.
    /*
        public static void show(String[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > 3) {
                    System.out.print(arr[i] + " ");
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            show(arr);
        }
     */

    //Write a method to return the largest number among the 3 numbers that are entered by the user.
    /*
    public static int max3(int a , int b, int c){
        if (a >=b && a >=c){
            return a;
        }
        else if (b>=c){
            return b;
        }
        else return c;
    }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();
        System.out.println(max3(a,b,c));
        }
     */

    //circumference
    /*
    public static double circumference(Double r){
        return 2 * r * 3.14;
    }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        double r = Sc.nextDouble();
        System.out.println(circumference(r));
    }
     */

    //Write a recursive function that computes and returns the result of n!
    /*
    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        System.out.println(factorial(n));
    }
     */

    //options 2
    /*
    public static int factorial(int n){
        int a =1;
        for (int i = 1; i <=n;i++){
            a*=i;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        System.out.println(factorial(n));
    }
     */

    //Given an integer n, write a recursive function to return the sum of all odd numbers from 1 to n.
    /*
    public static int Sum(int n){
        if (n ==1)
        return 1;
        if (n %2 == 0){
            return Sum(n-1);
        } else  {
            return n + Sum(n-1);`

        }

    }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        System.out.println(Sum(n));
    }
     */

    //options 2
    /*
    public static int Sum(int n) {
        int a = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                a += i;
            }

        }
        return a;

    }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        System.out.println(Sum(n));
    }
     */

    //Given an array arr of n integers. Write a recursive function calculating the sum of all numbers in arr.
    /*
    public static int SumOfArray(int[] arr , int n){
        if (n == 1) return arr[0];
        return arr[ n -1] + SumOfArray(arr,n-1);
    }

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n;i++){
            arr[i] = Sc.nextInt();
        }
        System.out.println(SumOfArray(arr,n));
    }
     */

    //options 2;
    /*
    public static int SumOfArray(int[] arr, int n){
        int Sum = 0;
        for (int i = 0 ; i < n; i++){
            Sum += arr[i];
        }
        return Sum;
    }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i<n;i++){
            arr[i] = Sc.nextInt();
        }
        System.out.println(SumOfArray(arr,n));
    }
     */
}
