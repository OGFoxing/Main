package kz.ogfox.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserData {
	public static Object deserData(String file_name)
	{
		Object retObj = null;
		try {
			FileInputStream fis = new FileInputStream(file_name + ".ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			retObj = ois.readObject();
			fis.close();
			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("Object stream out/in error");
			System.exit(2);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
			System.exit(3);
		}
		return retObj;
	}
}
