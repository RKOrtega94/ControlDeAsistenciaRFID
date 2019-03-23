package com.rkortega.tomaasistencia.service;

import com.rkortega.tomaasistencia.model.Empresa;
import com.rkortega.tomaasistencia.repository.EmpresaRepository;

public class EmpresaService {
	private final EmpresaRepository empresaRepository;

	/**
	 * Constructor
	 * 
	 * @param empresaRepository
	 */
	public EmpresaService(EmpresaRepository empresaRepository) {
		this.empresaRepository = empresaRepository;
	}

	/**
	 * Método para registrar la empresa
	 * 
	 * @param empresa
	 * @return
	 */
	public Empresa create(Empresa empresa) {
		return this.empresaRepository.save(empresa);
	}

	/**
	 * Método para modificar la empresa
	 * 
	 * @param empresa
	 * @return
	 */
	public Empresa update(Empresa empresa) {
		return this.empresaRepository.save(empresa);
	}

	/**
	 * Método para eliminar empresa
	 * 
	 * @param empresa
	 */
	public void delete(Empresa empresa) {
		this.empresaRepository.delete(empresa);
	}

	/**
	 * Método para buscar la empresa por el nombre
	 * 
	 * @param nombreEmpresa
	 * @return
	 */
	public Empresa findByNombreEmpresa(String nombreEmpresa) {
		return this.empresaRepository.findByNombreEmpresa(nombreEmpresa);
	}

	/**
	 * Método para buscar la empresa por el RUC
	 * 
	 * @param rucEmpresa
	 * @return
	 */
	public Empresa findByRucEmpresa(String rucEmpresa) {
		return this.empresaRepository.findByRucEmpresa(rucEmpresa);
	}
}
