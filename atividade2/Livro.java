public class Livro extends Material {
    private String autor;

    public Livro(String titulo, Integer anoPublicacao, String autor){
        super(titulo, anoPublicacao);
        this.autor = autor;
    }
    public void descricao(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Ano de Publicacao: " + getAnoPublicacao());
        System.out.println("Autor: " + this.autor);
    }
}
