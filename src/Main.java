import java.security.PublicKey;
import java.util.Scanner;

public class Main {
    static String Z1="Safe zone";
    static String Z2="Dangerous zone";


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers you want to enter?");
        int inputs=input.nextInt();
        System.out.print("Please enter the numbers you want : ");
        int small =Integer.MAX_VALUE;
        int large =Integer.MIN_VALUE;
        for (int i=0;i<inputs;i++){
            int N= input.nextInt();
            if (i==0){
                large=N;
                small=N;
            }
            if (N>large){
                large=N;
            }
            else if (N<small) {
                small=N;
            }

        }
        int difference=0;
        difference= large-small;
        System.out.print("largest= " +large+ " " + "smallest= " +small + " " + "The difference =" +difference +"\n");
        String Z = method( difference, large);
        System.out.print(Z+"\n");
    }
    public static String  method(int difference,int large){
        if (difference < (large/2)) {
            return Z2;
        }else {
            return Z1;
        }

    }

}
