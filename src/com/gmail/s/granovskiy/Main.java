package com.gmail.s.granovskiy;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		/*  creating and filling the object SDF789  */
		Group SDF789 = new Group();  //  creating object SDF789
		//  creating students and adding them to the SDF789 object
		SDF789.addStudent("Mike", 20, 'm');
		SDF789.addStudent("Tom", 19, 'm');
		SDF789.addStudent("Maria", 18, 'f');
		System.out.println();
		System.out.println("Displaying data of the original object:");
		SDF789.printgroup(); //  printing the object SDF789 to the console  
		
		/* serialization - saving the state of the object as a sequence of bytes */
		/*  creating object stream for recording/writing  */
		try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("fileOne"))) {
			OOS.writeObject(SDF789);  //  the object SDF789 and its state are saved to the file fileOne
		} catch (IOException e) {
			System.out.println("ERROR !!!");
		}
		
		Group PRT345 = null;  // creating a variable PRT345 of Group type and assigning it null
		/* deserialization - restoring the object from a sequence of bytes */
		/*  creating object stream for reading  */
		try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("fileOne"))) {
			PRT345 = (Group) OIS.readObject(); 
			// reading (restoring the object) from the fileOne and saving it to the variable PRT345
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("ERROR load group !!!");
		}
		System.out.println();
		System.out.println("Displaying data of the object which was read:");
		PRT345.printgroup();  //  printing the object PRT345 to the console and to the file c.csv
	}
}