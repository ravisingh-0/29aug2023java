import java.util.*;

public class Arrays {

    // public static void update(int marks[]){
    //     for(int i = 1; i < marks.length; i++){
    //         marks[i] = marks[i] + 2;
    //     }
    // }

    // public static int largest(int number[]){
    //     int largest = Integer.MIN_VALUE;
    //     for(int i = 1; i< number.length; i++){
    //         if(largest < number[i]){
    //             largest = number[i];
    //         }
    //     }
    //     return largest;
    // }

    // public static int smallest(int number[]){
    //     int smallest = Integer.MAX_VALUE;
    //     for(int i=0; i< number.length; i++){
    //         if(smallest > number[i]){
    //             smallest = number[i];
    //         }
    //     }
    //     return smallest;
    // }


    // public static int getsmallest(int number[]){
    //     int smallest = Integer.MAX_VALUE;
    //     for(int i=0; i< number.length; i++){
    //         if(smallest > number[i]){
    //             smallest = number[i];
    //         }
    //     }
    //     return smallest;
    // }

    // public static void printpairs(int number[]){
    //     for(int i = 0; i<number.length; i++){
    //         int curr = number[i];
    //         for(int j=i+1; j<number.length; j++){
    //             System.out.print("["+curr+","+j+"] ");
    //         }
    //         System.out.println();
    //     }
    // }
    

    // public static void printsubarrays(int number[]){
    //     for(int i=0;i<number.length;i++){
    //         int start =i;
    //         for(int j=i; j<number.length; j++){
    //             int end = j;
    //             for(int k= start; k<=end; k++){
    //                 System.out.print(number[k]+" ");
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    // }

    public static void maxsumarray(int number[]){
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                int currsum=0;
                for(int k=start; k<=end; k++){
                    currsum = currsum + number[k];
                    if(maxsum < currsum){
                        maxsum = currsum;
                    }
                    System.out.println(currsum);

                }
                System.out.println();
            }
        }
        System.out.println("The maximum sum is : "+maxsum);
    }



    public static void main(String args[]){
      
        int number[] = {1,2,4,6,7,8};
        // System.out.println("The largest value is: " + largest(number));
        // System.out.println("The smallest- value in the array : "+ getsmallest(number));
        // printpairs(number);
        // printsubarrays(number);
        maxsumarray(number);

      
      
      
      
      
      
      
        // int marks[] = {23,45,67};

        // for(int i = 1; i < marks.length; i++){
        //     System.out.print((marks[i]));
        // }





    //     int marks[] = new int[100];
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the marks : ");
    //     marks[0] = sc.nextInt();
    //     marks[1] = sc.nextInt();
    //     marks[2] = sc.nextInt();
        
    //     System.out.println("Physics = " + marks[0]);
    //     System.out.println("maths = " + marks[1]);
    //     System.out.println("chemistry = " + marks[2]);

    //     marks[2]= marks[2] + 3;        
    //     System.out.println("Updated marks of Chemistry = " + marks[2]);

    //     System.out.println("The size of the array is = " + marks.length);
    //     sc.close();
    }
    
}
