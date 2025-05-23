package desafios;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Desafio03_Aula08 {

    //Variável global
    static String [] cabecalho = {"ID","NOME","TELEFONE","EMAIL"};
    static String [][] matrizCadastro = {{"",""}};
    static Scanner scanner = new Scanner(System.in);
    static File arquivoBancoDeDados = new File(System.getProperty("user.home"),"bancoDeDados.txt");

    public static void main(String[] args) {
        carregarDadosDoArquivo();
        matrizCadastro[0]= cabecalho;

        String menu= """
                _________________________________________________________________
                |   Escolha uma Opição:                                         |
                |       1- Exibir Cadastro Completo                             |
                |       2- Cadastrar Usuário                                    |
                |       3- Atualizar Usuário                                    |
                |       4- Deletar Usuário                                      |
                |       5- Sair                                                 |
                |_______________________________________________________________|
                """;
        int opcao;

        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirUsuarios();
                    break;
                case 2:
                    cadastrarUsuarios();
                    break;
                case 3:
                    atualizarUsuarios();
                    break;
                case 4:
                    deletarUsuarios();
                    break;
                case 5:
                    System.out.println("Fim de Programa");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção Inválida.");
            }
        }while (opcao != 5);
    }
    public static void exibirUsuarios(){
        StringBuilder tabela = new StringBuilder();

        for (String[] linha : matrizCadastro) {
            for (int coluna = 0; coluna < linha.length; coluna++) {
                int tamanhoColuna = coluna == 0? 5 : (coluna == 2? 10 :25);
                tabela.append(String.format("%-"+tamanhoColuna+"s | ",linha[coluna]));

            }
            tabela.append("\n");
        }
        System.out.println(tabela);
    }
    public static void cadastrarUsuarios(){

        System.out.print("Informe a Quantidade de Usuários a Serem Cadastrados:");
        int qntUsuario = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz= new String[matrizCadastro.length + qntUsuario][cabecalho.length];
        for ( int linha = 0; linha < matrizCadastro.length ;linha++){
            novaMatriz [linha] = Arrays.copyOf(matrizCadastro[linha],matrizCadastro[linha].length);
        }

        System.out.println("Preencha os Dados a Seguir:");

        for (int linha = matrizCadastro.length; linha < novaMatriz.length ;linha++){
            System.out.print(cabecalho[0]+linha);
            novaMatriz[linha][0] =String.valueOf(linha);

            for (int coluna  = 1; coluna  < cabecalho.length; coluna ++) {
                System.out.print(cabecalho[coluna] +": ");
                novaMatriz [linha][coluna] = scanner.nextLine();

            }
        }


        matrizCadastro = novaMatriz;
        System.out.println("Usuário Cadastrado com Sucesso.");
        salvarDadosNoArquivo();
    }
    public static void atualizarUsuarios(){

       exibirUsuarios();

        System.out.print("\nDigite o ID do Usuário que Deseja Atualizar:");
        int idEscolhido = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Atualize as Informações a Seguir");
        System.out.println(cabecalho[0]+ " - "+ idEscolhido);

        for (int coluna = 1; coluna < cabecalho.length; coluna++) {
            System.out.println(cabecalho[coluna]+": ");
            matrizCadastro [idEscolhido][coluna]= scanner.nextLine();
        }

        exibirUsuarios();
        System.out.println("Usuário Atualizado com Sucesso.");salvarDadosNoArquivo();

    }
    public static void deletarUsuarios(){
     exibirUsuarios();

        System.out.print("\nDigite o ID do Usuário que Deseja Deletar o Registro:");
        int idEscolhido = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz= new String[matrizCadastro.length - 1 ][cabecalho.length];
        for ( int linha = 0, idNovaMatriz = 0; linha < matrizCadastro.length ;linha++){
            if (linha == idEscolhido){
                continue;
            }
            novaMatriz [idNovaMatriz] = Arrays.copyOf(matrizCadastro[linha],matrizCadastro[linha].length);
            novaMatriz[idNovaMatriz][0]= String.valueOf(idNovaMatriz);
            idNovaMatriz++;
        }
        matrizCadastro= novaMatriz;
        exibirUsuarios();
        System.out.println("Usuário Deletado com Sucesso.");
        salvarDadosNoArquivo();
    }
    public static void salvarDadosNoArquivo(){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivoBancoDeDados))){
            for (String[]linha: matrizCadastro){
               bufferedWriter.write( String.join(",",linha)+"\n");
            }
        } catch (IOException e){
            throw new RuntimeException(e);

        }
    }
    public static void carregarDadosDoArquivo(){
        if(!arquivoBancoDeDados.exists()){
            try {
                if (arquivoBancoDeDados.createNewFile()) {
                    System.out.println("Arquivo " + arquivoBancoDeDados.getName() + "Criado com Sucesso");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

       try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoBancoDeDados))){
          
        String linha;
        StringBuilder conteudoArquivo = new StringBuilder();

        while ((linha = bufferedReader.readLine())!=null){
            if (!linha.trim().isEmpty()){
                conteudoArquivo.append(linha).append("\n");
            }
        }
        String[] linhaDadosUsuario= conteudoArquivo.toString().split("\n");

        matrizCadastro = new String[linhaDadosUsuario.length][cabecalho.length];
        for (int i =0 ; i< linhaDadosUsuario.length;i++){
            matrizCadastro[i] = linhaDadosUsuario[i].split(",");

        }
       }catch (IOException e){
           throw new RuntimeException(e);

       }
    }
}
