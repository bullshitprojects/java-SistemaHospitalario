package Entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author juliocanizalez
 */
public class Paciente extends Persona {

    public ArrayList<Consulta> consulta;
    public ArrayList<ConsumoMedicamento> consumoMed;

    public Paciente() {
    }

    public boolean consumirMed(String nombre, String dosis, Date fecha) {
        try {
            ConsumoMedicamento consumo = new ConsumoMedicamento();
            consumo.setNombre(nombre);
            consumo.setDosis(dosis);
            consumo.setFechaDeConsumo(fecha);
            consumoMed.add(consumo);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
