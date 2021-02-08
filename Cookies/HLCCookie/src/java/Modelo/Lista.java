/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author diurno
 */
public class Lista extends ArrayList<Persona>{
    
    public Lista(){
        //this.add(new Persona("Pedro","123456789"));
        this.add(new Persona("Juan","1234"));
        this.add(new Persona("Maria","34567"));
        this.add(new Persona("Tomas","384753"));
        this.add(new Persona("Luisa","9355857"));
    }
}
