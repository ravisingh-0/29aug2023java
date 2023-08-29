
import java.util.*;

public class Conditionals{
    public static void main(String args[]){

        int g,h;
        
        g= 10; h=2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A = Addtiton \nS = Subtraction \nM = Multiplication \nD = Division \n% = Mod \n& = Bitwise AND \n| = Botwise OR \n ^ = Bitwise XOR");
        char N= sc.next().charAt(0);
        
        if(N=='A'){
            System.out.println("Enter P for Pre increment or pre decrement \n Enter O for Post increment of post Decrement");
            System.out.println("Input your Choice: ");
            char L= sc.next().charAt(0);
             if(L=='P'){
                g=++g;
                h=++h;
                System.out.println("g = " + g);
                System.out.println("h = " + h);
                System.out.println("Sum of two numbers after pre Increment = " + (g+h));
                }
            
            else if(L=='O'){
                g=g++;
                h=h++;
                System.out.println("g = " + g);
                System.out.println("h = " + h);
                System.out.println("Sum of two numbers after Post increment = " + (g+h));
                }
            
            else{
                System.out.println("Invalid Choice...pls choose only from O,P");
                }

        }

        else if(N=='S'){
            System.out.println("Enter P for Pre increment or pre decrement \n Enter O for Post increment of post Decrement");
            System.out.println("Input your Choice: ");
            char L= sc.next().charAt(0);
             if(L=='P'){
                g=--g;
                h=--h;
                System.out.println("g = " + g);
                System.out.println("h = " + h);
                System.out.println("Sum of two numbers after pre Increment = " + (g+h));
                }
            
            else if(L=='O'){
                g=g--;
                h=h--;
                System.out.println("g = " + g);
                System.out.println("h = " + h);
                System.out.println("Sum of two numbers after Post increment = " + (g+h));
                }
            
            else{
                System.out.println("Invalid Choice...pls choose only from O,P");
                }
        }

        else if(N=='M'){
            System.out.println("Multiplication of 2 numbers " + (g*h));
        }

        else if(N=='D'){
            System.out.println("Division of 2 numbers" + (g/h));
        }

        else if(N=='%'){
            System.out.println("Mod of 2 numbers " + (g%h));
        }

        else if(N=='&'){
            System.out.println("Bitwise AND of 2 numbers " + (g&h));
        }

        else if(N=='|'){
            System.out.println("Bitwise OR of 2 numbers " + (g|h));
        }

        else if(N=='^'){
            System.out.println("Bitwise XOR of 2 numbers " + (g^h));
        }

        else{
            System.out.println("Invalid Operation");
        }
    }


        //Question1: WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative
        //Question2: FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperatureis above 100 and otherwise prints You don't have a fever
        //Question3: WriteaJavaprogramtoinputweeknumber(1-7)andprintdayofweeknameusing switch case
        //Question4: WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthatyear is a leap year or not
     

        
        // int age = 35;
       
        // if(age >= 18){
        //     System.out.println("Adult");
        // }
        // if(age >= 13 && age <=18){
        //     System.out.println("teenager");
        // }
        // else{
        //     System.out.println("Not adult");
        // }

        //wap to find the largest number out of 2
        // int a =10;
        // int b = 12;
        // if(a>b){
        //     System.out.println("A is learger of 2");
        // }
        // else{
        //     System.out.println("B is larger of 2");
        // }

        //WAP to check whether the entered number is even or odd
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter any number");
        // int Number = sc.nextInt();
        // if( Number%2 ==0){
        //     System.out.println("EVEN");
        // } else{
        //     System.out.println("Odd");
        // }

        // WAP to implement tax as 0 for income less than 500000, 20% for more than 500000 but less than 1000000 and 30% for more than 1000000 

        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter your annual Income: ");
        // int Income = in.nextInt();
        // int tax;
        // if(Income <= 500000){
        //     tax = 0;
        // } 
        // else if((Income >500000 && Income < 1000000)){
        //     tax = (int)(Income * (0.2));
        // } 
        // else{
        //     tax = (int)(Income * (0.3));
        // }
        // System.out.println("Tax on your income is : " + tax);

        
        //WAP to print the largest of three numbers
        // int a= 12 , b =2, c = 14;
        // if (a>=b && a>=c){
        //     System.out.println("a is largest");
        // } else if (b>=c){
        //     System.out.println("b is largest");
        // }else{
        //     System.out.println("c is largest");
        // }

        

        // WAP to check if the number is even or odd by ternary Operator
        // int d = 24; 
        // String type = (d%2 == 0)? "Even" : "Odd";
        // System.out.println(type);

        // WAP to check if the student is passed or failed 
        // System.out.print("Enter the marks : " );
        // Scanner m = new Scanner(System.in);
        // int marks = m.nextInt();
        // String Reportcard = marks >= 33 ? "Pass": "Fail";
        // System.out.println(Reportcard);

        //Write a program using switch case , if number is 1 print samosa , if 2 print momos, if 3 print jalebi
        // int number = 3;
        // switch(number){
        //     case 1: System.out.println("samosa");
        //                 break;
        //     case 2: System.out.println("momos");
        //                 break;
        //     case 3: System.out.println("jalebi");
        //                 break;
        // default : System.out.println("Aiyyo , Not available!!!")
        // }


        // WAP to make a simple calculator using Switch statement 
        // Scanner cal = new Scanner(System.in);
        // System.out.print("Enter a : ");
        // int a = cal.nextInt();
        // System.out.print("Enter b : ");
        // int b = cal.nextInt();
        // System.out.print("Enter Operator: ");
        // char operator = cal.next().charAt(0);

        // switch (operator){
        //     case '+' : System.out.println(a+b);
        //                     break;
        //     case '-' : System.out.println(a-b);
        //                     break;
        //     case '*' : System.out.println(a*b);
        //                     break;
        //     case '/' : System.out.println(a/b);
        //                     break;
        //     case '%' : System.out.println(a%b);
        //                     break;
        //     default : System.out.println("Invalid Operator!");
        //



        




}