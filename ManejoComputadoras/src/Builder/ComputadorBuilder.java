

package Builder;

/**
 *
 * @author Durango
 */
public abstract class ComputadorBuilder {
    protected Computador c;
    
    
    public Computador getComputador() {
        return c;
    }
    
    
 

    

    public abstract void setRam();
     
    public abstract void setOs();
    public abstract void setAlmacenamiento();
    
    public abstract void setPlaca();

    public abstract void setMarca();


    public abstract void setModelo();

    public abstract boolean isCoolerExterno();

    public abstract void setCoolerExterno();
    
    

      
    
    
    
    
    
    
}
