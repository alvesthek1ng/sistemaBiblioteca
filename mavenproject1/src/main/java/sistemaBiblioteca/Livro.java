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
    }
   
    //metodo Set
            
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
    public String toString(){
        return "Cliente{"
                + ", id ='" + id 
                +"TItulo='" + titulo + '\''
                + ", autor='" + autor + '\''
                + ", AnoPublicacao'" + anoPublicacao +'\''
                + ", NumExemplares'" + numExemplares +'\''
                +'}';
        
    }
}