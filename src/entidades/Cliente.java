package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private static SimpleDateFormat sdf = 
			new SimpleDateFormat("dd/MM/yyy");
	
	private String nome;
	private String email;
	private Date dtNasc;
	
	private Cliente() {
		
	}
	
	public Cliente(String nome, String email, Date dtNasc) {
		this.nome = nome;
		this.email = email;
		this.dtNasc = dtNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cliente: ");
		sb.append(nome +"\n");
		sb.append("Email: ");
		sb.append(email +"\n");
		sb.append("Data de Nascimento: ");
		sb.append(sdf.format(dtNasc)+"\n");		
		return sb.toString();
	}
	
	
	
	
	
}
