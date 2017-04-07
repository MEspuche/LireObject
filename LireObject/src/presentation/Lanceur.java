package presentation;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import metier.Compte;

public class Lanceur {

	public static void main(String[] args) throws IOException, ClassNotFoundException , EOFException{
		// TODO Auto-generated method stub
		
		
		
		
		
		File f = new File("banque.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Compte c1 = new Compte();
		
		try {
			while((c1=(Compte) ois.readObject())!=null)
			{
			
			
			System.out.println(c1);
			
				
				
				}
				
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			System.out.println("le fichier n'existe pas");
		
		} 
		
		
		ois.close();
		fis.close();
		
		
		
		


		
	
	}
		
		
	

}
