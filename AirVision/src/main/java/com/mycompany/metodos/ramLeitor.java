/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

import com.github.britooo.looca.api.core.Looca;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import com.mycompany.airvision.Ram;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

/**
 *
 * @author jsantos
 */
public class ramLeitor {
    
    private Looca looca;


    public ramLeitor() {
        this.looca = new Looca();
    }


    public Long total(){
        return looca.getMemoria().getTotal();
    }

    public Long disponivel(){
        return looca.getMemoria().getDisponivel();
    }

    public Long emUso(){
        return looca.getMemoria().getEmUso();
    }
    
    public void insertCpu(){
        
        Connection config = new Connection();
        JdbcTemplate template = new JdbcTemplate(config.getDataSource());
        
        template.update("INSERT INTO ram VALUES (null, ?,?,?);",
                total(),
                disponivel(),
                emUso()
        ); 
    }
    
    public List<Ram> selectRam(){
       Connection config = new Connection();
       JdbcTemplate template = new JdbcTemplate(config.getDataSource());
       
       String select = "Select * from Ram;";
               
       return template.query(select, new BeanPropertyRowMapper(Ram.class));
             
    }
    
}
