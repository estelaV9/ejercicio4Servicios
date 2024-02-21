package Modelo;

public interface IServicio {
    public abstract double costeMateria();

    public abstract double costeManoObra();
    public abstract double costeTotal();
    public abstract String detalleServicio();
}
