package com.mycompany.saep.dao;

import com.mycompany.saep.conexao.Conexao;
import com.mycompany.saep.models.TurmaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TurmaDAO {

    public void CadastrarTurma(TurmaModel tm) {
        String sql = "INSERT INTO turmas (nome) VALUES (?)";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionMySQL();
            ps = con.prepareStatement(sql);

            ps.setString(1, tm.getNome());

            ps.execute();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar (DAO) " + e);
        }
    }

    public List<TurmaModel> mostrarTurmas() {
        String sql = "SELECT * FROM turmas";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        ArrayList<TurmaModel> turmas = new ArrayList<TurmaModel>();

        try {
            con = Conexao.createConnectionMySQL();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                TurmaModel tm = new TurmaModel();

                tm.setId_turma(rs.getInt("id_turma"));
                tm.setNome(rs.getString("nome"));

                turmas.add(tm);
            }
        } catch (Exception e) {
            System.out.println("Erro ao mostrar (DAO) " + e);
        }

        return turmas;
    }

    public void AtualizarTurma(TurmaModel turmaModel) {
        String sql = "UPDATE turmas SET nome=? WHERE id_turma=?";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionMySQL();
            ps = con.prepareStatement(sql);

            ps.setString(1, turmaModel.getNome());

            ps.setInt(2, turmaModel.getId_turma());

            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro ao atualizar (DAO) " + e);
        }
    }

    public void ExcluirTurma(int id) {
        String sql = "DELETE FROM turmas WHERE id_turma=?";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = Conexao.createConnectionMySQL();
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.execute();
        } catch (Exception e) {
            System.out.println("Erro ao deletar (DAO) " + e);
        }
    }
}
