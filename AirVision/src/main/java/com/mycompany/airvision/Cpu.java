/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.airvision;

/**
 *
 * @author jsantos
 */
public class Cpu {
    
    private Integer idCpu;
    private String nome;
    private String uso;

    public Integer getIdCpu() {
        return idCpu;
    }

    public String getNome() {
        return nome;
    }

    public String getUso() {
        return uso;
    }

    public void setIdCpu(Integer idCpu) {
        this.idCpu = idCpu;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    @Override
    public String toString() {
        return "Cpu{" + "idCpu=" + idCpu + ", nome=" + nome + ", uso=" + uso + '}';
    }
    
    
    
    
    
}
