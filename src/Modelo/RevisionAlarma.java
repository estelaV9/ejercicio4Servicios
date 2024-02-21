package Modelo;

import java.time.LocalDate;

public class RevisionAlarma extends Servicios{

    int numAlarmas;

    public RevisionAlarma( String Cliente, int numAlarmas) {
        super(Cliente);
        this.numAlarmas = numAlarmas;
        this.trabajador = "Revisor Especialista Contraincendios";
    }


    public double costeMateria(){
        return 0;

    }

    public double costeManoObra(){
        return(this.numAlarmas/3)*40;
    }

    public double costeTotal(){
        return(this.numAlarmas/3)*40;
    }

    public String detalleServicio(){
        String cadena = "";

        cadena += "REVISION PERIODICA ALARMAS CONTRAINCENDIOS\n";
        cadena += "Cliente: "+Cliente+"\n";
        cadena += "Fecha de Inicio: "+FechaInicio+"\n";
        cadena += "------------------\n";
        cadena += "TOTAL: "+costeTotal()+"\n";
        cadena += "------------------\n";
        return cadena;
    }




}
