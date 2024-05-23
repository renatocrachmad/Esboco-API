package org.serratec.backend.esbocoAPI.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name= "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	@Temporal(TemporalType.DATE)
	private Date birthdate;

	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
	private List<Postagem> postagem;

	@OneToMany(mappedBy = "followed", cascade = CascadeType.ALL)
	private List<Relacionamento> followers;

	@OneToMany(mappedBy = "follower", cascade = CascadeType.ALL)
	private List<Relacionamento> followed;

	public Usuario() {
		super();

	}

	public Usuario(Long id, String firstName, String lastName, String email, String password, Date birthdate,
			List<Postagem> postagem, List<Relacionamento> followers, List<Relacionamento> followed) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.birthdate = birthdate;
		this.postagem = postagem;
		this.followers = followers;
		this.followed = followed;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public List<Postagem> getPosts() {
		return postagem;
	}

	public void setPosts(List<Postagem> posts) {
		this.postagem = posts;
	}

	public List<Relacionamento> getFollowers() {
		return followers;
	}

	public void setFollowers(List<Relacionamento> followers) {
		this.followers = followers;
	}

	public List<Relacionamento> getFollowed() {
		return followed;
	}

	public void setFollowed(List<Relacionamento> followed) {
		this.followed = followed;
	}

}
