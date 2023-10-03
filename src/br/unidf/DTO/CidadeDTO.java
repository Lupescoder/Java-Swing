/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.DTO;

import java.time.LocalDate;

/**
 *
 * @author profe
 */
public class CidadeDTO
{
    private long cidID;
    private String cidNome;
    private String cidCep;

    public long getCidID() {
        return cidID;
    }

    public void setCidID(long cidID) {
        this.cidID = cidID;
    }

    public String getCidNome() {
        return cidNome;
    }

    public void setCidNome(String cidNome) {
        this.cidNome = cidNome;
    }

    public String getCidCep() {
        return cidCep;
    }

    public void setCidCep(String cidCep) {
        this.cidCep = cidCep;
    }

    public void setCliNome(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
