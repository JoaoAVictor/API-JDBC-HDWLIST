/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.processador.Processador;
import org.springframework.jdbc.core.JdbcTemplate;
import com.mycompany.airvision.Cpu;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

/**
 *
 * @author jsantos
 */
public class CpuLeitor {
    
    private Looca looca;
    private Processador cpu;

    public CpuLeitor() {
        this.looca = new Looca();
        this.cpu = looca.getProcessador();
    }

    public Double porcentagemUso(){
        return cpu.getUso();
    }

    public Processador info(){
        return cpu;
    }
    
   public void insertCpu(){
        Connection config = new Connection();
        JdbcTemplate template = new JdbcTemplate(config.getDataSource());
        
        template.update("INSERT INTO cpu VALUES (null, ?,?);",
                cpu.getNome(),
                porcentagemUso()
        );       
    }
    
   public List<Cpu> selectCpu(){
       
        Connection config = new Connection();
        JdbcTemplate template = new JdbcTemplate(config.getDataSource());
        String select = "select * from Cpu";

        return template.query(select,new BeanPropertyRowMapper(Cpu.class));
   }
    
}
