package atividade1;

public class SO{
    
    private Computador computador;
    
    public SO(Computador computador){
        this.computador = computador;
    }

    public Computador getComputador(){
        return this.computador;
    }

    public boolean ExecutarPrograma(Programa P, int numero){
        System.out.println("\nExecutando o Programa " + numero +"...");

        //Verificar SSD
        if(P.getSSDocupado() > computador.getSSD()){
            System.out.println("Erro na instalacao do programa (SSDocupado maior que o disponivel pelo Computador).");
            return false;
        }

        //Verificar Memoria RAM
        if(P.getMemoriaRAMalocada() > computador.getMemoriaRAM()){
            System.out.println("Erro na execução do programa (memoriaRAMalocada maior que a disponivel pelo Computador).");
            return false;
        }

        //TEMPO
        double tempoExecucao = (double) P.getQTDoperacoes() / (computador.getOperacoesPS() * computador.getNucleos());
        
        System.out.println("Programa Executado com Sucesso!");
        System.out.println("Tempo de execucao: "+ tempoExecucao +" segundos");

        return true;
    }
}