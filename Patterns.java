

public class Patterns {



//Write a program to print the hollow rectangle
// * * * * * 
// *       *
// *       *
// *       *
// * * * * * 

        public static void hollowrectangle(int totalrows, int totalcols){
                for(int i = 1; i<= totalrows; i++){
                        for(int j=1; j<=totalcols; j++){
                                if(i == 1 || i == totalrows || j == 1 || j == totalcols){
                                        System.out.print("* ");
                                }
                                else{
                                        System.out.print("  ");
                                }
                        }
                        System.out.println(" ");
                }
        }




    public static void main(String args[]){
        hollowrectangle(4,5);


//Write a program to print the following pattern
// *
// **  
// *** 
// ****


        // for(int line=1; line<=4; line++){
        //     for(int star=1; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


// Write a program to print the following pattern
// ****
// ***
// **
// *
        // int n=4;
        // for(int line=1; line<=n; line++){
        //     for(int star=1; star<=(n-line+1); star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


// Write a program to print the following pattern
// 1
// 12
// 123
// 1234

        // int n=4;
        // for(int i=1; i<=n; i++){
        //     for(int number=1; number<=i; number++){
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }




// Write a program to print the following pattern
// A
// BC
// DEF
// GHIJ

        // int n=4;
        // char ch = 'A';
        // for(int i=1; i<=n; i++){
        //     for(int chars=1; chars<=i; chars++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }












    }
    
}
