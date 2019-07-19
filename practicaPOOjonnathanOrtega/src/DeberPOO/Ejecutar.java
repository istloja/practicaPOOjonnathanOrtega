/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeberPOO;

/**
 *
 * @author jhonny
 */
public class Ejecutar {

    public static void main(String[] args) {
        Deporte objeto1 = new Deporte("hindor", 6, 9, "equipo", true);
        Equipo objeto2 = new Equipo("trabajo en equipo", 39, false, 90, 189, "futbol", 11, 10, "equipo", true);
        Equipo objeto3 = new Equipo("fuerza", 37, true, 3, 178, "futbol americano", 11, 65, "equipo", true);
        Equipo objeto4 = new Equipo("altura", 38, true, 40, 189, "baloncesto", 5, 54, "equipo", true);
        Equipo objeto5 = new Equipo("agilidad", 35, true, 15, 175, "voley", 3, 15, "equipo", true);
        Individual objeto6 = new Individual("golpe", true, 68, 5, "mucha", "golf", 1, 18, "individual", true);
        Individual objeto7 = new Individual("estabilidad", false, 50, 3, "no mucha", "bailar", 1, 90, "individual", true);
        Individual objeto8 = new Individual("habilidad", false, 2, 6, "mucha", "ajedrez", 1, 10, "individual", true);
        Individual objeto9 = new Individual("fuerza", true, 35, 15, "no mucha", "boxeo", 1, 5, "individual", true);
        Individual objeto10 = new Individual("vista", true, 5, 12, "bastante", "tiro con arma", 1, 100, "individual", true);

        System.out.println(objeto1.informacionDeporte());
        System.out.println(objeto2.informacionDeporte());
        System.out.println(objeto3.informacionDeporte());
        System.out.println(objeto4.informacionDeporte());
        System.out.println(objeto5.informacionDeporte());
        System.out.println(objeto6.informacionDeporte());
        System.out.println(objeto7.informacionDeporte());
        System.out.println(objeto8.informacionDeporte());
        System.out.println(objeto9.informacionDeporte());
        System.out.println(objeto10.informacionDeporte());

    }
}