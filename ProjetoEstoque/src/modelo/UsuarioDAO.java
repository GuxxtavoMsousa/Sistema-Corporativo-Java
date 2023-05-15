/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Gustavo
 */
public class UsuarioDAO {
    
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert (Usuario usuario) throws SQLException {
        
	   	   String sql = "INSERT INTO usuario(cpf,senha) values ('"+usuario.getCpf()+"','"+usuario.getSenha()+"')";

	     	   PreparedStatement incluir = connection.prepareStatement(sql);
	     	   incluir.execute();
	   	 }

    
    public boolean existePorCpfESenha(Usuario usuario) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE cpf = '"+usuario.getCpf()+"' and senha = '"+usuario.getSenha()+"'";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
       while (resultSet.next()){
           return true;
       }
       return false;
           
        
    }

}
