public class Radar{
    private Integer limiteVelocidade;
    private String localizacao;
    private Integer velocidadeAvaliada;

    public Radar(Integer limiteVelocidade, String localizacao){
        this.limiteVelocidade = limiteVelocidade;
        this.localizacao = localizacao;
    }

    public void emitirNotificacao(String placa, Integer velocidadeAvaliada){
        System.out.println("Limite de Velocidade: "+ this.limiteVelocidade);
        System.out.println("Velovidade Avaliada: "+velocidadeAvaliada);
        System.out.println("Placa: "+placa);
    }

    public void avaliarVelocidade(Carro c){
        if (c.getVelocidade() > this.limiteVelocidade) {
            emitirNotificacao(c.getPlaca(), c.getVelocidade());
        }
    }
}