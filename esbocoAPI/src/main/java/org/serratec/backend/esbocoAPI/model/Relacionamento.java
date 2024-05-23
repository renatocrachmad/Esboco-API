package org.serratec.backend.esbocoAPI.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name= "relacionamento")
public class Relacionamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "follower_id")
	private Usuario follower;

	@ManyToOne
	@JoinColumn(name = "followed_id")
	private Usuario followed;

	@Column(name = "data_inicio_seguimento")
    @Temporal(TemporalType.DATE)
	private Date timestamp;

	public Relacionamento() {
		super();
		
	}

	public Relacionamento(Long id, Usuario follower, Usuario followed, Date timestamp) {
		super();
		this.id = id;
		this.follower = follower;
		this.followed = followed;
		this.timestamp = timestamp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getFollower() {
		return follower;
	}

	public void setFollower(Usuario follower) {
		this.follower = follower;
	}

	public Usuario getFollowed() {
		return followed;
	}

	public void setFollowed(Usuario followed) {
		this.followed = followed;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}
