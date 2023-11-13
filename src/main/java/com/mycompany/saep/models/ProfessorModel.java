package com.mycompany.saep.models;

public class ProfessorModel {

    private int id_professor;
    private String nome;
    private String email;
    private String senha;

    public ProfessorModel() {
    }

    public ProfessorModel(int id_professor, String nome, String email, String senha) {
        this.id_professor = id_professor;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
