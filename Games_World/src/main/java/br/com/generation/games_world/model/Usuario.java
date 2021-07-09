package br.com.generation.games_world.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_usuarios")
public class Usuario {
	

			
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private long id;
			
			@NotNull
			@Size (min = 2, max = 100)
			private String nome;
			
			@NotNull
			@Email
			@Size (min = 2, max = 100)
			private String usuario;
			
			@NotNull
			@Size(min = 5)
			private String senha;
			
			@Column(name = "dt_aniversario")
			@JsonFormat(pattern = "yyyy-MM-dd")
			private LocalDate dataAniversario;
				
			@OneToMany (mappedBy = "usuario", cascade = CascadeType.REMOVE)
			@JsonIgnoreProperties("usuario")
			private List <Produtos> produtos;
			
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


			public String getUsuario() {
				return usuario;
			}


			public void setUsuario(String usuario) {
				this.usuario = usuario;
			}


			public String getSenha() {
				return senha;
			}


			public void setSenha(String senha) {
				this.senha = senha;
			}


			public List<Produtos> getProdutos() {
				return produtos;
			}


			public void setPostagem(List<Produtos> produtos) {
				this.produtos =  produtos;
			}


			public LocalDate getDataAniversario() {
				return dataAniversario;
			}


			public void setDataAniversario(LocalDate dataAniversario) {
				this.dataAniversario = dataAniversario;
			}


	
}
	    


