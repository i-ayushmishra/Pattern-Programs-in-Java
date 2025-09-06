// Square Hollow Pattern
//        ******
//        *    *
//        *    *
//        *    *
//        *    *
//        ******
public class Square_Hollow_Pattern {
    public static void main(String [] args){
        int dot=6;
        print_pattern(dot);
    }
    public static void print_pattern(int dot){
        for(int i=0;i<dot;i++){
            for(int j=0;j<dot;j++){
                if(i==0 || i== dot-1 || j==0 || j==dot-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
