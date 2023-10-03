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
public class TesteSelecionarCidadePorID {
    public static void main(String[ ] args) throws Exception
    {
        CidadeDAL dal = new CidadeDAL();
        CidadeDTO cidade = dal.selecionarCidadePorID(2);
        System.out.println("cidID: " + cidade.getCidID());
        System.out.println("Cidade: " + cidade.getCidNome());
        System.out.println("CEP: " + cidade.getCidCep());
    }    
}
