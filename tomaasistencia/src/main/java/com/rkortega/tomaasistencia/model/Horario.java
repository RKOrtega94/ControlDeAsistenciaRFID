package com.rkortega.tomaasistencia.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * 
 * Clase que representa la tabla Horario
 * 
 * @author RKOrtega
 *
 */
@Data
@Entity
@Table(name = "Horario")
public class Horario {
	/**
	 * Definicion de la clase
	 */
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String idHorario;
	@Temporal(TemporalType.TIME)
	private Date horaIngreso;
	@Temporal(TemporalType.TIME)
	private Date horaSalida;
	@Temporal(TemporalType.TIMESTAMP)
	private Date registroHorario;
	@Temporal(TemporalType.TIMESTAMP)
	private Date modificacionHorario;
	private Character estadoHorario;
	@OneToMany(mappedBy = "horario")
	private Set<HorarioEmpleado> horarios;
	/**
	 * Constructor
	 */
	public Horario() {
	}
}
