package com.rkortega.tomaasistencia.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

import com.rkortega.tomaasistencia.model.Empleado;

/**
 * 
 * Clase que representa la tabla Cargo
 * 
 * @author RKOrtega
 *
 */
@Data
@Entity
@Table(name = "Cargo")
public class Cargo {
	/**
	 * Definicion de la clase
	 */
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String idCargo;
	private String descipcionCargo;
	@Temporal(TemporalType.TIMESTAMP)
	private Date registroCargo;
	@Temporal(TemporalType.TIMESTAMP)
	private Date modificacionCargo;
	private Character estadoCargo;
	@ManyToOne
	@JoinColumn(name = "idDepartamento")
	private Departamento departamento;
	@OneToMany(mappedBy = "cargo")
	private Set<Empleado> empleados;

	/**
	 * Constructor
	 */
	public Cargo() {
	}
}
