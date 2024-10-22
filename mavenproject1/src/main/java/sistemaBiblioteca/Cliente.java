package sistemaBiblioteca;

public class Cliente {
    //Atributos de cliente todos privados
    private String nome;
    private String email;
    private int id;
    private String telefone;

    // Método construtor da classe cliente
    public Cliente(String nome, String email, int id) {
        this.nome = nome;
        this.email = email;
        this.id = id;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public int getId(){
        return id;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
