package Entidades;

public class Triangulo extends Forma{

    private final double ladoA, ladoB, ladoC;

    public Triangulo(Cores cor, double ladoA, double ladoB, double ladoB1, double ladoC){
        super(cor);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }


    @Override
    public double calcularArea() {
        double p =(this.ladoA +this.ladoB +this.ladoC) / 2;
        return Math.sqrt(p*(p - this.ladoA)*(p - this.ladoB)*(p - this.ladoC));
    }
}
