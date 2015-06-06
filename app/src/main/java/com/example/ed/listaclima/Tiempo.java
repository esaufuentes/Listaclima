package com.example.ed.listaclima;

/**
 * Created by Ed on 06/06/2015.
 */
public class Tiempo {
    private String dia;
    private String tiempo;
    private String imagen;

    public Tiempo(String imagen, String tiempo, String dia) {
        this.imagen = imagen;
        this.tiempo = tiempo;
        this.dia = dia;


    }
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


}
