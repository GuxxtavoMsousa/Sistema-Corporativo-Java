/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoestoque;

/**
 *
 * @author Gustavo
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class ExibirProduto {
    
    public static void main (String args[])
        {

	   Produto produto= new Produto();

	   produto.exibirProduto();

	   String url = "jdbc:mysql://localhost/estoquep";
	   String sql = "SELECT * FROM produto(nome,quantidade,preço_custo,preço_venda)";

	   try 
	   {

	     Connection conexao = DriverManager.getConnection(url, "root","");

	     PreparedStatement inserir = conexao.prepareStatement(sql);

	     inserir.executeUpdate();

	     JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!");
    
	   }
	  
	   catch(Exception erro) { 
           
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);
               
           }

        }
    
}
