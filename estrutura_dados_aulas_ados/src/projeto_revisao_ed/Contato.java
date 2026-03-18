package projeto_revisao_ed;

public class Contato {

 // control + shift + s
	private String nome;
	private String telefone;
	private String email;
	
	public Contato() {
	}
	// control + shift + s --- generate CONSTRUCTOR USING FIELDS
	public Contato(String nome, String telefone, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	// control + shift + s ---
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contato {nome=" + nome + ", telefone=" + telefone + ", email=" + email + "}";
	}
	
}
