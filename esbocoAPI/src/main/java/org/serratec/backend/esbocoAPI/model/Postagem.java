package org.serratec.backend.esbocoAPI.model;

import java.sql.Date;
import org.apache.catalina.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "postagem")
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String content;
	private Date timestamp;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario author;

	public Postagem(Long id, String content, Date timestamp, Usuario author) {
		super();
		this.id = id;
		this.content = content;
		this.timestamp = timestamp;
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Usuario getAuthor() {
		return author;
	}

	public void setAuthor(Usuario author) {
		this.author = author;
	}

}
