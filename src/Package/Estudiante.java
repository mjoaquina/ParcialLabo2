package Package;

public class Estudiante {
    private String apellidos;
    private String nombres;
    private int legajo;
    private Fecha fechaNac;

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setNombres(String nombres){
        this.nombres = nombres;
    }
    public void setLegajo(int legajo){
        this.legajo = legajo;
    }
    public void setFechaNac(Fecha fechaNac){
        this.fechaNac = fechaNac;
    }

}
