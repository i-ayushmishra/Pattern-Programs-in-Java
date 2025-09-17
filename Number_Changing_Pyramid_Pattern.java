/* Number Changing Pyramid Pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
 */

public class Number_Changing_Pyramid_Pattern {
    public static void main(String[] args){
        int n=6;
        printpattern(n);
    }
    public static void printpattern(int n){
       int tem=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(tem +" ");
                tem++;
            }
            System.out.println(" ");
        }
    }

}
