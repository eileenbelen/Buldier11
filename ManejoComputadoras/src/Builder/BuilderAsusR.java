package Builder;

import emsamablajecomputadoras.creacional.*;

public class BuilderAsusR extends ComputadorBuilder{
	
	Computador computador;
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

	@Override
	public void setRam() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlaca() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isCoolerExterno() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCoolerExterno() {
		// TODO Auto-generated method stub
		
	}
	
}
