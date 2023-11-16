/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qiuz2;

/**
 *
 * @author alext
 */
public class impuestos {
    private int cedula;
    private String nombre;
    private double diesmo;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDiesmo() {
        return diesmo;
    }

    public void setDiesmo(double diesmo) {
        this.diesmo = diesmo;
    }

    public impuestos(int cedula, String nombre, double diesmo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.diesmo = diesmo;
    }
    public String toString() {
        return "datos{" + "cedula=" + cedula + ", nombre=" + nombre + ", diesmo=" + diesmo + '}';
    }


    
    
    
}
