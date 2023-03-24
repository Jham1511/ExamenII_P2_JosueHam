/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_p2_josueham;

import java.util.ArrayList;

/**
 *
 * @author skxka
 */
public class Deporte {
    private ArrayList<Torneo> listaTorneos = new ArrayList<>();
    private String nombre, periodo;

    public Deporte(String nombre, String periodo) {
        this.nombre = nombre;
        this.periodo = periodo;
    }

    public Deporte() {
    }

    public ArrayList<Torneo> getListaTorneos() {
        return listaTorneos;
    }

    public void setListaTorneos(ArrayList<Torneo> listaTorneos) {
        this.listaTorneos = listaTorneos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
}
