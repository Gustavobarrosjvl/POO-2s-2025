public class simulacao {
    public static void main(String[] args) {
        Carro opala = new Carro();
        opala.velocidade = 0;
        opala.placa = "ACLR300";
        opala.modelo = "Comodoro";
        opala.ano = 76;

        Radar radar = new Radar();
        radar.limiteVelocidade = 30;
        radar.localizacao = "Pistao Sul";

        opala.acelerar(); //5
        opala.acelerar(); //10
        opala.acelerar(); //15
        opala.acelerar(); //20
        opala.acelerar(); //25
        opala.acelerar(); //30

        radar.avaliarVelocidade(opala);

        opala.acelerar(); //35
        radar.avaliarVelocidade(opala);

        opala.frear(); //30
        radar.avaliarVelocidade(opala);

    }
}