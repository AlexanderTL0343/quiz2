/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qiuz2;

import javax.swing.JOptionPane;

/**
 *
 * @author alext
 */
public class Qiuz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        
        data data = new data();
        String cantidad1 = JOptionPane.showInputDialog("Indique la cantidad de datos que desea digitar:");
        int u = Integer.parseInt(cantidad1);
        for (int i = 1; i < u; i++) {
            String cantidadDeFeligreses = JOptionPane.showInputDialog("Indique la cantidad de feligreses:");
            int h = Integer.parseInt(cantidadDeFeligreses);
            String nombreIglesia = JOptionPane.showInputDialog("Indique el nombre de padre:");
            String nombrePastor = JOptionPane.showInputDialog("Indique el nombre de la iglesia:");
            JOptionPane.showMessageDialog(null, "" + nombreIglesia + "");
            JOptionPane.showMessageDialog(null, "" + h + "");
            JOptionPane.showMessageDialog(null, "" + nombrePastor + "");
            data.setCantidadDeFeligrases(h);
            data.setNombreIglesia(nombreIglesia);
            data.setNombrePastor(nombrePastor);
        
        
    }
        //pide cedulas
        impuestos arrFeligreses_9[ ] = new impuestos[10];
        for(int x=0; x<arrFeligreses_9.length; x++){
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos del feligres "+x);
            int cedula = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la cedula:"));
            String nombre = JOptionPane.showInputDialog(null,"Escriba el nombre:");
            int diesmo=Integer.parseInt(JOptionPane.showInputDialog(null,"indique el diezmo pagado:"));
            arrFeligreses_9[x]=new impuestos(cedula, nombre, diesmo);
        }
        data.setArrFeligreses_9(arrFeligreses_9);
    
}
}
