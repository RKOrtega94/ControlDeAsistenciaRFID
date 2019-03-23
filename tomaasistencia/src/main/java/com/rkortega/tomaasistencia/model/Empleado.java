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

/**
 * 
 * Clase que representa la tabla Empleado
 * 
 * @author RKOrtega
 *
 */
@Data
@Entity
@Table(name = "Empleado")
public class Empleado {
	/**
	 * Definicion de la clase
	 */
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String idEmpleado;
	private String primerApellidoEmpleado;
	private String segundoApellidoEmpleado;
	private String primerNombreEmpleado;
	private String segundoNombreEmpleado;
	private String identificacionEmpleado;
	private String direccionEmpleado;
	private String telefonoEmpleado;
	private String correoEmpleado;
	@Temporal(TemporalType.DATE)
	private Date nacimientoEmpleado;
	@Temporal(TemporalType.TIMESTAMP)
	private Date registroEmpleado;
	@Temporal(TemporalType.TIMESTAMP)
	private Date modificacionEmpleado;
	private Character estadoEmpleado;
	@ManyToOne
	@JoinColumn(name = "idCargo")
	private Cargo cargo;
	@OneToMany(mappedBy = "empleado")
	private Set<HorarioEmpleado> horarios;
	@OneToMany(mappedBy = "empleado")
	private Set<Asistencia> asistencias;
	/**
	 * Constructor
	 */
	public Empleado() {
	}
}
