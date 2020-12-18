package com.company;

public abstract class Zapato {
    private String marca;
    private double precio;
    private String color;
    private String estilo;
    private int cantidad;

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }

    public double getPrecio() { return precio; }

    public void setPrecio(double precio) { this.precio = precio; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getEstilo() { return estilo; }

    public void setEstilo(String estilo) { this.estilo = estilo; }

    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public abstract double resultado();

}

//* Examen III Zurisadai Mejia - 2020100060473*//
