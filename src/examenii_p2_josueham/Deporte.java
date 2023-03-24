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
    private String nombre;

    public Deporte(String nombre) {
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return  nombre;
    }
    
    
}
