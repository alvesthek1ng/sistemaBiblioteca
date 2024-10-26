package sistemaBiblioteca;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.util.Scanner;

public class App {
    
    // função para salvar os dados do livro 
    public static boolean salvarDados (Emprestimo emprestimo ){
        try {
            FileWriter arquivo = new FileWriter ("./Arquivo/registros.txt", true);
            PrintWriter pw = new PrintWriter (arquivo);
            pw.println(emprestimo);
            pw.close();
            arquivo.close();
            return true;
        } catch (Exception e) {
            System.out.println("erro : "+ e.getMessage());
            return false;
        }
    }
    // função para cadastar os livro, caso haja espaço no array 
    public static boolean cadastrarLivro (Livro novoLivro, Livro[] livros){
        for (int i = 0; i < livros.length; i++){
            if (livros[i] == null){
                livros[i]= novoLivro;
                return true;
            }
        }
        return false;   
    }
    // função para cadastar os clientes 
    public static boolean cadastrarCliente (Cliente novoCliente, Cliente[] clientes){
        for (int i = 0; i < clientes.length; i++){
            if (clientes[i]== null){
                clientes[i]= novoCliente;
                return true;
            }
        }
        return false;
    }
    // função para emprestimo de livro
    public static boolean EmprestimoLivro (Cliente cliente,String dataEmprestimo, String dataDevolucao,Livro livro){
        Emprestimo novoEmprestimo = new Emprestimo ("10 10 2024", "15 10 25" ,cliente , livro);
        return salvarDados(novoEmprestimo);
    }
    // Se a funçao conseguir encontrar o livro devolve e retorna verdadeiro se nao retorna false
    public static boolean DevolucaoLivro (int id , Livro[] livros){
       
        for (int i = 0 ; i < livros.length ; i ++){
            if (livros[i].getId()== id){
                livros[i].numExemplares ++; 
                return true;
            }                               
        } return false; 
    } 
            
            
            
            
            
    public static void main(String[] args) {
        
        Livro livros = new Livro ("kj","lk", 1, "lk", 1);
        Cliente clientes = new Cliente ("kj","kjk","kjk", 12);
        
        Emprestimo emprestimos = new Emprestimo ("kj", "kjk",clientes, livros);
        salvarDados(emprestimos);
    }
        
    
    // arrays para armazenar livros,usuarios e emprestimos
//    private static Livro[] livros;
//    private static Cliente[] Clintes;
//    private static Emprestimo[] emprestimos;
//    
//    public cadastrarCliente(){
//        
//    }
}
