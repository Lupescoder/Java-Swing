/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.DAL;

import br.unidf.DTO.CidadeDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */
public class CidadeDAL extends ConexaoMySQL{
    public void incluirCidade(CidadeDTO cidade) throws Exception
    {
        
        abrirBD();
        SQL = "INSERT INTO cidades (cidNome, cidCep) VALUES (?, ?)";
        ps = con.prepareStatement(SQL);
        ps.setString(1, cidade.getCidNome());
        ps.setString(2,  cidade.getCidCep());
        ps.executeUpdate();
        fecharBD();
    }
    public CidadeDTO selecionarCidadePorID(Integer cidID)throws Exception
    {
        abrirBD();
        SQL = "SELECT * FROM cidades WHERE cidID = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, cidID);
        rs = ps.executeQuery();
        CidadeDTO cidade = new CidadeDTO();
        if(rs.next())
        {
            cidade.setCidID(rs.getInt("cidID"));
            cidade.setCidNome(rs.getString("cidNome"));
            cidade.setCidCep(rs.getString("cidCep"));
            fecharBD();            
        }
        return cidade;
    }
    
    public List selecionarListaCidades() throws Exception
    {
        abrirBD();
        SQL = "SELECT * FROM cidades ORDER BY cidNome";
        ps = con.prepareStatement(SQL);
        rs = ps.executeQuery();
        List listaCidades = new ArrayList();
        while(rs.next())
        {
           CidadeDTO cidade = new CidadeDTO();
           cidade.setCidID(rs.getInt("cidID"));
           cidade.setCidNome(rs.getString("cidNome"));
           cidade.setCidCep(rs.getString("cidCep"));
           listaCidades.add(cidade);         
        }
        fecharBD();
        return listaCidades;
    }
    //Método que vai fazer as alterações necessárias nos dados dos clientes
    //selecionados por seu código no nosso Banco de Dados
    public void alterarCidade(CidadeDTO cidade) throws Exception
    {
        abrirBD();         
        SQL = "UPDATE cidades SET cidNome = ?, cidCep = ? WHERE cidID = ?";
        ps = con.prepareStatement(SQL);        
        ps.setString(1, cidade.getCidNome());
        ps.setString(2, cidade.getCidCep());
        ps.setLong(3, cidade.getCidID());
        ps.execute();
        fecharBD();
    }
    public void excluirCidade(Integer cidID) throws Exception
    {
        abrirBD();
        SQL = "DELETE FROM cidades WHERE cidID = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, cidID);
        ps.execute();
        fecharBD();
    }    
}