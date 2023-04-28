/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;

/**
 *
 * @author João Vitor
 */
public class CarroRoubado extends Observable implements Carro {
    
    private String acao = "";
    
    public void frente() {
        acao = "frente";
        System.out.println("Carro roubado segue em frente");
        this.mudaEstado();
    }
    
    public void direita() {
        acao = "direita";
        System.out.println("Carro roubado vira a direita");
        this.mudaEstado();
    }
    
    public void esquerda() {
        acao = "esquerda";
        System.out.println("Carro roubado vira a esquerda");
        this.mudaEstado();
    }
    
    public void para() {
        acao = "para";
        System.out.println("Carro roubado para");
        this.mudaEstado();
    }
    public void mudaEstado(){
        setChanged(); // Mudou o estado
        notifyObservers(acao); //Notifica os observadores
    }

    void addObserver(CarroPolicia carroPolicia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
