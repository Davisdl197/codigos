import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        double preco = 0,  desconto = 0, novoPreco = 0;

        System.out.print("Digite o preço do produto: ");
        preco = in.nextDouble();

        System.out.print("Digite o desconto: ");
        desconto = in.nextDouble();

        novoPreco = preco - ( preco * (desconto / 100.0));

        System.out.println("O preço após desconto é: " + novoPreco);



        in.close();
    }
}
