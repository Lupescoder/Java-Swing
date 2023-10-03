/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.Testes;

import br.unidf.DAL.CidadeDAL;

/**
 *
 * @author profe
 */
public class TesteExcluirCidade {
    public static void main(String[ ] args) throws Exception
    {
        CidadeDAL dal = new CidadeDAL();
        dal.excluirCidade(3);
        System.out.print("Cidade Excluído com sucesso!");
    }
}