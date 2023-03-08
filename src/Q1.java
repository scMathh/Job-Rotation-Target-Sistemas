public class Q1 {
    public static void main(String[] args) {

        int INDICE = 13, SOMA = 0, k = 0;

        while(k < INDICE){
            k++;
            SOMA += k;
        }

        System.out.printf("%d",SOMA);
    }
}