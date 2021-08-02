package br.org.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categorias")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Informe a categoria")
	private String categoria;
	
	@OneToMany(mappedBy = "tb_categorias", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("tb_categorias")
	private List<Produto> tb_produtos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Produto> getTb_produtos() {
		return tb_produtos;
	}

	public void setTb_produtos(List<Produto> tb_produtos) {
		this.tb_produtos = tb_produtos;
	}
	
}
