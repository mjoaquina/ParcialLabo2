package Package;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAnio(){
        return this.anio;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    Fecha(){

       Date date = new Date();
       this.dia = date.getDay();
       this.mes = date.getMonth();
       this.anio = date.getYear();

    }
    public String toString(){
        String fecha;
        fecha = this.dia + "/" + this.mes + "/" + this.anio;
        return fecha;
    }

}
