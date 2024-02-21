package Modelo;

import Modelo.IServicio;

import java.time.LocalDate;

public abstract class Servicios implements IServicio {
    protected String trabajador;
    protected LocalDate FechaInicio;
    protected String Cliente;

    public Servicios(String trabajador, LocalDate fechaInicio, String cliente) {
        this.trabajador = trabajador;
        FechaInicio = fechaInicio;
        Cliente = cliente;
    }

    public Servicios(String cliente) {
        Cliente = cliente;
    }

    /*****METODOS*****/
    public abstract double costeMateria();

    public abstract double costeManoObra();
    public abstract double costeTotal();
    public abstract String detalleServicio();
}
