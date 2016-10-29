package kz.ogfox.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serData {
	public static void serData(String file_name, Object obj)
	{
		try {
			FileOutputStream fos = new FileOutputStream(file_name + ".ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("Object stream  out/in error");
			System.exit(2);
		}
	}
}
