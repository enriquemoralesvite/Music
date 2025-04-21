package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("La Bamba");
        miCancion.setCantante("Los Lobos");


        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Carlos");
        miPodcast.setTitulo("El Podcast de Carlos");

        // Cancion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }
        // Podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("La cancion " + miCancion.getTitulo() +
                " de " + miCancion.getCantante() + " tiene " +
                miCancion.getTotalDeReproducciones() + " reproducciones y " +
                miCancion.getTotalDeMeGusta() + " me gusta.");

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miCancion);
        favoritos.adicione(miPodcast);
    }
}
