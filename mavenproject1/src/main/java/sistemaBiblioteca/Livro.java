package sistemaBiblioteca;

public class Livro {

    //criando os atributos
    public String titulo;
    public String autor;
    private int idLivro;
    public String anoPublicacao;
    public int numExemplares;

    // Método construtor da classe livro
    public Livro(String titulo, String autor, int id, String anoPublicacao, int numExemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.idLivro = idLivro;
        this.anoPublicacao = anoPublicacao;
        this.numExemplares = numExemplares;
    }
    // cria contrutor vazio
    public Livro(){}

    // metodo get para retornar o id 
    public int getId() {
        return idLivro;
    }

    public int getnumExemplares() {
        return numExemplares;
    }

    //metodo Set
    
    public void setId(int id) {
        this.idLivro = idLivro;
    }
        public void getnumExemplares(int numExemplares) {
        this.numExemplares = numExemplares ;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(String AnoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setNumExemplares(int numExemplares) {
        this.numExemplares = numExemplares;
    }

    @Override
    public String toString() {
        return "informaçoes do livro :{"
                + ", id ='" + idLivro
                + "TItulo='" + titulo + '\''
                + ", autor='" + autor + '\''
                + ", AnoPublicacao'" + anoPublicacao + '\''
                + ", NumExemplares'" + numExemplares + '\''
                + '}';

    }
}
