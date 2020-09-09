package br.unitins.trabalhotopicos.controller;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
@Named
@RequestScoped
public class Login {
	private String usuario;
	private String email;
	private String texto;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public void enviar() {
		System.out.println("Usuario: " +  this.usuario);
		System.out.println("E-mail: " + this.email);
		System.out.println("Informação: " + this.texto);
	}
	
	public void limpar() {
		this.usuario = "";
		this.email = "";
		this.texto = "";
		
	}
}
