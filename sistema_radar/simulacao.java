public class simulacao {
    public static void main(String[] args) {
        Carro opala = new Carro("ACLR300", 0, 76, "Comodoro");

        Radar radar = new Radar(30, "Pistao Sul");

        opala.acelerar(); //5
        opala.acelerar(); //10
        opala.acelerar(); //15
        opala.acelerar(); //20
        opala.acelerar(); //25
        opala.acelerar(); //30

        opala.setVelocidade(40);

        radar.avaliarVelocidade(opala);

        /*opala.acelerar(); //35
        radar.avaliarVelocidade(opala);

        opala.frear(); //30
        radar.avaliarVelocidade(opala);*/

    }
}