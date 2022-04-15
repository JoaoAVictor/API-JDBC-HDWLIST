/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.airvision;

/**
 *
 * @author jsantos
 */
public class Disco {
//atributos
    private Integer idDisco;
    private String nome;
    private String modelo;
    private String leituraEmBytes;
    private String escritasEmBytes;
    private String tamanhoAtualDaFila;
    private String tempoDeTransferencia;

    //getters
    public Integer getIdDisco() {
        return idDisco;
    }

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public String getLeituraEmBytes() {
        return leituraEmBytes;
    }

    public String getEscritasEmBytes() {
        return escritasEmBytes;
    }

    public String getTamanhoAtualDaFila() {
        return tamanhoAtualDaFila;
    }

    public String getTempoDeTransferencia() {
        return tempoDeTransferencia;
    }

    //setters
    public void setIdDisco(Integer idDisco) {
        this.idDisco = idDisco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setLeituraEmBytes(String leituraEmBytes) {
        this.leituraEmBytes = leituraEmBytes;
    }

    public void setEscritasEmBytes(String escritasEmBytes) {
        this.escritasEmBytes = escritasEmBytes;
    }

    public void setTamanhoAtualDaFila(String tamanhoAtualDaFila) {
        this.tamanhoAtualDaFila = tamanhoAtualDaFila;
    }

    public void setTempoDeTransferencia(String tempoDeTransferencia) {
        this.tempoDeTransferencia = tempoDeTransferencia;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "idDisco=" + idDisco +
                ", nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", leituraEmBytes='" + leituraEmBytes + '\'' +
                ", escritaEmBytes='" + escritasEmBytes + '\'' +
                ", tamanhoAtualDaFila='" + tamanhoAtualDaFila + '\'' +
                ", tempoDeTranferencia='" + tempoDeTransferencia + '\'' +
                '}';
    }
    
}
