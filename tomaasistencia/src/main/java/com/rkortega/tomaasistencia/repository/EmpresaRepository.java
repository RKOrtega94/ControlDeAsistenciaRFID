/**
 * 
 */
package com.rkortega.tomaasistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rkortega.tomaasistencia.model.Empresa;

/**
 * Clase que define los métodos de la clase Empresa
 * 
 * @author RKOrtega
 *
 */
public interface EmpresaRepository extends JpaRepository<Empresa, String> {
	/**
	 * Método para buscar empresa por el nombre
	 * 
	 * @param nombreEmpresa
	 * @return Empresa
	 */
	public Empresa findByNombreEmpresa(String nombreEmpresa);

	/**
	 * Método para buscar empresa por el RUC
	 * 
	 * @param rucEmpresa
	 * @return
	 */
	public Empresa findByRucEmpresa(String rucEmpresa);
}
