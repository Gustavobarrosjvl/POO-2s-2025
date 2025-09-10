public class Chacara extends Imovel{
    private boolean possuiPocoArtesiano;

    public boolean getPocoArtesiano(){
        return this.possuiPocoArtesiano;
    }

    public void setPocoArtesiano(boolean possuiPocoArtesianoocoArtesiano){
        this.possuiPocoArtesiano = possuiPocoArtesianoocoArtesiano;
    }

    public Chacara(Municipio municipio, Double areaM2, Integer vagas, Boolean possuiPocoArtesiano){
        super(municipio, areaM2, vagas);
        this.possuiPocoArtesiano = possuiPocoArtesiano;
    }
}