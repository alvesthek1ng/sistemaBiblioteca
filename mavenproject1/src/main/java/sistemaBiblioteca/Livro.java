package sistemaBiblioteca;

public class Livro {

    //criando os atributos
    public String titulo;
    public String autor;
    private int id;
    public String anoPublicacao;
    public int numExemplares;

    // Método construtor da classe livro
    public Livro(String titulo, String autor, int id, String anoPublicacao, int numExemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.anoPublicacao = anoPublicacao;
        this.numExemplares = numExemplares;
        
        
    //Metodos Get
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getNumExemplares() {
        return numExemplares;
    }
}
}
