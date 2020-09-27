
package array_list;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Rother
 */
public class Main {
   
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        
        ListaDeCompras l1 = new ListaDeCompras();// Instanciando o objeto Lista de compras
        int op;
        do{
            System.out.println("Digite uma Opção");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Visualizar Produto");
            System.out.println("3 - Quantidade Produto");
            System.out.println("4 - Apagar tudo");
            System.out.println("5 - Ver Total das compras");
            System.out.println("0 - Sair");
            op = ler.nextInt();
            switch(op){ // Switch indica a variavel a ser comparada nas expressões case
                        
                        /* Controles de fluxo dentro de um bloco de código
                        case: Executa um bloco de código dependendo do teste switch, aqui neste caso
                        quando o usuário digitar um número executa um bloco de códigos.
                        break: Sai do bloco de código */    
                
                case 1: // Caso digite 1 vamos para o cadastro de produtos
                    Produtos p1 = new Produtos(); //Instanciando o objeto produto e chamando seu construtor
                    System.out.println("Digite o nome do produto");
                    ler.nextLine();
                    p1.setNome(ler.nextLine()); //Grava nome e passa para outra linha
                    do{ 
                        System.out.println("Digite a quantidade:");
                        p1.setQuantidade(ler.nextInt());
                        if(p1.getQuantidade()<=0){ // Se a quantidade for menor ou igual a zero, retorna quantidade inválida
                        System.out.println("Quantidade inválida");//Tinha um ; no if da quantidade, corrigido
                    }
                    }while (p1.getQuantidade()<=0); // Laço while para forçar o usuário a digitar somente valores corretos(qtde >0, nulos ou negativos)
                    do{
                        System.out.println("Digite o valor unitário:");
                        p1.setValorUnitario(ler.nextDouble());
                        if(p1.getValorUnitario()<=0){
                            System.out.println("Valor Inválido");
                        }
                    }while(p1.getValorUnitario()<=0);
                    l1.adicionarProduto(p1);
                    System.out.println("Cadastrado com sucesso!");
                    break; // Final do cadastro de produto
                    
                    /* do executa um bloco de código uma vez e então realiza um teste em conjunto com while
                     e determina se o bloco deverá ser executado novamente.*/
             
                case 2: // Caso digite 2 vamos visualizar os produtos da lista
                    if(l1.getLista().isEmpty()){ //Método Empty, verifica se a lista está vazia e retorna um boolean(V ou F)
                    System.out.println("Não há produtos"); // Retorna se estiver vazia
                }else{
                    System.out.println(l1);// Mostra a a lista de produtos
                }break;
            
             case 3: // Caso digite 3 vamos visualizar a quantidade de produtos da lista
                    System.out.println("Total de cadastros: " + l1.obterQuantidadeDeProdutos());
                break; // Note que neste case 3 apenas é mostrado a quantidade de produtos na tela
            
             case 4://Caso digite 4 exclusão dos produtos da lista
                 if(l1.getLista().isEmpty()){
                     System.out.println("Não há produtos para excluir"); // Se não houver produtos na lista exibe essa mensagem
                 }else{
                     int confirma; // Variavel confirma
                     System.out.println("Tem certeza que deseja EXCLUIR TODOS OS ITENS da lista? \n1-SIM\n2-NAO"); //Escolhendo
                     confirma = ler.nextInt();
                     if (confirma == 1){
                         l1.apagarTudo();
                         System.out.println("Produtos excluidos com sucesso");
                     }else{
                         System.out.println("Opção cancelada");
                     }
                 }
                 break;// Neste case 4 vamos primeiro verificar se a lista não está vazia, caso esteja, retorna que não há produtos para excluir
                       /* A criação da variavel confirma que recebera 1 confirmando a exclusão de todos os dados é muito importante pois
                        estamos solicitando para o usuário uma confirmação na tela, assim protegendo de exclusões acidentais */
             
             case 5: // Caso digite 5 calcula o valor total da lista
                    System.out.println("Total da lista R$ " + l1.calcularTotalDaLista());
                 break;  /* Neste case 5 apenas mostramos o total em valor de compras, portanto basta invocar o método calcularTotalDaLista   
                         presente na classe ListaDeCompras */   
             
             case 0: // Caso digite 0 o programa é encerrado
                    System.out.println("Sistema encerrado");
                 break;
             default: // default executa esse bloco caso nenhum dos testes de switch-case seja verdadeiro
                 System.out.println("Opção Inválida");
            }
            
        }while(op!=0); // Fim Switch case
        
    }
    
}
