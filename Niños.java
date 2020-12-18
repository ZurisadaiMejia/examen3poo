package com.company;

public class Niños extends Zapato{
    public Niños (String marca, double precio, String color, String estilo, int cantidad){
        setMarca(marca);
        setPrec(precio);
        setColor(color);
        setEstilo(estilo);
        setCantidad(cantidad);
    }

    @Override
    public double resultado() { return getPrecio() * getCantidad(); }
}



