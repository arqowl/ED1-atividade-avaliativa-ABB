package app;

import java.util.Scanner;

public class CadastroProdutos {
    private BinaryTree<Produto> estoque;
    
    public CadastroProdutos () {
        estoque = new BinaryTree();
    }
    
    public void CadastrarProduto () {
        Scanner in = new Scanner (System.in);
        Produto prod;
        String descricao, codigo;
        System.out.print("Informe a descricao do Produto: ");
        descricao = in.nextLine();
        System.out.print("Informe a codigo do Produto: ");
        codigo = in.nextLine();    
        prod = new Produto (codigo, descricao);
        estoque.insert(prod);
    }

    public void ExibirDadosProduto () {
        Scanner in = new Scanner (System.in);
        Produto prod, retorno;
        String codigo;        
        System.out.print("Informe a codigo do Produto: ");
        codigo = in.nextLine(); 
        prod = new Produto (codigo);
        retorno = estoque.buscar(prod);
        if (retorno == null) {
            System.out.println("Produto não cadastrado!");
        }
        else {
            System.out.print("Dados do Produto: ");
            System.out.println(retorno);
        }
    }

    public Produto procurarProduto (String cod) {
        Produto prod, retorno; 
        prod = new Produto (cod);
        retorno = estoque.buscar(prod);
        return retorno;
    }

    public void alterarPrecoProduto(String cod) {
        Scanner in = new Scanner(System.in);
        Produto retorno = procurarProduto(cod);
        double preco;
        if(retorno == null) {
            System.out.println("Produto não cadastrado!");
        } else {
            System.out.println("Dados atuais do produto "+retorno);
            System.out.print("Informe o novo preco: ");
            preco = in.nextDouble(); in.nextLine();
            retorno.setPreco(preco);
            System.out.println("Dados do produto apos alteracao "+retorno);
        }
    }

    public void alterarQuantidadeEstoqueProduto(String cod) {
        Scanner in = new Scanner(System.in);
        Produto retorno = procurarProduto(cod);
        int qtd;
        if(retorno == null) {
            System.out.println("Produto não cadastrado!");
        } else {
            System.out.println("Dados atuais do produto "+retorno);
            System.out.print("Informe a nova quantidade: ");
            qtd = in.nextInt(); in.nextLine();
            retorno.setQtdEstoque(qtd);
            System.out.println("Dados do produto apos alteracao "+retorno);
        }
    }

    public void removerProduto(String cod) {
        Produto retorno = procurarProduto(cod);
        estoque.remove(retorno);
    }


    public void exibirProdutos () {
        if (this.estoque.isEmpty() == true) {
            System.out.println("Não existem Produtos cadastrados");
        }
        else {
            this.estoque.emOrdem();
        }
    }
}

