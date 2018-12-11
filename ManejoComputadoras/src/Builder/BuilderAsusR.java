package Builder;
import emsamablajecomputadoras.creacional.Computador;
import emsamablajecomputadoras.creacional.Mainboard;
import emsamablajecomputadoras.creacional.SistemaOperativo;

public class BuilderAsusR extends ComputadorBuilder{
	@Override
	public void setMarca() {
		computador.setMarca("Asus");
	}

	@Override
	public void setModelo() {
		computador.setModelo("ROG");
	}

	@Override
	public void setRAM() {
		computador.setRam(32);	
		
	}

	@Override
	public void setAlmacenamiento() {
		computador.setAlmacenamiento(1000);
		
	}

	@Override
	public void SistemaOperativo() {
		computador.setOs(new SistemaOperativo("Windows 10", 64, "PRO"));
		
	}

	@Override
	public void setMainboard() {
		computador.setPlaca(new Mainboard("Strix", "x99"));
		
	}

	@Override
	public void setComputador() {
		computador = new Computador();
		
	}
	
}
