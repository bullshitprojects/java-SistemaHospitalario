package Entidades;

/**
 *
 * @author juliocanizalez
 */
public class Medicamento {
    protected int id;
    protected String nombre;
    protected String presentacion;
    protected String dosis;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
    public Medicamento(){}
    public String medicamentosAleatorios(int i)
    {
        String[] res = new String[3];
        int opcion = (int)(Math.random()*(1-5+1)+5);
        switch(opcion){
            case 1:
                res[0]="OMEPRAZOL";
                res[1]="20 CAPSULAS";
                res[2]="1 CADA 3 HORAS";
                break;
            case 2:
                res[0]="PARACETAMOL";
                res[1]="30 TABLETAS";
                res[2]="2 CADA 6 HORAS";
                break;
            case 3:
                res[0]="LORATADINA";
                res[1]="50 TABLETAS";
                res[2]="1 AL DÍA";
                break;
            case 4:
                res[0]="ASPIRINA";
                res[1]="100 CAPSULAS";
                res[2]="1 AL DÍA";
                break;
            case 5:
                res[0]="COLECALCIFEROL";
                res[1]="20 CAPSULAS";
                res[2]="1 CADA 8 HORAS";
                break;
        }
        return res[i];
    }
}
