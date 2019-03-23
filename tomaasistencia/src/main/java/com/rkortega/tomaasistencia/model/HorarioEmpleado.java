package com.rkortega.tomaasistencia.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * 
 * Clase que representa la tabla HorarioEmpleado
 * 
 * @author RKOrtega
 *
 */
@Data
@Entity
@Table(name = "HorarioEmpleado")
public class HorarioEmpleado {
	/**
	 * Definicion de la tabla
	 */
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String idHorarioEmpleado;
	@Temporal(TemporalType.TIMESTAMP)
	private Date registroHorario;
	@Temporal(TemporalType.TIMESTAMP)
	private Date modificacionHorario;
	private Character estadoHorario;
	@ManyToOne
	@JoinColumn(name = "idEmpleado")
	private Empleado empleado;
	@ManyToOne
	@JoinColumn(name = "idHorario")
	private Horario horario;
	/**
	 * Constructor
	 */
	public HorarioEmpleado() {
	}
}
