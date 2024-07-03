package Typecasting;

	class Animal{};
	class Dog extends Animal{};
	class Cat extends Animal{};
	
public class TypeCastingObject2 {

	public static void main(String[] args) {
		
		// rule 1: conversion is valid or not
		//the type of C & D and  must have some relationship(either parent to child or vice versa)
		
		/*Animal an=new Dog(); //valid
		Cat ct=(Cat) an;*/
	//  A   B    C   D
		
		/*Dog dg=new Dog();  //invalid
		Cat ct=(Cat) dg;*/
		
		//rule 2 : assignment is valid or not
		//C must be equal or child of A
		
		/*Animal an=new Dog(); //valid
		Cat ct=(Cat) an;
		
		Animal an=new Dog(); //invalid 
		Cat ct=(Dog) an;*/
		
		//rule 3 : the underlying object type of D must be either same or child of C
		
		/*Animal an=new Dog(); //invalid
		Cat ct=(Cat) an;*/
		
		Animal an=new Cat(); //valid for all 3 rules
		Cat ct=(Cat) an;
	}

}
