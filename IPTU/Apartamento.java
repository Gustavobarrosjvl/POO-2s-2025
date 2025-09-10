public class Apartamento extends Imovel{
    private Boolean possuiElevador;

    public boolean getPossuiElevador(){
        return this.possuiElevador;
    }

    public void setPossuiElevador(boolean possuiElevador){
        this.possuiElevador = possuiElevador;
    }

    public Apartamento(Municipio municipio, Double areaM2, Integer vagas, Boolean possuiElevador){
        super(municipio, areaM2, vagas);
        this.possuiElevador = possuiElevador;
    }
}