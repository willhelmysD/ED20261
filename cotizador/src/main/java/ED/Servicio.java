/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ED;

/**
 *
 * @author willh
 */
public class Servicio {
    
    private float Area;
    private String servicio;
    private float total;

    public Servicio(float Area, String servicio, float total) {
        this.Area = Area;
        this.servicio = servicio;
        this.total = total;
    }

    public Servicio() {
        this.Area = 0f;
        this.servicio = null;
        this.total = 0f;
    }
    
    
    

    public float getArea() {
        return Area;
    }

    public void setArea(float Area) {
        this.Area = Area;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Servicio{" + "Area=" + Area + ", servicio=" + servicio + ", total=" + total + '}';
    }
    
    
    
}
