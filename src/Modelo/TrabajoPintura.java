package Modelo;

import java.time.LocalDate;

public class TrabajoPintura extends Servicios{
    double Superficie;
    double PrecioPintura;

    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        Superficie = superficie;
        PrecioPintura = precioPintura;
    }

    public double costeMateria(){
            return(this.Superficie/7.8)*this.PrecioPintura;

    }

    public double costeManoObra(){
        return(this.Superficie/10)*9.5;
    }

    public double costeTotal(){
        if(this.Superficie < 50){
            return costeMateria()+costeManoObra()+0.15;
        }else{
            return costeMateria()+costeManoObra();
        }
    }

    public String detalleServicio(){
        String cadena = "";

        cadena += "TRABAJO DE PINTURA\n";
        cadena += "Cliente: "+trabajador+"\n";
        cadena += "Fecha de Inicio: "+FechaInicio+"\n";
        cadena += "------------------\n";
        cadena += "Pintor: "+trabajador+"\n";
        cadena += "Coste Material: "+costeMateria()+"\n";
        cadena += "Coste Mano Obra: "+costeManoObra()+"\n";
        cadena += "Coste Adicional: "+costeTotal()+"\n";
        cadena += "TOTAL: "+costeTotal()+"\n";
        cadena += "------------------\n";
        return cadena;
    }




}
