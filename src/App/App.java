package App;

import Entidades.Cores;
import Entidades.Forma;
import Entidades.Quadrado;

public class App {
    public static void main(String[] args) {

        //Instanciando um quadrado
        Quadrado q = new Quadrado(Cores.ROXO,12.5,12.5);
        System.out.println("A cor do Quadrado é: " + q.getCor());
        System.out.println("A área do quadrado é: " + q.calcularArea());

        Forma f = new Quadrado(Cores.VERMELHO,5,5);
        System.out.println("A cor do quadrado é: " + f.getCor());
        System.out.println("A área do quadrado é: " + f.calcularArea());
    }
}
