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
public class Politico {
    
    private String nome;
    private String estado;
    public  Partido Partido;

    
    public Politico(){
      Partido  = new Partido();
    
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    
}
