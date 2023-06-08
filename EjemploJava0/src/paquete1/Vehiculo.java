/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA I
 */
public class Vehiculo {
    private String tipo;
    private String matricula;
    private double valor;

    public Vehiculo(String ti, String matri, double val) {
        tipo = ti;
        matricula = matri;
        valor = val;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public void establecerMatricula(String n) {
        matricula = n;
    }

    public void establecertValor(double n) {
        valor = n;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMatricula() {
        return matricula;
    }

    public double obtenerValor() {
        return valor;
    }
  
}
