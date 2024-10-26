package sistemaBiblioteca;

public class Emprestimo {
    private String dataDevolucao;
    private String dataEmprestimo;
    private Cliente cliente; 
    private Livro livro;
    
    //metodo construtor 
    public Emprestimo(String dataDevolucao, String dataEmprestimo, Cliente cliente, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.cliente = cliente;
        this.livro = livro;
    }
    
    //metodo get
    public String getDataEmprestimo(){
        return dataEmprestimo;
    }
  
    //metodo set
    public String setDataEmprestimo(){
        this.dataEmprestimo = dataEmprestimo;
        return null;
    }
    
    
    public String getDataDevolucao(){
        return dataDevolucao;
    }
    
     public String setDataDevolucao(){
         this.dataDevolucao = dataDevolucao;    
        return null;
    }
    
    
    
}  