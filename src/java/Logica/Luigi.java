
package Logica;

public class Luigi extends Personaje{
    
    @Override
    public void setApariencia(String apariencia){
        
        this.apariencia="https://raw.githubusercontent.com/DanielRoa20171020077/Mario/master/src/java/Imagenes/Luigi"+apariencia+".png";
        
    }
    
    @Override
    public void setDescripcion(){
        
        this.descripcion="Fontanero vestido de traje verde y mas alto que su hermano de Mario";
        
    }
    
    @Override
    public void setSalto(){
        
        this.salto=7;
        
    }
    
    @Override
    public void setVelocidad(){
        
        this.velocidad=4;
        
    }
    
}
