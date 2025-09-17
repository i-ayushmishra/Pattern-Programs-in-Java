/* Number-Increasing Reverse Pyramid Pattern
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */

public class Number_Increasing_Reverse_Pyramid_Pattern {
    public static void main(String[] args){
        int n= 6;
        printpattern(n);
    }
    public static void printpattern(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }
    }
}
