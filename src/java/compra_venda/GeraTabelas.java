/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compra_venda;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author AnaPaula
 */
public class GeraTabelas {
    //classe usada para criar a tabela de mercadorias através de persistência ao banco
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("mercadorias");
        factory.close();
    }
}
