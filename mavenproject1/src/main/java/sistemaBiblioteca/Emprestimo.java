package sistemaBiblioteca;

public class Emprestimo {
    private String dataDevolucao;
    private String dataEmprestimo;
    private Cliente cliente; 
    private Livro livro;
    private int id; 
    private boolean ativo;
    
    //metodo construtor 
    public Emprestimo(String dataDevolucao, String dataEmprestimo, Cliente cliente, Livro livro, boolean ativo) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.cliente = cliente;
        this.livro = livro;
        this.ativo = true;
    }
    
    //metodo get
    
    public int getId(){
        return id;
    }
    public Livro getLivro(){
        return livro;
    }
    public Cliente getCliente(){
        return cliente;
    }
    
    public String getDataEmprestimo(){
        return dataEmprestimo;
    }
      public boolean Ativo() {
        return ativo;
    }
    //metodo set
    public String setDataEmprestimo(){
        this.dataEmprestimo = dataEmprestimo;
        return null;
    }
    public void setId(int id){
        this.id = id;
    }
    
    
    public String getDataDevolucao(){
        return dataDevolucao;
    }
    
     public String setDataDevolucao(){
         this.dataDevolucao = dataDevolucao;    
        return null;
    }
        public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

     
    @Override
    public String toString(){
        return "Informações do empestimo: \n"
                +  "data emprestrimo\n"
                +dataEmprestimo
                + "data devoluçao\n"
                + dataDevolucao
                + "Informaçoes do cliente :\n"
                + cliente
                +"Informaçoes do livro :\n"
                + livro; 
                
                 
                
    }   
}  