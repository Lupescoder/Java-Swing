/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.Testes;

import br.unidf.DAL.CidadeDAL;
import br.unidf.DTO.CidadeDTO;

/**
 *
 * @author profe
 */
public class TesteAlterarCidade {
    public static void main(String[ ] args) throws Exception
    {
        CidadeDAL dal = new CidadeDAL();
        CidadeDTO cidade = new CidadeDTO();
        cidade.setCidID(2);
        cidade.setCidNome("São Paulo");
        cidade.setCidCep("1234567");
        dal.alterarCidade(cidade);
        System.out.print("Cidade " + cidade.getCidNome() + " CEP: " + cidade.getCidCep() + " Alterado com sucesso!");    
    }
}
