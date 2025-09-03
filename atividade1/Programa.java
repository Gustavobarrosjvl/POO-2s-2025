package atividade1;

public class Programa {
    private Integer MemoriaRAMalocada;
    private Integer SSDocupado;
    private Integer QTDopercoes;

    public Programa(Integer MemoriaRAMalocada, Integer SSDocupado, Integer QTDopercoes){
        this.MemoriaRAMalocada = MemoriaRAMalocada;
        this.SSDocupado = SSDocupado;
        this.QTDopercoes = QTDopercoes;
    }

    public Integer getMemoriaRAMalocada(){
        return this.MemoriaRAMalocada;
    }

    public Integer getSSDocupado(){
        return this.SSDocupado;
    }

    public Integer getQTDoperacoes(){
        return this.QTDopercoes;
    }
}
