/* Zero One Triangle Pattern
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1
 */

public class Zero_One_Triangle_Pattern {
    public static void main(String[] args){
        int n=6;
        printpattern(n);
    }
    public static void printpattern(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print((i+j)%2 +" ");
            }
            System.out.println("");

        }

    }

}
