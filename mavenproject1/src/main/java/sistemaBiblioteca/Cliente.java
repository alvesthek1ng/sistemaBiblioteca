package sistemaBiblioteca;

public class Cliente {
    //Atributos de cliente todos privados

    private String nome;
    private String email;
    private int id;

    // Método construtor da classe cliente
    public Cliente(String nome, String email, int id) {
        this.nome = nome;
        this.email = email;
        this.id = id;
    }
}
