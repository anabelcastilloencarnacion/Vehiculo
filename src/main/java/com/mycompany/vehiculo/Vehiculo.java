package com.mycompany.vehiculo;

public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;

    // Constructor por defecto
    public Vehiculo() {
        placa = "Sin placa";
        marca = "Toyota";
        modelo = "corolla";
    }

    // Constructor básico
    public Vehiculo(String placa) {
        this.placa = placa;
        this.marca = "Audi";
        this.modelo = "AudiR8";
    }

    // Constructor completo
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Metodo sobrecargado 1
    public double calcularMantenimiento(int km) {
        return km * 0.10;
    }

    // Metodo sobrecargado 2
    public double calcularMantenimiento(int km, String servicio) {

        if (servicio.equalsIgnoreCase("basico")) {
            return km * 0.10 + 500;
        }

        return km * 0.10 + 1000;
    }

    // Metodo sobrecargado 3
    public double calcularMantenimiento(int km, String servicio, boolean urgente) {

        double costo;

        if (servicio.equalsIgnoreCase("basico")) {
            costo = km * 0.10 + 500;
        } else {
            costo = km * 0.10 + 1000;
        }

        if (urgente) {
            costo += 300;
        }

        return costo;
    }

    public void mostrarDatos() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}