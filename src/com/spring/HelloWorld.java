package com.spring;

public class HelloWorld {
	
	private String message;

	public void getMessage() {
		System.out.println( "Yor message: " + message );
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init()
	{
		System.out.println("Initialize Hello World..." );
	}

	public void destroy()
	{
		System.out.println("Destroy..." );
	}

}
