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
 * Clase que representa la tabla de Asistencia
 * 
 * @author RKOrtega
 *
 */
@Data
@Entity
@Table(name = "Asistencia")
public class Asistencia {
	/**
	 * Definicion de la tabla
	 */
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String idAsistencia;
	@Temporal(TemporalType.TIMESTAMP)
	private Date registroAsistencia;
	@Temporal(TemporalType.TIMESTAMP)
	private Date modificacionAsistencia;
	private Character estadoAsistencia;
	@ManyToOne
	@JoinColumn(name = "idEmpleado")
	private Empleado empleado;
	/**
	 * Constructor
	 */
	public Asistencia() {
	}
}
