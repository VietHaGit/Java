package org.example;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args){
        //while and do while in java
        Scanner Sc = new Scanner(System.in);

        //Prints all even numbers from n to 100
        /*
        int n = Sc.nextInt();
        while (n<100)//  // If the condition is true, the code block will be executed
        {
            if (n%2==0){
                System.out.print(n + " ");
            }
            n ++; //  n = n + 1 ;
        }
         */

        /*
        n +=1 => n = n +1
        n -=1 => n = n -1
        n *=1 => n = n *1
        n /=1 => n = n /1
         */

        //prints all divisors of n (for)
        /*
        int n = Sc.nextInt();
        int Test = 0;
        for(int i = 1;  i<=n; i ++){
            if (n%i==0){
                Test ++;
            }
        }
        System.out.print(Test);
         */

        // prints all divisors of n (while)
        /*
        int n = Sc.nextInt();
        int i = 1;
        int Test = 0;
        while (i <=n){
            if(n % i == 0){
                Test ++;
            }
            i++;
        }
        System.out.print(Test);
         */

        //prints the result of ab
        /*
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int Test = 1;
        while ( b > 0){
            Test *= a;
            b--;
        }
        System.out.print(Test);
         */

        //prints all numbers from a to b, which are divisible by 3 and 5.
        /*
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        while (a <= b ) {
            if (a % 3 == 0 && a %5 == 0) {
                System.out.print(a + " ");
            }
            a ++;
        }

        for(int i = a; i<=b;i++){
            if(i%3==0 && i%5==0){
                System.out.print(i+ " ");
            }
        }
         */

            //Break
            /*
            int n = Sc.nextInt();
            int i = 1;
            while (i<=n){
                if (i == 11){
                    break;
                }
                System.out.print(i+" ");
                i++;
            }


            for (int i1= 1; i1<=50;i1++){
                if (i1==11){
                    break;
                }
                System.out.print(i1+ " ");
            }
            */
        //Prints all odd numbers from 1 to 100.
        /*
        for (int i = 1 ; i<=100; i++){
            if (i % 2==0){
                continue;
            }
            System.out.print(i+" ");
        }


        int i = 0;
        while (i<=100){
            i++;
            if (i % 2 == 0){
                continue;
            }
            System.out.print(i+" ");
        }
         */


        //prints numbers from 1 to 5 using do-while loop.
        /*
        for (int i = 1; i <=5; i++){
            System.out.print(i+" ");
        }

        int i = 1;
        while (i<=5){
            System.out.print(i+" ");
            i++;
        }

        int i = 1;
        do {
            System.out.print(i+" ");
            i++;
        }while (i<=5);
         */

        // print all numbers from 1 to 1000 (including 1 and 1000), which end with 0.
        /*
        int i = 1;
        do {
            if (i%10 ==0){
            System.out.print(i+ " ");
        }
            i++;
        }while (i<=1000);
         */


    }
}
