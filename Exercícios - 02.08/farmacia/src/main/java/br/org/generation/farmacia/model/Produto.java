package br.org.generation.farmacia.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Informe um nome para o produto")
	private String nome;
	
	@NotNull(message = "Informe um fabricante")
	private String fabricante;
	
	private double preco;
	
	@Temporal(TemporalType.TIMESTAMP)		
	private Date date = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne	
	@JsonIgnoreProperties("tb_produtos")
	private Categoria tb_categorias;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Categoria getTb_categorias() {
		return tb_categorias;
	}

	public void setTb_categorias(Categoria tb_categorias) {
		this.tb_categorias = tb_categorias;
	}
	
}
