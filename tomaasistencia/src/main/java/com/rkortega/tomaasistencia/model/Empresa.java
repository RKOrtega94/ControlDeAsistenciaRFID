package com.rkortega.tomaasistencia.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * 
 * Clase que representa la tabla Empresa
 * 
 * @author RKOrtega
 *
 */
@Data
@Entity
@Table(name = "Empresa")
@NamedQuery(name = "Empresa.findByRucEmpresa", query = "select e from Empresa e where e.rucEmpresa = :rucEmpresa")
public class Empresa {
	/**
	 * Definicion de la clase
	 */
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String idEmpresa;
	private String nombreEmpresa;
	private String rucEmpresa;
	private String direccionEmpresa;
	private String telefonoEmpresa;
	private String correoEmpresa;
	@Temporal(TemporalType.TIMESTAMP)
	private Date registroEmpresa;
	@Temporal(TemporalType.TIMESTAMP)
	private Date modificacionEmpresa;
	@OneToMany(mappedBy = "empresa")
	private Set<Departamento> departamentos;

	/**
	 * Constructor
	 */
	public Empresa() {
	}
}
