package org.cibertec.edu.pe.interfaceService;

import java.util.List;
import java.util.Optional;


import org.cibertec.edu.pe.modelo.Producto;

public interface IProductoService {
	public List<Producto> Listado();
	public Optional<Producto> Buscar(int id);
	public void Insertar(Producto p);
	public void Modificar (Producto p);
	public void Suprimir(int id);

}
