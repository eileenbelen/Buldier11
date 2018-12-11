    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emsamablajecomputadoras.creacional;

/**
 *
 * @author Durango
 */
public abstract class ComputadorBuilder {
    protected Computador c;
    
    
    public Computador getComputador() {
        return c;
    }
    
    
    
    

    public abstract int getRam();

    public abstract void setRam(int ram);

    public abstract SistemaOperativo getOs();

    public abstract void setOs(SistemaOperativo os);
    public abstract int getAlmacenamiento();
    public abstract void setAlmacenamiento(int almacenamiento);
    public abstract Mainboard getPlaca();
    public abstract void setPlaca(Mainboard placa);

    public abstract String getMarca();

    public abstract void setMarca(String marca);

    public abstract String getModelo();

    public abstract void setModelo(String modelo);

    public abstract boolean isCoolerExterno();

    public abstract void setCoolerExterno(boolean coolerExterno);
    
    

      
    
    
    
    
    
    
}
