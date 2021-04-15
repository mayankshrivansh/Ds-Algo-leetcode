package com.mayank.collections.arraylist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<String> players = new ArrayList<String>();
		players.add("Sachin");
		players.add("Saurav");
		players.add("Dravid");
		
		for(String player: players) {
			System.out.println("Initial players are: "+ player);
		}
		
		//Serializing
		FileOutputStream fos = new FileOutputStream("file");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(players);
		fos.close();
		oos.close();
		
		//Deserializing
		FileInputStream fis = new FileInputStream("file");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList list= (ArrayList) ois.readObject();
		System.out.println(list);
		
		
	}
	

}
