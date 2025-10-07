public class Revista extends Material {
    private Integer edicao;

    public Revista(String titulo, Integer anoPublicacao, Integer edicao){
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }
    public void descricao(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano de Publicacao: " + getAnoPublicacao());
        System.out.println("Edicao: " + this.edicao);
    }
}
