/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpratonobserver;

import java.util.Observable;

/**
 *
 * @author NS
 */
public class Asignatura extends Observable {

    private String nombre;
    private double corte1;
    private double corte2;
    private double corte3;

    String mensaje;

    public void cambiarMensaje(String m) {
        mensaje = m;
        //Marcamos el objeto observable como objeto que ha cambiado
        setChanged();
        //Notificamos a los observadores y le enviamos el nuevo valor
        // notifyObservers(mensaje);
        notifyObservers(this);
        //notifyObservers(); Este metodo solo notifica que hubo cambios en el objeto
    }

    public Asignatura(double corte1, double corte2, double corte3) {
        this.corte1 = corte1;
        this.corte2 = corte2;
        this.corte3 = corte3;
        mensaje = "Objeto Observado Iniciado";
    }

    public double getCorte1() {
        return corte1;
    }

    public void setCorte1(double corte1) {
        this.corte1 = corte1;
    }

    public double getCorte2() {
        return corte2;
    }

    public void setCorte2(double corte2) {
        this.corte2 = corte2;
    }

    public double getCorte3() {
        return corte3;
    }

    public void setCorte3(double corte3) {
        this.corte3 = corte3;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", corte1=" + corte1 + ", corte2=" + corte2 + ", corte3=" + corte3 + ", mensaje=" + mensaje + '}';
    }

}
