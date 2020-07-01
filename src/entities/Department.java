package entities;

public class Department {

	private String name;

	//Construtor_padrão
	public Department() {
	}
	
	//Construtor_com_argumentos
	public Department(String name) {
		this.name = name;
	}

	//getters_and_setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
