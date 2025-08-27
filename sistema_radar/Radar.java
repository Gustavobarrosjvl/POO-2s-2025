public class Radar{
    public Integer limiteVelocidade;
    public String modelo;
    public String localizacao;
    public Integer velocidadeAvaliada;

    public void emitirNotificacao(String placa, Integer velocidadeAvaliada){
        System.out.println("Limite de Velocidade: "+ this.limiteVelocidade);
        System.out.println("Velovidade Avaliada: "+velocidadeAvaliada);
        System.out.println("Placa: "+placa);
    }

    public void avaliarVelocidade(Carro c){
        if(c.velocidade > this.limiteVelocidade){
           emitirNotificacao(c.placa, c.velocidade);
        }
    }
}

//import java.io.PrintStream;