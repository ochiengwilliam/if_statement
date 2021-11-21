import java.util.Scanner;


public class If {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("input your value here: ");
        int y = n.nextInt();

        if (y % 2 == 0){
            System.out.println(y + " is even");
        }
        else
            System.out.println( y + " is odd");


        }

    }
