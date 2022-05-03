import java.util.*;
public class Array{
    static  void  Rotate(int [] array, int k  ){
          if(k == array.length){
              return;
          }
        while(k > 0){
            int temp  = array[array.length-1];
        for(int i = array.length-2; i>=0; i--){
               int temp1 = array[i];
               array[i+1] = temp1;
        }
        array[0] = temp;
        k--;
    
      }
    }

   public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = sc.nextInt();
        int []  array = new int[n];
        for(int i =0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("enter the value of k");
        int k = sc.nextInt();
        Rotate(array, k);
        for(int i =0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}