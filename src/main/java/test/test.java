
package test;

import com.mycompany.sistemacentralizado2.ProductoJpaController;
import com.mycompany.sistemacentralizado2.Producto;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.math.BigDecimal;

public class test {
    
    public static void main(String[] args){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("practicabdd");
        
        ProductoJpaController pjc = new ProductoJpaController(emf);
        
        Producto p = new Producto();
        
        p.setNombre("Mantequilla");
        Double d1 = 10.35;
        BigDecimal bd1 = BigDecimal.valueOf(d1.doubleValue());
        p.setPrecio(bd1);
        
        try {
            pjc.create(p);
        } catch (Exception ex) {
            Logger.getLogger(test.class.getName()).log(Level.ALL.SEVERE, null, ex);
            
        }
        
    }
    
}
