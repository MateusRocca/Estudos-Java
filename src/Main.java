import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeDoLivro;
        String autorDoLivro;
        String categoria;
        String sinopse;
        String editora;
        int faixaEtaria;
        int quantidadeDePaginas;
        int anoDeLancamento;
        int nota;
        int quantidadeEstoque;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira o nome do livro: ");
        nomeDoLivro = leitura.nextLine();
        System.out.println("Insira o autor do livro: ");
        autorDoLivro = leitura.nextLine();
        System.out.println("Insira a categoria do livro: ");
        categoria = leitura.nextLine();
        System.out.println("Insira a editora do livro: ");
        editora = leitura.nextLine();
        System.out.println("Insira a sinopse do livro: ");
        sinopse = leitura.nextLine();
        System.out.println("Insira a faixa etária do livro: ");
        faixaEtaria = leitura.nextInt();
        System.out.println("Insira a quantidade de páginas do livro: ");
        quantidadeDePaginas = leitura.nextInt();
        System.out.println("Insira a nota do livro: ");
        nota = leitura.nextInt();
        System.out.println("Insira a quantidade em estoque: ");
        quantidadeEstoque = leitura.nextInt();




    }
}