package com.mycompany.principal;

import com.mycompany.entidades.Producto;
import com.mycompany.session.ProductoJpaController;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("practicabdd");
        ProductoJpaController pjc = new ProductoJpaController(emf);
        Producto p = new Producto();
        p.setCodigo(1);
        p.setNombre("Software CMS");
        Double dl = 5000.99;
        BigDecimal bd1 = BigDecimal.valueOf(dl.doubleValue());
        p.setPrecio(bd1);
        p.setDetalle("Gestion productos");
        
        try {
            pjc.create(p);
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.ALL.SEVERE, null, ex);
        }

    }
    
}
