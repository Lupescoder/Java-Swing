/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.Testes;

import br.unidf.DAL.CidadeDAL;
import br.unidf.DTO.CidadeDTO;

/**
 *
 * @author 
 */
public class TesteIncluir {
    public static void main(String[] args) throws Exception
    {
        CidadeDTO cidade = new CidadeDTO();
        cidade.setCidNome("Brasília");
        cidade.setCidCep("70661063");
        CidadeDAL dal = new CidadeDAL();
        dal.incluirCidade(cidade);
        System.out.print("Cidade " + cidade.getCidNome() + " com CEP: " + cidade.getCidCep() + " Cadastrado com sucesso!");
    }    
}