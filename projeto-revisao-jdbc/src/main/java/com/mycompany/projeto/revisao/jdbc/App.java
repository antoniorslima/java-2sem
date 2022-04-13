/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.revisao.jdbc;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author aluno
 */
public class App {

    public static void main(String[] args) {
        Connection connection = new Connection();
        JdbcTemplate template = new JdbcTemplate(connection.getDataSource());
        template.execute("drop table if exists jogo");
        StringBuilder builder = new StringBuilder();
        builder.append("create table jogo(");
        builder.append("id int null primary key auto_increment,");
        builder.append("nome varchar(200),");
        builder.append("genero varchar(200)");
        builder.append(");");
        template.execute(builder.toString());
        template.update("insert into jogo values (null, ?, ?)",
                "Sonic", "plataforma");
        template.update("insert into jogo values (null, ?, ?)",
                "Dark souls", "souls-like");
        template.update("insert into jogo values (null, ?, ?)",
                "FIFA23", "esportes");
        template.update("insert into jogo values (null, ?, ?)",
                "Crash", "plataforme");
//        List jogos = template.queryForList("select * from jogo");
//        for (Object jogo : jogos) {
//            System.out.println(jogo.toString());
//        }
        List<Jogo> jogos = template.query("select * from jogo", new BeanPropertyRowMapper<>(Jogo.class));
        for (Jogo jogo : jogos) {
            System.out.println(jogo.getNome());
        }
    }
}
