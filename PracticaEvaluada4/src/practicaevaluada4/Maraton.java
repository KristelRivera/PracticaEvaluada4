/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada4;

/**
 *
 * @author krist
 */
public class Maraton {
    //Atributos
    private int tam;//para que la persona encargada ingrese la cantidad de corredores
    private Corredor[] corredores;
    
    //Constructor
    public Maraton(Corredor[] corredores) {
        this.corredores = new Corredor[tam]; 
    }
    
    //Constructor sin parametros
    public Maraton() {
    }
    
    //set y get
    public Corredor[] getCorredores() {
        return corredores;
    }

    public void setCorredores(Corredor[] corredores) {
        this.corredores = corredores;
    }
    
    //Métodos
//    public String registroParticipantes(){
//        
//    }
    
    //busqueda por # de corredor 
    
    //listar participantes por categoría 
    
    //eliminar participantes 
    
    //generar data inicial
    
    @Override
    public String toString() {
        return "Maraton{" + "corredores=" + corredores + '}';
    }
    
    
}
