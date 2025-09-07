//Number Triangle Pattern
//           1
//          2 2
//         3 3 3
//        4 4 4 4
//       5 5 5 5 5
//      6 6 6 6 6 6

public class Number_Triangle_Pattern {
    public static void main(String[] args) {
        int dot = 6;
        print_pattern(dot);
    }

    public static void print_pattern(int dot) {
        for (int i = 1; i <= dot; i++) {
            for (int j = 1; j <= dot - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }
}
