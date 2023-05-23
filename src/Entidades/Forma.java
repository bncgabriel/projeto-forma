package Entidades;

public abstract class Forma {
    //Atributo baseado no tipo Enum Cores
    private Cores cor;


    //Método Get
    public Cores getCor() {
        return cor;
    }

    //Método Construtor
    public Forma(Cores cor) {
        this.cor = cor;
    }

    //Método Set
    public void setCor(Cores cor) {
        this.cor = cor;
    }
    // Método calcularArea()
    //Metodo calcular area:
    public abstract double calcularArea();
}