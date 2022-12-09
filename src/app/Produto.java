package app;

public class Produto implements Comparable<Produto>{
    private String codigo;
    private String descricao;
    private String fornecedor;
    private double preco;
    private int qtdEstoque;

    
    public Produto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }


    public Produto(String codigo) {
        this.codigo = codigo;
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String getFornecedor() {
        return fornecedor;
    }


    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    public int getQtdEstoque() {
        return qtdEstoque;
    }


    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }


    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", fornecedor=" + fornecedor + ", preco="
                + preco + ", qtdEstoque=" + qtdEstoque + "]";
    }
    
    @Override
    public int compareTo(Produto data) {
        int result;
        result = this.getCodigo().compareToIgnoreCase(data.getCodigo());
        return result;
    }

    

}
