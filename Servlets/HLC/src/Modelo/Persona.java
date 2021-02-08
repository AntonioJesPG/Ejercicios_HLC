/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author diurno
 */
public class Persona implements Serializable{
    
    String id;
    String nombre;
    String apellido;
    String fechaNac;
    String carrera;
    String semestre;
    String email;
    
    public Persona(String id, String nombre, String apellido, String fechaNac, String carrera, String semestre, String email){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.carrera = carrera;
        this.semestre = semestre;
        this.email = email;
    }
    
    public String getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
}
