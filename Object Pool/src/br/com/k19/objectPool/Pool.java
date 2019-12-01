package br.com.k19.objectPool;

public interface Pool<T> {
	T acquire();
	void release(T t);
}
