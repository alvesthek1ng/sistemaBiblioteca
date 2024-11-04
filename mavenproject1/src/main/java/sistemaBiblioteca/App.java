package sistemaBiblioteca;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    // função para salvar os dados 
    public static boolean salvarTudo(Livro[] livros, Cliente[] clientes, Emprestimo[] emprestimos) {
        try {
            FileWriter arquivo = new FileWriter("./Arquivo/registros.txt", true);
            PrintWriter pw = new PrintWriter(arquivo);
            pw.println("Lista de Livros:");
            for (Livro livro : livros) {
                if (livro != null) {
                    pw.println(livro);
                }
            }
            pw.println("Lista de Clientes:");
            for (Cliente cliente : clientes) {
                if (cliente != null) {
                    pw.println(cliente);
                }
            }
            pw.println("Lista de Empréstimos:");
            for (Emprestimo emprestimo : emprestimos) {
                if (emprestimo != null) {
                    pw.println(emprestimo);
                }
            }
            pw.close();
            arquivo.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
            return false;
        }
    }
        // função para cadastar os livro, caso haja espaço no array 
    public static boolean cadastrarLivro(Livro novoLivro, Livro[] livros) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = novoLivro;
                return true;
            }
        }
        return false;
    }

    // função para cadastrar livros 
    public static void cadastrarLivroMenu(Scanner scanner, Livro[] livros) {
        try {
            System.out.println("Título:");
            String titulo = scanner.nextLine();
            System.out.println("Autor:");
            String autor = scanner.nextLine();
            System.out.println("Id:");
            int id = scanner.nextInt();
            scanner.nextLine();// consome a linha em branco 
            System.out.println("Ano de Publicação:");
            String anoPublicacao = scanner.nextLine();
            System.out.println("Número de Exemplares:");
            int numExemplares = scanner.nextInt();
            scanner.nextLine();// consome a linha em branco

            Livro novoLivro = new Livro(titulo, autor, id, anoPublicacao, numExemplares);
            if (cadastrarLivro(novoLivro, livros)) {
                System.out.println("Livro cadastrado com sucesso!");

            } else {
                System.out.println("Não foi possível cadastrar o livro. Array cheio.");
            }
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Por favor, tente novamente.");
            scanner.next(); // Limpa a entrada inválida

        }
    }

    // função para cadastar os clientes 
    public static boolean cadastrarCliente(Cliente novoCliente, Cliente[] clientes) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = novoCliente;
                return true;
            }
        }
        return false;
    }

    // função para emprestimo de livro
    public static boolean EmprestimoLivro(Cliente cliente, String dataEmprestimo, String dataDevolucao, Livro livro, Emprestimo[] emprestimos) {
        Emprestimo novoEmprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, cliente, livro);
        for (int i = 0; i < emprestimos.length; i++) {
            if (emprestimos[i] == null) {
                emprestimos[i] = novoEmprestimo;
                return true;
            }
        }
        return false;
    }

    // Se a funçao conseguir encontrar o livro devolve e retorna verdadeiro se nao retorna false
    public static boolean DevolucaoLivro(int id, Livro[] livros) {

        for (int i = 0; i < livros.length; i++) {
            if (livros[i].getId() == id) {
                livros[i].numExemplares++;
                return true;
            }
        }
        return false;
    }

    // Função para listar livros
    public static void listarLivros(Livro[] livros) {
        System.out.println("Listagem de Livros:");
        for (Livro livro : livros) {
            if (livro != null) {
                System.out.println(livro);
            }
        }
    }

    // Função para listar clientes
    public static void listarClientes(Cliente[] clientes) {
        System.out.println("Listagem de Clientes:");
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                System.out.println(cliente);
            }
        }
    }
    // Função para realizar empréstimo

    public static void realizarEmprestimo(Livro[] livros, Cliente[] clientes, Emprestimo[] emprestimos, Scanner scanner) {
        System.out.println("Número de Identificação do Cliente:");
        int idCliente = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ID do Livro:");
        int idLivro = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Data do emprestimo:");
        String dataEmprestimo = scanner.nextLine();
        System.out.println("Data da devolucao:");
        String dataDevolucao = scanner.nextLine();

        Cliente cliente = new Cliente();
        Livro livro = new Livro();

        // Verifica se o cliente existe
        for (Cliente cli : clientes) {
            if (cli != null && cli.getIdCliente() == idCliente) {
                cliente = cli;
                break;
            }
        }
        // Verifica se o livro existe e está disponível
        for (Livro liv : livros) {
            if (liv != null && liv.getId() == idLivro && liv.getnumExemplares() > 0) {
                livro = liv;
                break;
            }
        }
        if (cliente.getIdCliente() == 0) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        if (livro.getId() == 0) {
            System.out.println("Livro não disponível.");
            return;
        }
        // Realiza o empréstimo
        Emprestimo novoEmprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, cliente, livro);
        for (int i = 0; i < emprestimos.length; i++) {
            if (emprestimos[i] == null) {
                emprestimos[i] = novoEmprestimo;
                livro.setNumExemplares(livro.getnumExemplares() - 1);
                System.out.println("Empréstimo realizado com sucesso! id do emprestimo :" + novoEmprestimo.getId());
                break;
            }
        }
    }

    public static void cadastrarClienteMenu(Scanner scanner, Cliente[] clientes) {
        try {
            System.out.println("Nome:");
            String nome = scanner.nextLine();
            System.out.println("E-mail:");
            String email = scanner.nextLine();
            System.out.println("Telefone:");
            String telefone = scanner.nextLine();
            System.out.println("Número de Identificação:");
            int id = scanner.nextInt();
            scanner.nextLine();
            Cliente novoCliente = new Cliente(nome, email, telefone, id);
            if (cadastrarCliente(novoCliente, clientes)) {
                System.out.println("Cliente cadastrado com sucesso!");
            } else {
                System.out.println("Não foi possível cadastrar o cliente. Array cheio.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Por favor, tente novamente.");
            scanner.next();
        }
    }
    // Função para devolver livro

    public static void devolverLivro(Emprestimo[] emprestimos, Livro[] livros, Scanner scanner) {
        System.out.println("ID do Empréstimo:");
        int idEmprestimo = scanner.nextInt();
        scanner.nextLine(); // Consome a linha em branco após o número

        for (Emprestimo emp : emprestimos) {
            if (emp != null && emp.getId() == idEmprestimo && emp.Ativo()) {
                for (Livro l : livros) {
                    if (l != null && l.getId() == emp.getLivro().getId()) {
                        l.setNumExemplares(l.getnumExemplares() + 1);
                        emp.setAtivo(false); // Marca o empréstimo como inativo
                        emp.limparDados();// limpa os dados do emprestimo 
                        System.out.println("Livro devolvido com sucesso!");
                        return;
                    }
                }
            }
        }
        System.out.println("Empréstimo não encontrado ou já inativo.");
    }
// Função para listar os emprestimos ativos 

    public static void listarLivrosEmprestados(Emprestimo[] emprestimos) {
        System.out.println("Listagem de Livros emprestados:");
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo != null && emprestimo.Ativo()) {
                System.out.println("ID do Empréstimo: " + emprestimo.getId()
                        + ", Livro: " + emprestimo.getLivro().titulo
                        + ", Cliente: " + emprestimo.getCliente().getNome()
                        + ", Data do Empréstimo: " + emprestimo.getDataEmprestimo());
            }
        }
    }
// Função principal onde esta alocado o menu e chamando as funçoes para realizar as funcionalidades

    public static void main(String[] args) {
// inicializaçao dos arrays
        Scanner scanner = new Scanner(System.in);
        Livro[] livros = new Livro[100];
        Cliente[] clientes = new Cliente[100];
        Emprestimo[] emprestimos = new Emprestimo[100];
// estrutura de repetiçao iterativa do menu
        while (true) {
            try {
                System.out.println("Menu Principal");
                System.out.println("1. Cadastrar Livro");
                System.out.println("2. Cadastrar Cliente");
                System.out.println("3. Realizar Empréstimo");
                System.out.println("4. Devolver Livro");
                System.out.println("5. Listar Livros");
                System.out.println("6. Listar Clientes");
                System.out.println("7. Ver Empréstimos Ativos");
                System.out.println("8. Salvar");
                System.out.println("9. Sair");
                System.out.println("------------------------------");
                System.out.println("                               ");

                int opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1:
                        cadastrarLivroMenu(scanner, livros);
                        break;
                    case 2:
                        cadastrarClienteMenu(scanner, clientes);
                        break;
                    case 3:
                        // 
                        realizarEmprestimo(livros, clientes, emprestimos, scanner);
                        break;
                    case 4:
                        // 
                        devolverLivro(emprestimos, livros, scanner);
                        break;
                    case 5:
                        // 
                        listarLivros(livros);
                        break;
                    case 6:
                        // 
                        listarClientes(clientes);
                        break;
                    case 7:
                        // 
                        listarLivrosEmprestados(emprestimos);
                        break;

                    case 8:

                        salvarTudo(livros,clientes,emprestimos);
                        break;
                    case 9:
                        System.out.println("Saindo...");
                        return;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
                // testa a entrada e exibe mensagem 
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.next(); // Limpa a entrada inválida
            }
        }
    }

}
