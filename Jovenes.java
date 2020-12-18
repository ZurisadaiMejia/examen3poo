package com.company;

public class Jovenes extends Zapato{
    public Jovenes (String marca, double precio, String col, String estilo, int cantidad){
        setMarca(marca);
        setPrecio(precio);
        setColor(color);
        setEstilo(estilo);
        setCantidad(cantidad);

    }

    @Override
    public double resultado() { return getPrecio() * getCantidad(); }
}

//*Examen III Parcial POO - Zurisadai Mejia 202010060473*//