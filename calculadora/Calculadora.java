package calculadora;

public class Calculadora{

    public double numeroA;
    public double numeroB;

    public Calculadora(){
    }

    public void somar(){
        double resultadoSoma = this.numeroA + this.numeroB;
        System.out.println(this.numeroA + " + " + this.numeroB + " = " + resultadoSoma);
    }
}