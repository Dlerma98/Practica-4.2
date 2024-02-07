package Ejercicio02;
public class Carta {
	private String destinatario;
	
	private String direccion_destino;
	
	private String codigopostal_destino;
	
	private String emisor;
	
	private String direccion_origen;
	
	private String codigopostal_origen;
	
	private String tipo_carta;
	
	private String tipo_envio;
	
	private String peso;
	
	public Carta() {
		
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getDireccion_destino() {
		return direccion_destino;
	}

	public void setDireccion_destino(String direccion_destino) {
		this.direccion_destino = direccion_destino;
	}

	public String getCodigopostal_destino() {
		return codigopostal_destino;
	}

	public void setCodigopostal_destino(String codigopostal_destino) {
		this.codigopostal_destino = codigopostal_destino;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public String getDireccion_origen() {
		return direccion_origen;
	}

	public void setDireccion_origen(String direccion_origen) {
		this.direccion_origen = direccion_origen;
	}

	public String getCodigopostal_origen() {
		return codigopostal_origen;
	}

	public void setCodigopostal_origen(String codigopostal_origen) {
		this.codigopostal_origen = codigopostal_origen;
	}

	public String getTipo_carta() {
		return tipo_carta;
	}

	public void setTipo_carta(String tipo_carta) {
		this.tipo_carta = tipo_carta;
	}
	

	public String getTipo_envio() {
		return tipo_envio;
	}

	public void setTipo_envio(String tipo_envio) {
		this.tipo_envio = tipo_envio;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public Carta(String destinatario, String direccion_destino, String codigopostal_destino, String emisor,
			String direccion_origen, String codigopostal_origen, String tipo_carta, String tipo_envio, String peso) {
		this.destinatario = destinatario;
		this.direccion_destino = direccion_destino;
		this.codigopostal_destino = codigopostal_destino;
		this.emisor = emisor;
		this.direccion_origen = direccion_origen;
		this.codigopostal_origen = codigopostal_origen;
		this.tipo_carta = tipo_carta;
		this.tipo_envio = tipo_envio;
		this.peso = peso;
	}
	
}