package Cerveja.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cerveja {
	
	@Column
	@Id
	private Long id;
	
	@Column 
	private String nome;

	@Column
	private String fabricante;

	@Column
	private String tipo;

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
    public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
    public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
