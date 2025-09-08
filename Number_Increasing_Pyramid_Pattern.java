/* Number Increasing Pyramid Pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
 */

public class Number_Increasing_Pyramid_Pattern {
    public static void main(String[] args){
        int n=6;
        print_pattern(n);
    }
    public static void print_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }
    }

}
