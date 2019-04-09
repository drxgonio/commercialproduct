package com.spring.utils;

public class ClassUtils {
	// convert String to ClassName
		public static Class classForName(String nameClass)
		{
			Class classObject=null;
			try {
			classObject = Class.forName("com.spring.entity."+nameClass);
			} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
			return classObject;
		}

}
