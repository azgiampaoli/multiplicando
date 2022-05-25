import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numero, vezes, resultado =0;
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        System.out.println("Digite quanta vezes ele será multiplicado: ");
        vezes = sc.nextInt();

        for(int i = 0; i<vezes; i++){
            resultado = resultado + numero ;
        }
        System.out.println(resultado);


}}
