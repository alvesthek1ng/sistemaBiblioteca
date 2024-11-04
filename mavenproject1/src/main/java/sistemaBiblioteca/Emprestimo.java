package sistemaBiblioteca;

public class Emprestimo {

    private String dataDevolucao;
    private String dataEmprestimo;
    private  Cliente cliente;
    private  Livro livro;
    private int id;
    private static int contador = 0;
    private boolean ativo;

    //metodo construtor 
    public Emprestimo(String dataEmprestimo,String dataDevolucao, Cliente cliente, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.cliente = cliente;
        this.livro = livro;
        this.ativo = true;
        this.id = contador++; // incrementa o contador e atribui valor no id de emprestimo
    }

    //metodo get
    public int getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getdataDevolucao() {
        return dataDevolucao;
    }

    public boolean Ativo() {
        return ativo;
    }

    public void limparDados() {
        this.dataEmprestimo = null;
        this.dataDevolucao = null;
        this.cliente = null;
        this.livro = null;
        this.ativo = false;
    }

    //metodo set
    public void setdataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setdataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Informações do empestimo: \n"
                + "data emprestrimo :" + dataEmprestimo + "\n"
                + "data devoluçao : " + dataDevolucao + "\n"
                + cliente.toString() + "\n"
                + livro.toString();
    }
}
