public class Suds {

    public static String Compression(String str){
        StringBuilder sb= new StringBuilder("");
     
        int count = 1;
       
        for(int i=0; i<str.length();i++){
          if(i==str.length()-1){
            sb.append(str.charAt(i)+""+count);
            break;
          }
          if(str.charAt(i)==str.charAt(i+1)){
            count++;
          }
          else{
            if(count==1){
                
            }
            sb.append(str.charAt(i)+""+count);
            count=1;
          }
        }
        return sb.toString();
    }


    public static void main(String args[]){

        String str="aaabcddd";
        System.out.println(Compression(str));
    //     // char option = 'S';
    //     // int a =5;
    //     // int b =4;
    //     // if(option =='A'){
    //     //     System.out.println(a+b);

    //     // }
    //     // else if(option == 'S'){
    //     //     System.out.println(a+ " - " +b + " = " + (a-b));
    //     // }
    //     // else{
    //     //     System.out.println("Invalid!");
    //     // }

    //     // int n = 468;
    //     // int r=0;
    //     // int rev = 0;
    //     // while(n>0){
    //     //     int rem = n%10;
    //     //     r = r+rem;
            
    //     //     for(int i =0 ; i<=rem; i++){
    //     //         System.out.print("*");
    //     //     }
    //     //     System.out.println();
        
    //     //     rev = (rev*10+ rem);
    //     //     n = n/10;
    //     // }
    //     // n = rev;

    //     // System.out.println("Reverse = " + n);
    //     // System.out.println(r);

    //     // int i =1;
    //     // while(i<=5){
    //     //     int j = 1;
    //     //     while(j<=5){
    //     //         System.out.print("*");
    //     //         j++;
    //     //     }System.out.println();
    //     //     i++;
    //    // }
        



       






    }

    
    
}


// ============================================================================================

// int count = 1;

// char last = input.charAt(0);

// StringBuilder output = new StringBuilder();

// for(int i = 1; i < input.length(); i++){
//     if(input.charAt(i) == last){
//     count++;
//     }else{
//         if(count > 1){
//             output.append(""+count+last);
//         }else{
//             output.append(last);
//         }
//     count = 1;
//     last = input.charAt(i);
//     }
// }
// if(count > 1){
//     output.append(""+count+last);
// }else{
//     output.append(last);
// }
// System.out.println(output.toString());