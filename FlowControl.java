import java.util.*;
// public class FlowControl{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value till you want counting of : ");
//         int range = sc.nextInt();
//         int c=1;
//         while(c<=range){
//             System.out.print(c+" ");
//             c++;
//         }

import javax.swing.plaf.synth.SynthSpinnerUI;

//     }
// }

public class FlowControl{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int n = sc.nextInt();
        // int i = 1;
        // int sum = 0;
        // while(i<=n){
        //     sum +=i;
        //     i++;
        // }
        // System.out.println("sum = " + sum)



        // Write a progra usig gor loop 
        // for(int r =0; r<=10; r++){
        //     System.out.println(r);
        // }

        // Write a program to print the following pattern
        // ****
        // ****
        // ****
        // ****
        
        // for(int line = 1; line <= 4; line++){
        //     System.out.println("* * * *");
        // }

        // Using while loop 
        // int line =1;
        // while(line<=4){
        //     System.out.println("* * * *");
        //     line++;
        // }
        

        // write a program to print the reverse of a number
        // int u = 26092002;
        // while(u>0){
        //     int lastnumber = u%10;
        //     System.out.print(lastnumber);
        //     u=u/10;
        // }

        //WAP to reverse a given number 
        // int n = 112233;
        // int rev=0;
        // while(n>0){
        //     int lastdigit = n%10;
        //     rev= (rev*10)+lastdigit;
        //     n=n/10;
        // }
        // n = rev;
        // System.out.println(n);

        // Using break statement
        // for(int i =0; i<5;i++)
        // {
        //     if(i==3)
        //     {
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("out of the loop i am thrown");


        // write a program to take the input from the user until user enters the number multiple of 10
        // Scanner sc = new Scanner(System.in);
        // do{
        //     System.out.print("Enter the Number : ");
        //     int num = sc.nextInt();
        //     if(num%10==0){
        //         break;
        //     }
        //     System.out.println(num);
        // }while(true);

        Scanner m = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n= m.nextInt();
        if(n==2){
            System.out.println("prime");
        }else{
            boolean isprime = true;
            for(int i =2; i<=(Math.sqrt(n));i++){
                if(n%i==0){
                    isprime=false;
                }
            }

            if(isprime==true){
                System.out.println("prime number ");
            }else{
                System.out.println("Not prime");
            }

        }

    }
}


// Question2:Write a program that reads a set of integers,and then prints the sum of  the even and odd integers.
// Question 3 :Write a program to find the factorial of any number entered by the user.
// Question4: Write a program to print the multiplicatio ntable of a number N ,entered by the user.