public class Emprestimo {
    private Pessoa pessoa;
    private Material material;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Pessoa pessoa, Material material, String dataEmprestimo, String dataDevolucao){
        this.pessoa = pessoa;
        this.material = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDetalhes(){
        System.out.println("Detalhes do Emprestimo");
        System.out.println("Data do Emprestimo: " + this.dataEmprestimo);
        System.out.println("Data de Devolucao: " + this.dataDevolucao);
        System.out.println("\nDados da Pessoa");
        this.pessoa.exibirInfo();
        System.out.println("Dados do Material");
        this.material.descricao();


    }
}
