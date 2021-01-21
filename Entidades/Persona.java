package Entidades;

import java.util.Date;

/**
 *
 * @author juliocanizalez
 */
public class Persona {
    protected int id;
    protected String dui;
    protected String nombre;
    protected String edad;
    protected Date fechaNacimiento;
    public Persona(){}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
       
    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
