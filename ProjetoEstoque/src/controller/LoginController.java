/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Conexao;
import modelo.Usuario;
import modelo.UsuarioDAO;
import projetoestoque.TelaLogin;
import projetoestoque.TelaMenu;
/**
 *
 * @author Gustavo
 */
public class LoginController {
    private final TelaLogin view;

    public LoginController(TelaLogin view) {
        this.view = view;
    }

    public void autenticar() throws SQLException{
        //Buscar um Usuário da view
        String cpf = view.getLogin().getText();
        String senha = view.getSenha().getText();
        
        Usuario usuarioAutenticar = new Usuario(cpf,senha);
        
        //Verificar se existe no banco de dados
        try{
         Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao); 
        
          boolean existe = usuarioDao.existePorCpfESenha(usuarioAutenticar);
          
          //Se existir direciona para o menu
        if(existe){
            JOptionPane.showMessageDialog(null, "Acesso Permitido");
            TelaMenu TM = new TelaMenu();
            TM.setVisible(true);
        } else{
        JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválidos");
   
         }
        
        } catch (Exception erro) {
             JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);
        }
       
    }
    
}
