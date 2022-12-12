package s1_5_niv1_ex5_montseliz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main_Ser {

	public static void main(String[] args) {
		
		Person_Ser[] persons = new Person_Ser[4];
		
		persons [0] = new Person_Ser("Montse","Liz", 30); 
		persons [1] = new Person_Ser("Meritxell", "García", 32); 
		persons [2] = new Person_Ser("Marc", "López", 25); 
		persons [3] = new Person_Ser("Encarna", "Martínez", 59); 
		
		serializePersons(persons);
		deserializePersons();
	}
	
	public static void serializePersons(Person_Ser[] persons) {
		try {
			ObjectOutputStream exit = new ObjectOutputStream(new FileOutputStream ("fitxer.ser"));
			exit.writeObject(persons);
			exit.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static void deserializePersons() {
		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("fitxer.ser"));
			Person_Ser[] persons2 = (Person_Ser[]) input.readObject();
			input.close();
			for (Person_Ser person_Ser : persons2) {
				System.out.println(person_Ser);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

	class Person_Ser implements Serializable {

		private static final long serialVersionUID = 1L;
	
		private String name;
		private String surname;
		private int age; 

		public Person_Ser(String name, String surname, int age) {
			this.name = name; 
			this.surname = surname; 
			this.age = age;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public String getSurname() {
			return surname;
		}
	
		public void setSurname(String surname) {
			this.surname = surname;
		}
	
		public int getAge() {
			return age;
		}
	
		public void setAge(int age) {
			this.age = age;
		}
	
		@Override
		public String toString() {
			return "La persona es diu " + this.name + " " + this.surname + " i té " + this.age + " anys. ";
		}

}


	