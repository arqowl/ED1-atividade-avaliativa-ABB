package app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
		String codigoAux;
        CadastroProdutos estoque = new CadastroProdutos();
        int op;
        do {
            exibirOpcoes();
            op = in.nextInt();
            switch (op){
                case 1: estoque.CadastrarProduto();
                        break;
                case 2: estoque.ExibirDadosProduto();
                        break;
                case 3: estoque.exibirProdutos();
                        break;
                case 4: 
						System.out.print("Informe o codigo do produto que você deseja alterar o preco: ");
						codigoAux = in.next(); in.nextLine();
						estoque.alterarPrecoProduto(codigoAux);
                        break;
				case 5:
						System.out.print("Informe o codigo do produto que você deseja alterar a quantidade: ");
						codigoAux = in.next(); in.nextLine();
						estoque.alterarQuantidadeEstoqueProduto(codigoAux);
						break;
				case 6:
						System.out.print("Informe o codigo do produto que você deseja remover: ");
						codigoAux = in.next(); in.nextLine();
						estoque.removerProduto(codigoAux);
						break;
                case 0: System.out.println("Bye");
                        break;
                default: System.out.println("Opção inválida");
            } 
        } while (op != 0);
	}


	public static void exibirOpcoes () {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Exibir dados de um produto");
        System.out.println("3 - Exibir todos os produtos");
        System.out.println("4 - Alterar preco de um produto");
		System.out.println("5 - Alterar quantidade de um produto");
		System.out.println("6 - Remover um produto");
        System.out.println("0 - Sair");
        System.out.print("Informe a opção: ");   
    }

}
