package POO;

public class Paciente {

	//1. Atributos
	String numeroSeguroSocial;
	String tipoSangre;
	boolean expediente;
	private boolean seguroGastosMedicos;
	String cita;
	String doctorAsignado;
	boolean alergias;
	
	
	//2. Constructor que recopila todos los datos
	public Paciente(String numeroSeguroSocial, String tipoSangre, boolean expediente, boolean seguroGastosMedicos, String cita, String doctorAsignado, boolean alergias) {
		
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.tipoSangre = tipoSangre;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
		this.cita = cita;
		this.doctorAsignado = doctorAsignado;
		this.alergias = alergias;
	}//Cierra constructor que recopila todos los datos
	
	
	//2.1 Constructor que recopila solo los datos requeridos u obligatorios
	Paciente(String numeroSeguroSocial, boolean expediente, boolean seguroGastosMedicos){
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
	}//Cierre constructor campos obligatorios


	
	//3. Metodos
	@Override
	//Metodo llamado toString que utiliza datos del tipo String
	public String toString() {
		return "Paciente [numeroSeguroSocial= " + numeroSeguroSocial + ", tipoSangre= " + tipoSangre + ", expediente= " + expediente + ", seguroGastosMedicos= " + seguroGastosMedicos + ", cita=" + cita + ", doctorAsignado= " + doctorAsignado + ", alergias= " + alergias + "]";
	}//cierre toString


	
	
	//getter
	public boolean getSeguroGastosMedicos() {
		return seguroGastosMedicos;
	}
	
	//setter
	public void setSeguroGastosMedicos(boolean seguroGastosMedicos) {
		this.seguroGastosMedicos = seguroGastosMedicos;
	}
	
	
	
	
	
	
}
