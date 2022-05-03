import java.util.*;
public class Array{
    static int Solution(int position, int target, int distance){
        if(position == target){
            return 0;
        }
        int jump = 0;
        while ( position <= target){
            position += distance;
            jump++;
        }
        return jump;
    }
   public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        int target = sc.nextInt();
        int distance = sc.nextInt();
        System.out.println(Solution(position, target, distance));
   }
     
}