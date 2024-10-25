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

    // Criei os metodos get
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    // Criei os metodos set
    public void setEmail(String email) {
        if(!email.contains("@")){
            throw new IllegalArgumentException("Email inválido");
        }
        this.email = email;
    }

    public void setTelefone(String telefone) {
        if(!telefone.matches("\\d{10,15}")){
            throw new IllegalArgumentException("Telefone inválido");
        }
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return "Cliente{"
                + "nome='" + nome + '\''
                + ", email='" + email + '\''
                + ", id=" + id
                + ", telefone='" + telefone + '\''
                + '}';
    }

}
