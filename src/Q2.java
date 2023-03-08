import java.util.Scanner;

public class Q2 {
    static void fibonacci(int Num){

        int fb1 = 0, fb2 = 1, temp;

        while(true){
            if(fb2 == Num){
                System.out.printf("O número pertence a sequência de Fibonacci");
                return;
            }
            else if(fb2 > Num){
                System.out.printf("O número não pertence a sequência de Fibonacci");
                return;
            }
            else{
                temp = fb2;

                fb2+= fb1;
                fb1 = temp;
            }
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        fibonacci(num);
    }
}
