/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.banco.ads;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author aluno
 */
public class TesteBanco {

    public static void main(String[] args) {

        Connection config = new Connection();
        JdbcTemplate template = new JdbcTemplate(config.getDataSource());

        template.execute("drop table if exists pokemon");

        String criacaoTabelaPokemon = "create table pokemon("
                + "id int primary key auto_increment,"
                + "nome varchar(255),"
                + "tipo varchar(255)"
                + ")";

        template.execute(criacaoTabelaPokemon);

        String inserirPokemon = "insert into pokemon values(null,?,?)";

        template.update(inserirPokemon, "pikatchu", "eletrico");
        template.update(inserirPokemon, "charmander", "fogo");

        List<Pokemon> listaPokemon01 = template.query("select * from pokemon",
                new BeanPropertyRowMapper<>(Pokemon.class));
        for (Pokemon itemPokemon : listaPokemon01) {
            System.out.println(itemPokemon);
        }
    }
}
