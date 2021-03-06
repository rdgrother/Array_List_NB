
package Array_list_Produtos;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo Rother
 */
public class ListaDeCompras { // Essa classe vai receber os produtos cadastrados
    
    private ArrayList<Produtos> lista;
    
    //Método Construtor do Array List, o método construtor tem sempre o mesmo nome da classe que ele está
    public ListaDeCompras(){
        lista = new ArrayList<>();
    }
    //Método get da lista (pegar)
    public ArrayList<Produtos> getLista(){
        return lista;
    }
    //Método set da lista
    public void setLista(ArrayList<Produtos> lista){
        this.lista = lista;
    }
    //To String da lista, este método retorna uma representação resumida, mas informativa e que seja fácil de uma pessoa ler
    @Override // Subescrevendo e mostrando na tela
    public String toString(){
        return "ListaDeCompras{" + " lista=" + lista + '}'; //Explicar
    }
    //Método adicionar, adiciona na ListaDeCompras o que vem da classe Produtos 
    public void adicionarProduto(Produtos p1){
        this.lista.add(p1); // 
    }
    //Apagar toda a lista
    public void apagarTudo(){
        this.lista.clear();// Método Clear limpa a lista toda (apaga tudo) este método não tem return apenas exclui a lista
    }
    //Método que mostra a quantidade de registros
    public int obterQuantidadeDeProdutos(){
        return this.lista.size(); //Método Size retorna a quantidade de elementos no Array List.
    }
    //Método que vai calcular o total da lista
    public double calcularTotalDaLista(){
        double soma = 0;
        for(int i=0; i<this.lista.size();i++){ //Método Size retorna a quantidade de elementos no Array List.
            soma = soma + this.lista.get(i).calcularTotal(); // Método get(indice) retorna o elemento que está armazenado no indice especificado 
        } // o i é a posição do elemento na lista.
       return soma;
    }
}
