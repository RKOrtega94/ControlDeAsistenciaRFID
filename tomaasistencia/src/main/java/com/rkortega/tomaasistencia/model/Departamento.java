package com.rkortega.tomaasistencia.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
/**
 * 
 * Clase que representa la tabla Departamento
 * @author RKOrtega
 *
 */
@Data
@Entity
@Table(name = "Departamento")
public class Departamento {
	/**
	 * Definicion de la clase
	 */
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String idDepartamento;
	private String descripcionDepartamento;
	@Temporal(TemporalType.TIMESTAMP)
	private Date registroDepartamento;
	@Temporal(TemporalType.TIMESTAMP)
	private Date modificacionDepartamento;
	private Character estadoDepartamento;
	@ManyToOne
	@JoinColumn(name = "idEmpresa")
	private Empresa empresa;
	@OneToMany(mappedBy = "departamento")
	private Set<Cargo> cargos;
	
	/**
	 * Constructor
	 */
	public Departamento() {}
}
