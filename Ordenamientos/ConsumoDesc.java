package Ordenamientos;

import Entidades.ConsumoMedicamento;
import java.util.Comparator;

/**
 *
 * @author juliocanizalez
 */
public class ConsumoDesc implements Comparator<ConsumoMedicamento> {

    @Override
    public int compare(ConsumoMedicamento o1, ConsumoMedicamento o2) {
        return o2.getFechaDeConsumo().compareTo(o1.getFechaDeConsumo());
    }

}
