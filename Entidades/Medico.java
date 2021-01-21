package Entidades;

import java.util.ArrayList;

/**
 *
 * @author juliocanizalez
 */
public class Medico extends Persona {

    public ArrayList<Paciente> paciente;
    public int cantidadRecetada;
    public Medico() {
        cantMedRec = new ArrayList<>();
        cantidadRecetada=0;
    }
    public ArrayList<String> cantMedRec;

    public void agregarMedicamentoRecetado(String nombre) {
        cantMedRec.add(nombre);
    }
}
