package com.atiempo.operaciones;

public interface Descuento {
	
	void setDescuento(float descuento);
	Float getDescuento();
	
	public static Float getValorDescuento(float precio, float descuento) {
		return precio * descuento;
		
	};
	
	public static Float getPrecioConDescuento(float precio, float descuento) {
		return precio - getValorDescuento(precio, descuento);
	};
}
