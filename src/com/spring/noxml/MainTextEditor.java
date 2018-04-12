package com.spring.noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainTextEditor {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);

		TextEditor editor = context.getBean(TextEditor.class);
		editor.spellCheck();
	}
}
