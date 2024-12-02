package com.example.bookinsert.model;




import com.example.bookinsert.dto.TestedDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookinsert")
public class BookinsertModel {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String nome;
	
	
	private String autor;
	

	private String imagemUrl;

	
	
	public BookinsertModel() {
	}


	public BookinsertModel(TestedDto dto) {
		this.nome=dto.nome();
		this.autor=dto.autor();
		this.imagemUrl=dto.imagemUrl();
	}
   

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
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getImagemUrl() {
		return imagemUrl;
	}
	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}
    
	
}
