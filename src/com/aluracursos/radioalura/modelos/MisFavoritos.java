package com.aluracursos.radioalura.modelos;

public class MisFavoritos {
    public void adicione(Audio audio){
        if (audio.getClasificacion()>=8){
            System.out.println(audio.getTitulo()+" es un de los favoritos");
        }else{
            System.out.println(audio.getTitulo()+" no es un de los favoritos");
        }
    }
}
