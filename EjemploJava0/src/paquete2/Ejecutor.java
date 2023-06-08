/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio central");
        edf1.establecerCostos(20000);
        edf1.establecerCostoPredio();

        Edificio edf2 = new Edificio("Edificio norte");
        edf2.establecerCostos(30000);
        edf2.establecerCostoPredio();

        Edificio edf3 = new Edificio("Edificio sur");
        edf3.establecerCostos(10000);
        edf3.establecerCostoPredio();

        Edificio edf4 = new Edificio("Edificio secundario");
        edf4.establecerCostos(5000);
        edf4.establecerCostoPredio();

        Edificio[] listaEdificios = {edf1, edf2, edf3, edf4};
        // double c = listaEdificios[2].obtenerCosto();
        //System.out.println(c);

        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        Empresa miempresa = new Empresa();
        miempresa.establecerNombre("Empresa de Hojas");
        miempresa.establecerEdificios(listaEdificios);
        miempresa.establecerCostosBienesInmuebles();
        miempresa.establecerCostoTotalPagoPredio();

        // Imprimir el costo de los bienes inmuebles de la empresa  
        // System.out.printf("%.2f\n", miempresa.obtenerCostosBienesInmuebles());
        Vehiculo veh1 = new Vehiculo("Auto", "LBB0011", 10000);
        Vehiculo veh2 = new Vehiculo("Camioneta", "LCB0011", 20000);
        Vehiculo veh3 = new Vehiculo("Auto", "LBD0012", 6000);
        Vehiculo veh4 = new Vehiculo("Camioneta", "LCC0011", 10000);

        Vehiculo[] listaVehiculo = {veh1, veh2, veh3, veh4};
        miempresa.establecerVehiculos(listaVehiculo);
        miempresa.establecerCostoVehiculos();

        miempresa.establecerCostosTotalBienes();

        System.out.printf("%s\n", miempresa);
    }
}
