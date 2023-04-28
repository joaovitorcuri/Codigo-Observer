/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.observer;

/**
 *
 * @author João Vitor
 */
public class Observer {

    public static void main(String[] args) {
        //Observador
        CarroPolicia carroPolicia = new CarroPolicia();
        
        //Observado
        CarroRoubado carroRoubado = new CarroRoubado();
        
        //Adicionar observador ao observado
        carroRoubado.addObserver(carroPolicia);
        
        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.frente();
        carroRoubado.esquerda();
        carroRoubado.frente();
    }
}
