package atividade1;

public class Computador{

    private Integer MemoriaRAM;
    private Integer SSD;
    private Integer Nucleos;
    private float OperacoesPS;

    public Computador(Integer MemoriaRAM, Integer SSD, Integer Nucleos, float OperacoesPS){
        this.MemoriaRAM = MemoriaRAM;
        this.SSD = SSD;
        this.Nucleos = Nucleos;
        this.OperacoesPS = OperacoesPS;
    }

    public Integer getMemoriaRAM(){
        return this.MemoriaRAM;
    }

    public Integer getSSD(){
        return this.SSD;
    }

    public Integer getNucleos(){
        return this.Nucleos;
    }

    public float getOperacoesPS(){
        return this.OperacoesPS;
    }   

    public void setMemoriaRAM(Integer MemoriaRAM){
            this.MemoriaRAM = MemoriaRAM;
    }

    public void setSSD(Integer SSD){
            this.SSD = SSD;
    }
}