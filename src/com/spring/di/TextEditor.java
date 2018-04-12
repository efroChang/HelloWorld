package com.spring.di;

public class TextEditor {

	private SpellChecker spellChecker;
	
	public TextEditor( SpellChecker spellChecker )
	{
		System.out.println("In TextEditor Constructor...");
		
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
	public void init()
	{
		System.out.println("Initialize Text Editor..." );
	}
	
	public void destroy()
	{
		System.out.println("Destroy Text Editor..." );
	}
}
