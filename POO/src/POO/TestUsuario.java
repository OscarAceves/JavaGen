package POO;

public class TestUsuario {

	public static void main(String[] args) {
		
		
		//Instancia de usuario
		
		Usuario Felipe = new Usuario ("Doctor", "DoctorFelipe", "paracetamol");
		
		//Cambiar contraseña
		Felipe.setpassword("");
		Felipe.setpassword("paracetamol");
		Felipe.setpassword("para");
		Felipe.setpassword("sisepudo");

	}

}
