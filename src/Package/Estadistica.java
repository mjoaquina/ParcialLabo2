package Package;

public class Estadistica {
    private int anio;
    private float recaudacion;

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setRecaudacion(float recaudacion) {
        this.recaudacion = recaudacion;
    }

    public void mostrar() {
        System.out.println("------------------------------");
        System.out.println("Anio " + this.anio + " recaudacion " + this.recaudacion + "\n");
    }
}
