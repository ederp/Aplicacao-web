/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compra_venda;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author AnaPaula
 */


//Bean para apresentar a consulta das transações na página
@ManagedBean
@SessionScoped
public class ConsultaTransacaoBean {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("mercadorias");
    EntityManager manager = factory.createEntityManager();
    
    MercadoriasRepository repositorio = new MercadoriasRepository(manager);
    
    private List<Mercadoria> mercadorias = repositorio.buscaTodas();

    public List<Mercadoria> getMercadorias() {
        return mercadorias;
    }

    public void setMercadorias(List<Mercadoria> mercadorias) {
        this.mercadorias = mercadorias;
    }
    
        /*
    private Mercadoria mercadoria = getMercadorias().iterator().next();
    
    public Mercadoria getMercadoria() {
        return mercadoria;
    }
    */
}
