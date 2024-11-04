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
        this.idLivro = id;
        this.anoPublicacao = anoPublicacao;
        this.numExemplares = numExemplares;
    }
    // cria contrutor
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
        this.idLivro = id;
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

    public void setanoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setNumExemplares(int numExemplares) {
        this.numExemplares = numExemplares;
    }

    @Override
    public String toString() {
        return "Livro :{\n"
                + " Id: " + idLivro + ",\n"
                + " Título:'" + titulo + "',\n"
                + " Autor:'" + autor + "',\n"
                + " Ano de publicação:'" + anoPublicacao + "',\n"
                + "Númenro de exemplares:'" + numExemplares +"',\n"
                + '}';

    }
}
