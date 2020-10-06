// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
// 1 2 3 4 5 6 7
import java.util.*;
class demo{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter the number");
        n = s.nextInt();         
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
