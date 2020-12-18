package com.company;

public class Niño extends Zapato{
    public Niño (String marca, double precio, String col, String estilo, int cantidad){
        setMarca(marca);
        setPrec(precio);
        setColor(color);
        setEstilo(estilo);
        setCantidad(cantidad);
    }

    @Override
    public double resultado() { return getPrecio() * getCantidad(); }
}



