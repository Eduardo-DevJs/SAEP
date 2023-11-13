
package com.mycompany.saep.models;


public class TurmaModel {
    private int id_turma;
    private String nome;

    public TurmaModel() {
    }

    public TurmaModel(int id_turma, String nome) {
        this.id_turma = id_turma;
        this.nome = nome;
    }

    public int getId_turma() {
        return id_turma;
    }

    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
