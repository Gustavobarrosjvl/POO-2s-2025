package atividade1;

public class Main{
    public static void main(String[] args){
        Computador PC = new Computador(16, 256, 10, 10000);
        
        SO IOS = new SO(PC);
        
        //Programa certo
        Programa P1 = new Programa(8, 80, 5000);
        //Programa erro SSD
        Programa P2 = new Programa(8, 400, 6000);
        //Programa erro RAM
        Programa P3 = new Programa(24, 200, 9500);
        
        IOS.ExecutarPrograma(P1, 1);
        IOS.ExecutarPrograma(P2, 2);
        IOS.ExecutarPrograma(P3, 3);
    }
} 