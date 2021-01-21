package Entidades;

import java.util.Date;

/**
 *
 * @author juliocanizalez
 */
public class ConsumoMedicamento extends Medicamento{
    protected Date fechaDeConsumo;

    public Date getFechaDeConsumo() {
        return fechaDeConsumo;
    }

    public void setFechaDeConsumo(Date fechaDeConsumo) {
        this.fechaDeConsumo = fechaDeConsumo;
    }
    
}
