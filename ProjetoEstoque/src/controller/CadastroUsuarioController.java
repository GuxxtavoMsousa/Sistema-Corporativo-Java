/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import projetoestoque.TelaCadastroUsuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Conexao;
import modelo.Usuario;
import modelo.UsuarioDAO;
import projetoestoque.TelaLogin;


/**
 *
 * @author Gustavo
 */
public class CadastroUsuarioController {
    
    private TelaCadastroUsuario view;
   
    public CadastroUsuarioController(TelaCadastroUsuario view) {
        this.view = view;
    }

      public void salvaUsuario(){
        String nome = view.getNome().getText();
        String telefone = view.getTelefone().getText();
        String endereco = view.getEndereco().getText();
        String cpf = view.getLogin().getText();
        String senha = view.getSenha().getText();
        
      
        
         Usuario usuario = new Usuario(cpf,senha);
        
         
        try {

            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            usuarioDao.insert(usuario);
            
            JOptionPane.showMessageDialog(null, "Usuário Salvo com Sucesso");
           
          
        } catch (SQLException ex) {
            
            Logger.getLogger(TelaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
}
