package model.data_structures;


public class Cola<T> implements ICola<T>{
	private Node<T> inicioCola;
	private Node<T> finCola;
	private int tamanoCola;
	public Cola(){
		inicioCola = null;
		finCola = null;
	}
	public boolean estavacia(){
		if(inicioCola==null)
			return true;
		else{
			return false;
		}
	}
	public void enqueue(T multa)
	{
		Node<T> nuevo = new Node<>();
		nuevo.cambiarDato(multa);
		if(estavacia())
		{
			inicioCola = nuevo;
			finCola = nuevo;
			tamanoCola++;
		}
		else
		{
			finCola.cambiarSiguiente(nuevo);
			finCola = nuevo;
			tamanoCola++;
		}
	}
	public Node<T> dequeue(){
		if(!estavacia())
		{
			Node<T> valorEliminado = inicioCola;
			if(inicioCola.darSiguiente()!=null)
				inicioCola = inicioCola.darSiguiente();
			else
				inicioCola= null;
			return valorEliminado;
		}
		else{
			return null;
		}
	}
	public int dartamanoCola(){
		return tamanoCola;
	}
	public Node<T> darPrimerElemento(){
		return inicioCola;
	}

}