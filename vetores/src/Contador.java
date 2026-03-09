public class Contador {

    public int contador = 0;

    public int incrementar(){
        contador++;

        return contador;
    }

    public int decrementar(){
        contador--;

        return contador;
    }

    public void mostrarValor(){
        System.out.println("\nValor da variável: " + this.contador);
    }

}
