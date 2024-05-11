package gimasio;

import java.util.Date;

public class Clase {
	private String titulo;
	private String descripcion;
	private int duracionMinutos;
	private int capacidadMaxima;
	private Date horarioRealizacion;
	private Instructor instructor;

	public Clase() {
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public Date getHorarioRealizacion() {
		return horarioRealizacion;
	}

	public void setHorarioRealizacion(Date horarioRealizacion) {
		this.horarioRealizacion = horarioRealizacion;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

}
