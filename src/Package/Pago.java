package Package;

import Datos.AdminPago;

public class Pago {
    int id;
    float monto; // monto del pago
    int legajo; // legajo del estudiante
    int idCurso; // id del curso al que se le paga (1 - 10)
    ///Fecha fecha; // fecha del pago
    int mes; // Mes periodo de cursada (1 a 12)
    int anio; // Año periodo de cursada
    int idMetodoPago; // 1: Efectivo, 2: Tarjeta de crédito
    boolean esPagoVencido;

    Pago(){
        this.id = 0;
        this.monto = 0;
        this.legajo = 0;
        this.idCurso = 0;
        ///.fecha = ;
        this.mes = 0;
        this.anio = 0;
        this.idMetodoPago = 0;
    }

    Pago(int id, float monto, int legajo, int idCurso, Fecha fecha, int mes, int anio, int idMetodoPago)  {
        this.id = id;
        this.monto = monto;
        this.legajo = legajo;
        this.idCurso = idCurso;
        //this.fecha = fecha;
        this.mes = mes;
        this.anio = anio;
        this.idMetodoPago = idMetodoPago;
    }


    public int getId(){
        return this.id;
    }

    public float getMonto(){
        return this.monto;
    }

    public int getLegajo() {
        return this.legajo;
    }

    public int getIdCurso() {
        return this.idCurso;
    }

//    public Fecha getFecha() {
//        return this.fecha;
//    }

    public int getMes() {
        return this.mes;
    }

    public int getAnio()
    {
        return this.anio;
    }

    public int getIdMetodoPago()
    {
        return this.idMetodoPago;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setMonto(float monto)
    {
        this.monto = monto;
    }

    public void setLegajo(int legajo)
    {
        this.legajo = legajo;
    }

    public void setIdCurso(int idCurso)
    {
        this.idCurso = idCurso;
    }

//    public void setFecha(Fecha fecha)
//    {
//        this.fecha = fecha;
//    }

    public void setMes(int mes)
    {
        this.mes = mes;
    }

    public void setAnio(int anio)
    {
        this.anio = anio;
    }

    public void PsetIdMetodoPago(int idMetodoPago)
    {
        this.idMetodoPago = idMetodoPago;
    }

//    public String toString(){
//        String pago;
//        pago = "Id: " + this.id + " Monto: " + this.monto + " Legajo: " + this.legajo + " IdCurso: " + this.idCurso + " Package.Fecha: " + this.fecha.toString() + " Mes: " + this.mes + " Anio: " + this.anio + " IdMetodoPago: " + this.idMetodoPago;
//        return pago;
//    }
//    public boolean esPagoVencido(int legajo) {
//        AdminPago pagoArch = new AdminPago();
//        Pago pago;
//        boolean estaVencido = false;
//        int cant = pagoArch.getCantidad();
//
//        for (int i = 0; i < cant; i++) {
//            pago = pagoArch.leer(i);
//            if (pago.getLegajo() == legajo) {
//                if (pago.getFecha().getAnio() > pago.getAnio() && pago.getFecha().getMes() > pago.getMes()) {
//                    estaVencido = true;
//                }
//            }
//        }
//        return estaVencido;
//
//    }

}
