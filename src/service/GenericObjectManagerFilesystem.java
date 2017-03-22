package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class GenericObjectManagerFilesystem <PK, T extends Serializable> implements IGenericObjectManager<PK, T> {

	private File file = new File("file_class.txt");
	
	public GenericObjectManagerFilesystem() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public PK create(T obj) {
		// TODO Auto-generated method stub
		
		File f = new File(path);
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
		fos.close();
		return (PK) obj.getId();
	}

	@Override
	public T read(PK id) {
		// TODO Auto-generated method stub
		
		

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
		T lastObj;
		while(true){
			lastObj = ois.readObject();
		}
		}catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	@Override
	public T update(T obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(T obj) {
		// TODO Auto-generated method stub
		
	}

}
