package com.mycompany.vehiculo;

public class Main {

    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo();


        Vehiculo v2 = new Vehiculo("A12345");

        Vehiculo v3 = new Vehiculo(
                "B670",
                "Mazda",
                "Kia"
        );

        System.out.println("=== Vehiculo 1 ===");
        v1.mostrarDatos();

        System.out.println("\n=== Vehiculo 2 ===");
        v2.mostrarDatos();

        System.out.println("\n=== Vehiculo 3 ===");
        v3.mostrarDatos();

        System.out.println("\nCosto 1: "
                + v3.calcularMantenimiento(10000));

        System.out.println("Costo 2: "
                + v3.calcularMantenimiento(10000, "basico"));

        System.out.println("Costo 3: "
                + v3.calcularMantenimiento(
                10000,
                "completo",
                true
        ));
    }
}