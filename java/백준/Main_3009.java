import java.util.Scanner;

public class Main_3009 {
    public static void main(String args[]) {

        Scanner sn = new Scanner(System.in);

        int[] x = new int[3];
        int[] y = new int[3];

        int numX, numY = 0;

        for(int i = 0; i < 3; i++){
            x[i] = sn.nextInt();
            y[i] = sn.nextInt();
        }
        if(x[0] == x[1]){
            numX = x[2];
        }else if( x[0] == x[2]){
            numX = x[1];
        }else{
            numX = x[0];
        }

        if(y[0] == y[1]){
            numY = y[2];
        }else if( y[0] == y[2]){
            numY = y[1];
        }else{
            numY = y[0];
        }

            System.out.print(numX + " "+ numY);
    }
}