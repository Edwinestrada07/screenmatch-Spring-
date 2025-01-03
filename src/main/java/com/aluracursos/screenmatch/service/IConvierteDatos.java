package com.aluracursos.screenmatch.service;

public interface IConvierteDatos {
    //Permite crear tipo de datos genericos, como no se sabe que va a retornar se trabaja como generico
    <T> T obtenerDatos(String json, Class<T> clase);
}
