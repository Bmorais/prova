/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package governo;

/**
 *
 * @author Bruno Morais
 */
public class Deputado extends Politico{
    
    public String nome_do_processo;
    public float valor;
    
    public Deputado(){
    
        valor=500000;
    }
        public Deputado(String nome_do_processo){
    
        this.nome_do_processo = nome_do_processo;
        valor=500000;
       
        
    }
    
    
}
