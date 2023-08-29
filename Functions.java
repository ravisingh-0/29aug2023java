// public class Functions {
//     public static void main(String args[]){
//         int a = 10;
//         int b = 12;

//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("a = "+ a);
//         System.out.println("b = "+ b);
//     }
// }

// WAP to SWAP two numbers using third variable

    public class Functions{

        // public static void swap(int a, int b){
        //     int temp = a;
        //     a = b;
        //     b = temp;
        // }

        // public static int multiple(int a, int b){
        //     int product = a * b;
        //     return product;
        // }
        

        // Function Overloading 
        // public static int sum(int a , int b){
        //     return a+b;
        // }
        // public static float sum(float a, float b){
        //     return a+b;
        // }

        //Factorial program 
        // public static int factorial(int a){
        //     int f=1;
        //     for(int i=1; i<=a;i++){
        //         f=f*i;
        //     }
        //     return f;
        // }


        // //PRIME NUMBER 
        //   public static boolean is_prime(int n){
        //     if(n==2){
        //         return true;
        //     }
        //     for(int i = 2; i<n; i++){
        //         if(n%i==0){
        //             return false;
        //         }
        //     }
        //     return true;
        // }


        // //Prime Number (OPTIMIZED WAY)
        // public static boolean prime(int n){
        //     if(n==2){
        //         return true;
        //     }
        //     for(int i=2; i<=Math.sqrt(n);i++){
        //         if(n%i==0){
        //             return false;
        //         }
        //     }
        //     return true;
        // }

        // public static void primeinrange(int n){
        //     for(int i=2;i<=n;i++){
        //         if(prime(i)){
        //             System.out.print(" "+i);
        //         }
        //     }
        // }

        // Write a program to conveert a binary number into decimal number

        public static void binarytodecimal(int n){
            int mynum=n;
            int pow=0;
            int decNum=0;

            while(n>0){
                int lastDigit = n % 10;
                decNum= decNum + (lastDigit * (int)Math.pow(2,pow));
                pow++;
                n=n/10;
            }
            System.out.println("decimal of "+mynum + " is "+ decNum);
        }

        public static void DecimaltoBinary(int m){
            int mynum=m;
            int pow=0;
            int binNum =0;

            while(m>0){
                int rem = m%2;
                binNum = binNum + (rem * (int)Math.pow(10,pow));
                pow++;
                m=m/2;
            }
            System.out.println("binary form " + mynum + " is "+ binNum);
        }






        public static void main(String args[]){
            // int n = 4;
            // int r = 2;

            // swap(a,b);
            // int prod = multiple(a,b);
            // System.out.println("a = "+ a);
            // System.out.println("b = "+ b);
            // System.out.println("Product = "+ prod);
            // int C = factorial(n)/factorial(r)*factorial(n-r);
            // System.out.println(C);
            // System.out.println("sum of 2 numbers (integer)"+ sum(2,4));
            // System.out.println("Sum of 2 numbers (float)"+ sum(2.2f,4.8f));
            // int g =12;
            // System.out.println(g +" is "+ is_prime(g));
            // System.out.println(g +" is "+ prime(g));
            // primeinrange(20);
            binarytodecimal(10);
            DecimaltoBinary(10);

        }
    }