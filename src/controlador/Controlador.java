package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.Vistas;


public class Controlador implements ActionListener {

    Vistas obV;
   

   public Controlador() {
        this.obV = new Vistas();
        
       
    }



   public void iniciar() {
        obV.setTitle("inicio");
        obV.setVisible(true);



   }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



   


