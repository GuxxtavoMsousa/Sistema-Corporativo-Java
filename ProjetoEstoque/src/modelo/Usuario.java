/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gustavo
 */
public class Usuario {
    private int id;
    private String nome;
    private int telefone;
    private String endereco;
    private String cpf;
    private String senha;

    public Usuario(String nome, int telefone, String endereco,int id, String cpf, String senha) {
        this.id = id;
        this.cpf = cpf;
        this.senha = senha;
         this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Usuario(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
        
    }

    

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
