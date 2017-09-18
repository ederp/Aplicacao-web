/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compra_venda;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author AnaPaula
 */

@ManagedBean
@SessionScoped
public class InsereTransacaoBean {
/*classe que recebe a entrada do usuário na página e armazena a transação 
    de compra ou venda no banco de dados
*/    
    private String tipo_merc;
    private String nome_merc;
    private int qtde;
    private double preco;
    private String tipo_negocio;

    public String getTipo_merc() {
        return tipo_merc;
    }

    public String getNome_merc() {
        return nome_merc;
    }

    public int getQtde() {
        return qtde;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo_negocio() {
        return tipo_negocio;
    }

    public void setTipo_merc(String tipo_merc) {
        this.tipo_merc = tipo_merc;
    }

    public void setNome_merc(String nome_merc) {
        this.nome_merc = nome_merc;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTipo_negocio(String tipo_negocio) {
        this.tipo_negocio = tipo_negocio;
    }
    
    
    public String gravaTransacao() {
        //chama o método de persistência ao banco
        EntityManagerFactory factory =
         Persistence.createEntityManagerFactory("mercadorias");
        
        EntityManager manager = factory.createEntityManager();
        
        MercadoriasRepository repositorio = new MercadoriasRepository(manager);
        
        Mercadoria novaMercadoria = new Mercadoria();
        
        novaMercadoria.setNome_merc(nome_merc);
        novaMercadoria.setPreco(preco);
        novaMercadoria.setQtde(qtde);
        novaMercadoria.setTipo_merc(tipo_merc);
        novaMercadoria.setTipo_negocio(tipo_negocio);
         
        repositorio.adiciona(novaMercadoria);
        
        manager.getTransaction().begin();
        manager.getTransaction().commit();

        manager.close();
        factory.close();
        
        return "Resposta";
    }
      
    
}
