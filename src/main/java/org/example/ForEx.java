package org.example;

import java.util.Scanner;

public class ForEx {

    //Sum
    /*
    public static int Sum(int n){
        int a = 0;
        for (int i = 0; i<=n;i++){
            a +=i;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        System.out.println(Sum(n));
    }
     */

    //Sum of elements divisible by 3 in array
    /*
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }

        int Sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0 && arr[i] > 0) {
                Sum += arr[i];
            }
        }
        System.out.print(Sum);
     */

    //find prime number
    /*
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        System.out.println(SoNguyenTo(n));

    }
    public static boolean SoNguyenTo(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(n); i++){
            if (n % i == 0 ){
                return false;
            }
        }
        return true;

    }
     */

    //find the divisor of an integer
    /*
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        for (int i = 1 ; i <= n ; i ++){
            if (n % i == 0){
                System.out.println(i + " ");
            }
        }
    }
     */

    /*
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }


    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
     */

    public static boolean isPrime( int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }

}



