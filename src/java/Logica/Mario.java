
package Logica;

public class Mario extends Personaje{
   
    @Override
    public void setApariencia(String apariencia){
        
        this.apariencia="https://raw.githubusercontent.com/DanielRoa20171020077/Mario/master/src/java/Imagenes/Mario"+apariencia+".png";
        
    }
    
    @Override
    public void setDescripcion(){
        
        this.descripcion="Fontanero vestido de traje rojo y azul que busca rescatar a la princesa Peach";
        
    }
    
    @Override
    public void setSalto(){
        
        this.salto=5;
        
    }
    
    @Override
    public void setVelocidad(){
        
        this.velocidad=5;
        
    }
    
}
