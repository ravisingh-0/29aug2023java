public class Recursion{

    // print numbers from n to 1
    public static void printdec(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
    }

    // print numbers from 1 to n
    public static void printInc(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    // print the factorial of n
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fNm1 = factorial(n-1);
        int fN = n * fNm1;
        return fN;
    }

    // print the sum of first N numbers
    public static int firstNsum(int n){
        if(n == 1){
            return 1;
        }
        int fstSum = n + firstNsum(n-1);
        return fstSum;
    }

    // print the fibonacci series of n
    public static int fibonacci(int n){
        if(n == 1 || n == 0){
            return n;
        }
        int fNm1 = fibonacci(n-1);
        int fNm2 = fibonacci(n-2);
        int f = fNm1 + fNm2;
        return f;
    }

    // check if the array is sorted or not
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    // find the first occurance of a number in the array
    public static int firstOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, key ,i+1);
    }

    // find the last occurance of an element from an array
    public static int lastOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = lastOccurance(arr,key,i+1);
        if(isfound != -1){
            return isfound;
        }
        if(arr[i] == key){
            return i;
        }
        return i;
        // return isfound;
    }

    

    public static void main(String args[]){
        int n=10;
        int arr[] = {1,2,3,4,5,5,5};
        // printInc(n);
        // System.out.println(factorial(5));
        // System.out.println(firstNsum(5));
        // System.out.println(fibonacci(5));
        // System.out.println(isSorted(arr,0));
        // System.out.println(firstOccurance(arr, 8,0));
        System.out.println(lastOccurance(arr, 5,0));
    }
}