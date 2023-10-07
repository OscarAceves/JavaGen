package POO;

public class Usuario {
	
	
	//Atributos
	private String tipoUsario;
	private String username;
	private String password;

	//Crear nuevo usuario (constructor)
	public Usuario(String tipoUsuario, String username, String password){
		this.tipoUsario = tipoUsuario;
		this.username = username;
		this.password = password;
		
	}//cierre constructor
	
	
	
	//Recuperar contraseña (getter)
	public String getpassword(){
		//Si el usuario registrado coincide con el usuario que se pasa como parametro
		return password;
	}
	
	
	
	//Cambiar la contraseña (setter)
	public void setpassword(String nuevoPassword) {
		//si la nueva contraseña es diferente a una cadena vacía y es diferente da la contraseña anterior
		int passwordInt = nuevoPassword.length();
		//entonces se reemplaza la contraseña anterior
		if (nuevoPassword != "" &&  passwordInt >5 && nuevoPassword != password) {
			password = nuevoPassword;
			System.out.println("Contraseña actualizada");
		}else {
			System.out.println("Lo siento, no fue posible cambiar la contraseña");
		}//cierre if else
	}//cierre setter
	
	
	
	
	
}//cierre clase usuario
