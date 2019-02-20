
package Logica;

public class Toad extends Personaje{
    
    @Override
    public void setApariencia(String apariencia){
        
        this.apariencia="https://raw.githubusercontent.com/DanielRoa20171020077/Mario/master/src/java/Imagenes/Toad"+apariencia+".png";
        
    }
    
    @Override
    public void setDescripcion(){
        
        this.descripcion="Subdito del reino champiñon con cabeza en forma de hongo muy veloz y con pies cortos";
        
    }
    
    @Override
    public void setSalto(){
        
        this.salto=3;
        
    }
    
    @Override
    public void setVelocidad(){
        
        this.velocidad=8;
        
    }
    
}
