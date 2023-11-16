/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qiuz2;

/**
 *
 * @author alext
 */
public class data {
    private String nombreIglesia;
    private String nombrePastor;
    private int cantidadDeFeligrases;
    impuestos arrFeligreses_9[ ] = new impuestos[10];

    public impuestos[] getArrFeligreses_9() {
        return arrFeligreses_9;
    }

    public void setArrFeligreses_9(impuestos[] arrFeligreses_9) {
        this.arrFeligreses_9 = arrFeligreses_9;
    }
   
    public String getNombreIglesia() {
        return nombreIglesia;
    }

    public void setNombreIglesia(String nombreIglesia) {
        this.nombreIglesia = nombreIglesia;
    }

    public String getNombrePastor() {
        return nombrePastor;
    }

    public void setNombrePastor(String nombrePastor) {
        this.nombrePastor = nombrePastor;
    }

    public int getCantidadDeFeligrases() {
        return cantidadDeFeligrases;
    }

    public void setCantidadDeFeligrases(int cantidadDeFeligrases) {
        this.cantidadDeFeligrases = cantidadDeFeligrases;
    }
    
    
}
