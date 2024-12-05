/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada4;

/**
 *
 * @author krist
 */
public class Corredor {
    //Atributos
    private String nombreCorredor;
    private int edadCorredor;
    private int numeroCorredor;
    private int tiempoEstimado;
    
    //Constructor con parametros
    public Corredor(String nombreCorredor, int edadCorredor, int numeroCorredor, int tiempoEstimado) {
        this.nombreCorredor = nombreCorredor;
        this.edadCorredor = edadCorredor;
        this.numeroCorredor = numeroCorredor;
        this.tiempoEstimado = tiempoEstimado;
    }
    
    //Constructor sin paramteros
    public Corredor() {
    }
    
    //Get y set 
    public String getNombreCorredor() {
        return nombreCorredor;
    }

    public void setNombreCorredor(String nombreCorredor) {
        this.nombreCorredor = nombreCorredor;
    }

    public int getEdadCorredor() {
        return edadCorredor;
    }

    public void setEdadCorredor(int edadCorredor) {
        this.edadCorredor = edadCorredor;
    }

    public int getNumeroCorredor() {
        return numeroCorredor;
    }

    public void setNumeroCorredor(int numeroCorredor) {
        this.numeroCorredor = numeroCorredor;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
    
    //Metodos
    //Hacer if para las categorias
    public void categoriaCorredor(){
        if (edadCorredor < 18){
            System.out.println("Juvenil");  
        }
        else if (edadCorredor >= 40){//entre 18 y 40 
            System.out.println("Adulto");  
        }
        else{
            System.out.println("Master");
            
        }
    }
   
    //tiempo real
    
    //to string 
    @Override
    public String toString() {
        return "Corredor{" + "nombreCorredor=" + nombreCorredor + ", edadCorredor=" + edadCorredor + ", numeroCorredor=" + numeroCorredor + ", tiempoEstimado=" + tiempoEstimado + '}';
    }
    

    
}

