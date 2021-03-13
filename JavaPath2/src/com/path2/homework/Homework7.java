package com.path2.homework;

public class Homework7 {
	public static void main(String[] args) {
		String strone = "You and Me";
		String strtow = " you and me ";
		
		//1
		if(strone.equals(strtow)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}
		//2
		con(strone,"And");
		//3
		System.out.println(lang(strtow));
		//4
		System.out.println(strone.substring(1,4));
		//5
		System.out.println(strtow.trim());
		//6
		System.out.println(strone.toUpperCase());
		//7
		System.out.println(strtow.toUpperCase().trim());
	}
	
	public static void con(String world,String name) {
		if(world.contains(name)) {
			System.out.println(name);
		}else
			System.out.println("Not have string");
	}
	
	public static int lang(String world) {
		return world.length();
	}
}
