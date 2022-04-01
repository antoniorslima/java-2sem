/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.banco.ads;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author aluno
 */
public class TesteBanco {
    public static void main(String[] args) {
       Connection config = new Connection();
       JdbcTemplate template = new JdbcTemplate(config.getDataSource());
        List listaPokemon01 = template.queryForList("select * from pokemon");
        System.out.println(listaPokemon01);
    }
}
