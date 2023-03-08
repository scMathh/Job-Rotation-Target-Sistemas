import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String var = input.next();
        StringBuilder invertido = new StringBuilder();

        for(int i = var.length()-1; i >= 0; i--){
            invertido.append(var.charAt(i));
        }

        System.out.printf("Original: %s\nInvertido: %s", var, invertido);
    }
}
