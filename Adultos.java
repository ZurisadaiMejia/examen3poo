package com.company;

public class Adultos extends Zapato{
    public Adultos (String marca, double precio, String color, String estilo, int cantidad){
        setMarca(marca);
        setPrecio(precio);
        setColor(color);
        setEstilo(estilo);
        setCantidad(cantidad);
    }

    @Override
    public double resultado() { return getPrecio() * getCantidad(); }
}
//* Examen III - Zurisadai Mejia*//