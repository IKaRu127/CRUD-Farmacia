package com.generation.farmacia.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome do produto é obrigatório!")
	@Size(min = 2, max = 1000, message = "O nome do produto deve conter no mínimo 2 e no máximo 1000 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo Foto é Obrigatório")
	@Size(min = 2, max = 10000, message = "Tamanho minimo: 10, maximo: 10000")
	private String foto;
	
	@NotBlank(message = "A descrição do produto é obrigatória!")
	@Size(min = 15, max = 1000, message = "A descrião do produto deve conter no mínimo 15 e no máximo 1000 caracteres")
	private String descricao;
	
	@NotBlank(message = "O preço do produto é obrigatório!")
	private float preco;
	
	@NotBlank(message = "A quantidade disponível do produto é obrigatória!")
	private int quantidade;
	
	@NotNull(message = "O atributo data de validade é Obrigatório")
	private Date validade;

	// RELACIONAMENTO COM CLASSE CATEGORIA
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

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

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}



}
