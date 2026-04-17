/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ED;
/**
 *
 * @author willh
 */
public class Piloto {
    private String nombre;
    private String nacion;
    private byte edad;
    private short carreras;
    private short victorias;
    private short poles;
    private boolean estado;

    public Piloto(String nombre, String nacion, byte edad, short carreras, short victorias, short poles, boolean estado) {
        this.nombre = nombre;
        this.nacion = nacion;
        this.edad = edad;
        this.carreras = carreras;
        this.victorias = victorias;
        this.poles = poles;
        this.estado = estado;
    }

    public Piloto() {
         this.nombre = "";
        this.nacion = "";
        this.edad = 0;
        this.carreras = 0;
        this.victorias = 0;
        this.poles = 0;
        this.estado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacion() {
        return nacion;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public short getCarreras() {
        return carreras;
    }

    public void setCarreras(short carreras) {
        this.carreras = carreras;
    }

    public short getVictorias() {
        return victorias;
    }

    public void setVictorias(short victorias) {
        this.victorias = victorias;
    }

    public short getPoles() {
        return poles;
    }

    public void setPoles(short poles) {
        this.poles = poles;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Piloto{" + "nombre=" + nombre + ", nacion=" + nacion + ", edad=" + edad + ", carreras=" + carreras + ", victorias=" + victorias + ", poles=" + poles + ", estado=" + estado + '}';
    }
    
    
    
    
    
}
