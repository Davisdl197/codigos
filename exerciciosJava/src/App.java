import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        String digitacao;
        char escolha = '\u0000';
        double soma = 0.0, subtracao = 0.0, multiplicacao = 0.0, divisao = 0.0;
        double num1 = 0.0, num2 = 0.0;

        System.out.print("Digite o primeiro número: ");
        num1 = in.nextDouble();
        
        System.out.print("Digite o primeiro número: ");
        num2 = in.nextDouble();

        System.out.print("Agora digite a operação desejada: ");
        digitacao = in.nextLine();

        if(escolha == '+'){
            soma = num1 + num2;

            System.out.println("A soma é: " + soma);
        } else if(escolha == '-'){
            subtracao = num1 - num2;

            System.out.println("A subtração é: " + subtracao);
        } else if(escolha == '*'){
            multiplicacao = num1 * num2;

            System.out.println("A multiplicação é: " + multiplicacao);
        } else if(escolha == '/'){
            divisao = num1 / num2;

            System.out.println("A divisão é: " + divisao);
        }
        
        in.close();
    }
}
