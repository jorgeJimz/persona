/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;

import newpackage2.Deportista;
import newpackage2.Doctor;

/**
 *
 * @author Usuario
 */
public class Persona {

    public static void main(String[] args) {
        
        Doctor doctor = new Doctor();
        Deportista deportista = new Deportista();
        
        
        System.out.println("PROFECIONES");
        
        doctor.imprimirDatos();
        deportista.imprimirDatos();
        
        
    }
}
