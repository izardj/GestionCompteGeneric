package service;

import java.io.Serializable;

public interface IGenericObjectManager <PK, T extends Serializable>{
	
	public PK create(T obj);
	
	public T read(PK id);

	public T update(T obj);
	
	public void delete(T obj);
}
