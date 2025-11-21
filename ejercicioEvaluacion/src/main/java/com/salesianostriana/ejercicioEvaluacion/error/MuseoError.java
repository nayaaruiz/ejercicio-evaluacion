package com.salesianostriana.ejercicioEvaluacion.error;

public class MuseoError extends RuntimeException {
  public MuseoError(String message) { super(message); }

    public String MuseumNotFoundException(){
      return "El museo no se ha encontrado";
    }

    public void InvalidMuseumDataException(String message){
        super(message);
    }

}
