package Builder;

import emsamablajecomputadoras.creacional.Computador;

public class ComputadorDirector {
	private ComputadorBuilder builder ;
	
	public ComputadorDirector(ComputadorBuilder c) {
		builder = c;
		
		
	}
	
	
	public void ConstruirComputadora() {
		builder.setModelo();
		builder.setAlmacenamiento();
		builder.setCoolerExterno();
		builder.setMarca();
		builder.setOs();
		builder.setPlaca();
		builder.setRam();
	}
	
	public Computador getComputador() {
		return builder.getComputador();
	}
}
