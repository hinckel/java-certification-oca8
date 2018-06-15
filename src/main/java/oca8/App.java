package main.java.oca8;

import main.java.oca8.arrays.Arrays;
import main.java.oca8.dataTypes.DataType;
import main.java.oca8.exceptions.Exceptions;
import main.java.oca8.inheritance.Inheritance;
import main.java.oca8.javaAPI.JavaAPI;
import main.java.oca8.javaBasic.JavaBasic;
import main.java.oca8.methodsAndEncapsulation.MethodsAndEncapsulation;
import main.java.oca8.operatorsAndConstructs.OperatorsAndConstructs;

/**
 * 
 * @author Hinckel
 * @see https://education.oracle.com/pls/web_prod-plq-dad/db_pages.getpage?page_id=5001&get_params=p_exam_id:1Z0-808
 * @see github
 * @since 08/06/2018
 */
public class App {

	public static void main(String[] args) {
		// Topics
		
		// 1 - Java Basics
		new JavaBasic();
		
		// 2 - Working with Java Data Types 
		new DataType();
		
		// 3 - Using Operators and Decision Constructs 
		new OperatorsAndConstructs();
		
		// 4 - Creating and Using Arrays 
		new Arrays();
		
		// 5 - Working with Methods and Encapsulation
		new MethodsAndEncapsulation();
		
		// 6 - Working with Inheritance
		new Inheritance();
		
		// 7 - Handling Exceptions
		new Exceptions();
		
		// 8 - Java API
		new JavaAPI();
	}
	
}
