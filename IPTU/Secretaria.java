public class Secretaria {
    public static void main(String[] args) {
        Municipio brasilia = new Municipio("Brasilia", "DF", 65.5);

        Apartamento apto = new Apartamento(brasilia, 52.0, 1, true);
        
        System.out.println("IPTU: " + apto.calcularIPTU());
    }
}
