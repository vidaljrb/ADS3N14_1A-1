package com.senac.estruturas;

public class Nodo<T> {
<<<<<<< HEAD
	private T chave;
	private Nodo<T> next;
	
	public Nodo()
	{
		chave = null;
		next = null;
	}

	public T getChave() {
		return chave;
	}

	public void setChave(T chave) {
		this.chave = chave;
	}

	public Nodo<T> getNext() {
		return next;
	}

	public void setNext(Nodo<T> next) {
		this.next = next;
	}
=======
	
	private T  dado;
	private Nodo<T> next;

	public Nodo(T i)
	{
		dado = i;
		next = null;
	}
	
	public void setData(T i)
	{
		dado = i;
		next = null;
	}
	
	public T getData()
	{
		return dado;
	}

	public void setNext(Nodo<T> next)
	{
		this.next = next;
	}
	
	public Nodo<T> getNext()
	{
		return next;
	}
>>>>>>> d6310f1e61ad2aae30ae94e4bff23a5990af1507
}
