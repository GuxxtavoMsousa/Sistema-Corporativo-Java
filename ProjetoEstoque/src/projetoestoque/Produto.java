/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoestoque;

import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class Produto {

   String nome;
   String quantidade;
   String preço_custo;
   String preço_venda;
  
   
   void cadastrarProduto(){
       nome = JOptionPane.showInputDialog("Digite nome do Produto");
       quantidade  = JOptionPane.showInputDialog("Digite a quantide");
       preço_custo = JOptionPane.showInputDialog("Digite o preço de custo");
       preço_venda = JOptionPane.showInputDialog("Digite o preço de venda");
   }
   
   void exibirProduto(){
       JOptionPane.showMessageDialog(null,"=========================\n"+
                                                      "Dados do Produto\n"+
                                                      "Nome: "+nome+"\n"+
                                                      "Quantidade: "+quantidade+"\n"+
                                                      "Preço Custo: "+preço_custo+"\n"+
                                                      "Preço Venda: "+preço_venda+"\n"+
                                                      "================================");
   }
    
}
