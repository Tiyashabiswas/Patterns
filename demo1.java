// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20 21
// 22 23 24 25 26 27 28
import java.util.*;
class demo1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int i,j,n;
        int k=1;
        System.out.println("Enter the number");
        n = s.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(k);
                System.out.print(" ");
                k++;
            }
            System.out.println();
        }
    }
}
