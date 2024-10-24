package sistemaBiblioteca;

public class Emprestimo {
    private String titulo;
    private String autor;
    
    public Emprestimo(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
  
    // classe para emprestimo de livros
    class Emprestimo {
        private Cliente cliente;
        private Livro livro;
        private LocalDate dataEmprestimo;

        public Emprestimo(Cliente cliente, Livro livro) {
            this.cliente = cliente;
            this.livro = livro;
            this.dataEmprestimo = LocalDate.now()
        }
    }
}  