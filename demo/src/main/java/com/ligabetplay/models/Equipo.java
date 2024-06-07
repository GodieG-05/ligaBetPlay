package com.ligabetplay.models;
import java.util.ArrayList;
public class Equipo {
    String nombre;
    int PJ;
    int PG;
    int PE;
    int PP;
    int GF;
    int GC;
    int TP;
    ArrayList<String> jugadores;
    ArrayList<String> cuerpoTecnico;
    ArrayList<String> cuerpoMedico;

    public Equipo(String nombre){
        this.nombre = nombre;
    }
    public Equipo(String nombre, int PJ, int PG, int PE, int PP, int GF, int GC, int TP) {
        this.nombre = nombre;
        this.PJ = PJ;
        this.PG = PG;
        this.PE = PE;
        this.PP = PP;
        this.GF = GF;
        this.GC = GC;
        this.TP = TP;            
    }
    
    public Equipo(String nombre, ArrayList<String> jugadores, ArrayList<String> cuerpoTecnico, ArrayList<String> cuerpoMedico) {
        this.nombre = nombre;
        this.jugadores = jugadores;
        this.cuerpoTecnico = cuerpoTecnico;
        this.cuerpoMedico = cuerpoMedico;
    }
    
    public ArrayList<String> getJugadores() {
        return jugadores;
    }
    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }
    public ArrayList<String> getCuerpoTecnico() {
        return cuerpoTecnico;
    }
    public void setCuerpoTecnico(ArrayList<String> cuerpoTecnico) {
        this.cuerpoTecnico = cuerpoTecnico;
    }
    public ArrayList<String> getCuerpoMedico() {
        return cuerpoMedico;
    }
    public void setCuerpoMedico(ArrayList<String> cuerpoMedico) {
        this.cuerpoMedico = cuerpoMedico;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPJ() {
        return PJ;
    }
    public int getPG() {
        return PG;
    }
    public int getPE() {
        return PE;
    }
    public int getPP() {
        return PP;
    }
    public int getGF() {
        return GF;
    }
    public int getGC() {
        return GC;
    }
    public int getTP() {
        return TP;
    }
    public String toString() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPJ(int PJ){
        this.PJ = PJ;
    }
    public void setPG(int PG){
        this.PG = PG;
    }
    public void setPE(int PE){
        this.PE = PE;
    }
    public void setPP(int PP){
        this.PP = PP;
    }
    public void setGF(int GF){
        this.GF = GF;
    }
    public void setGC(int GC){
        this.GC = GC;
    }
    public void setTP(int TP){
        this.TP = TP;
    }


}