//             1
//           2 1 2
//         3 2 1 2 3
//       4 3 2 1 2 3 4
//     5 4 3 2 1 2 3 4 5
//   6 5 4 3 2 1 2 3 4 5 6
// 7 6 5 4 3 2 1 2 3 4 5 6 7
import java.util.*;
class demo3{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int i,j,n;
        
        System.out.println("Enter the number");
        n = s.nextInt();         
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
               System.out.print("  ");
            }
            for(int k=i; k>=1;k--){
                System.out.print(k+" ");
                }
            for(int l=1;l<i;l++){
                int t=l+1;
                System.out.print(t+" ");
                 t++;
                }
            
           System.out.println(); 
        }
    }
}

