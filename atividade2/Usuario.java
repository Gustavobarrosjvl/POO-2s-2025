public class Usuario extends Pessoa{    
    private Integer matricula;

    public Usuario(String nome, String email, Integer matricula){
        super(nome, email);
        this.matricula = matricula;
    }
    public void exibirInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("email: " + getEmail());
        System.out.println("Matricula: " + this.matricula);
    }
}
