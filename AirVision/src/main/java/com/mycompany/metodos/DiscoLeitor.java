/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.discos.Disco;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;



/**
 *
 * @author jsantos
 */
public class DiscoLeitor {

    private Looca looca;
    private DiscosGroup disco;
    
    public DiscoLeitor() {
        this.looca = new Looca();
        this.disco = looca.getGrupoDeDiscos();
    }

    public List<Disco> listaDiscos(){
        return disco.getDiscos();
    }

    public Integer qtdDiscos(){
        return disco.getQuantidadeDeDiscos();
    }

    public Integer qtdVolume(){
        return disco.getQuantidadeDeVolumes();
    }

    public Long tamanhoTotal(){
       return disco.getTamanhoTotal();
    }

    public Disco getDisco(Integer index){
        return disco.getDiscos().get(index);
    }

    public void insertDiscoLeitor(Integer index){
        
        Disco disco = getDisco(index);
        Connection config = new Connection();
        JdbcTemplate template = new JdbcTemplate(config.getDataSource());
        
        template.update("INSERT INTO disco VALUES (null, ?,?,?,?,?,?);",
                disco.getNome(),
                disco.getModelo(),
                disco.getBytesDeLeitura(),
                disco.getBytesDeEscritas(),
                disco.getTamanhoAtualDaFila(),
                disco.getTempoDeTransferencia()
        );


    }
    
    public List<com.mycompany.airvision.Disco> selectDiscos(){
        
        Connection config = new Connection();
        JdbcTemplate template = new JdbcTemplate(config.getDataSource());
        String select = "select * from Disco";

        return template.query(select,new BeanPropertyRowMapper(com.mycompany.airvision.Disco.class));

    }
}
