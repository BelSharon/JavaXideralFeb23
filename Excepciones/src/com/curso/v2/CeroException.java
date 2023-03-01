package com.curso.v2;
//CREAMOS UNA EXCEPTION A LLAMAR EN PRINCIPAL
public class CeroException extends Exception{

	CeroException(String msg){
		super(msg);
	}
}