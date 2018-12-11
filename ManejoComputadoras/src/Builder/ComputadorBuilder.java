

package Builder;

import emsamablajecomputadoras.creacional.Computador;

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






	public void setRAM() {
		// TODO Auto-generated method stub
		
	}






	public void SistemaOperativo() {
		// TODO Auto-generated method stub
		
	}






	public void setMainboard() {
		// TODO Auto-generated method stub
		
	}






	public void setComputador() {
		// TODO Auto-generated method stub
		
	}
    
    

      
    
    
    
    
    
    
}
