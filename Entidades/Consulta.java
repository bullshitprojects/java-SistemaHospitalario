package Entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author juliocanizalez
 */
public class Consulta {
    protected int id;
    protected Date fechaConsulta;
    protected String causa;
    protected String diagnostico;
    public ArrayList<Medicamento> medicamento;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public Consulta(){}
    public String consultaAleatoria(int i){
        String[] res = new String[2];
        int opcion = (int)(Math.random()*(1-5+1)+5);
        switch(opcion){
            case 1:
                res[0]="MIGRAÑA";
                res[1]="ESTRÉS";
                break;
            case 2:
                res[0]="TINITUS";
                res[1]="INFECCIÓN EN EL OIDO";
                break;
            case 3:
                res[0]="HIPERCOLESTEROLEMIA";
                res[1]="NIVELES ALTOS DE COLESTEROL";
                break;
            case 4:
                res[0]="RINITIS ALERGICO";
                res[1]="EXPOSICIÓN AL POLVO";
                break;
            case 5:
                res[0]="HEPATITIS";
                res[1]="INFLAMACION EN EL HIGADO";
                break;
        }
        return res[i];
    }
    
}
