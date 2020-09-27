
package Array_list_Produtos;

/**
 *
 * @author Rodrigo Rother
 */
public class Produtos {
    
    private String nome;
    private int quantidade;
    private double valorUnitario;
    // Nesta classe eu estou colocando os atributos que serão cadastrados na lista

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome; //this refere-se a instância atual do objeto
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valorUnitario
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    @Override
    public String toString(){
        return "\nProduto " + this.nome+ " Valor R$ " +this.valorUnitario+ " Quantidade " +this.quantidade+ " Unidade(s) ";
    }
    
    // Produto, valor e quantidade será mostrado quando for escolhido o case 2
    // nProduto é o nome do produto digitado que recebe nome, valor unitário e a quantidade
    
    public double calcularTotal(){
        return this.quantidade * this.valorUnitario; 
    //Calcular Total da lista, pega a quantidade de produtos e multiplica pelo valor unitário do produto
    }
    
}
