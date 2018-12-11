package Builder;
import emsamablajecomputadoras.creacional.Computador;
import emsamablajecomputadoras.creacional.Mainboard;
import emsamablajecomputadoras.creacional.SistemaOperativo;


public class AsusZenBook extends ComputadorBuilder{
	@Override
	public void setMarca() {
		computador.setMarca("Asus");
	}

	@Override
	public void setModelo() {
		computador.setModelo("ZenBook");
	}

	@Override
	public void setRAM() {
		computador.setRam(16);	
		
	}

	@Override
	public void setAlmacenamiento() {
		computador.setAlmacenamiento(500);
		
	}

	@Override
	public void SistemaOperativo() {
		computador.setOs(new SistemaOperativo("Windows 10", 64, "HOME"));
		
	}

	@Override
	public void setMainboard() {
		computador.setPlaca(new Mainboard("Prime", "Z370"));
		
	}

	@Override
	public void setComputador() {
		computador = new Computador();
		
	}
}
