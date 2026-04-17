/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ED;

/**
 *
 * @author willh
 */
public class Cotizacion {
   
    
    private String actividad;
    private String material;
    private String unidad;
    private float cantidad;
    private float valor_unidad;

    public Cotizacion(String actividad, String material, String unidad, float cantidad, float valor_unidad) {
        this.actividad = actividad;
        this.material = material;
        this.unidad = unidad;
        this.cantidad = cantidad;
        this.valor_unidad = valor_unidad;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getValor_unidad() {
        return valor_unidad;
    }

    public void setValor_unidad(float valor_unidad) {
        this.valor_unidad = valor_unidad;
    }

    @Override
    public String toString() {
        return "Cotizacion{" + "actividad=" + actividad + ", material=" + material + ", unidad=" + unidad + ", cantidad=" + cantidad + ", valor_unidad=" + valor_unidad + '}';
    }
    
    
    
}
