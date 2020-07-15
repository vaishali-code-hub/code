package com.test.Test4;

import com.test.Test1.Animal;
import com.test.Test1.Bird;
import com.test.Test2.Duck;
import com.test.Test2.Soundable;
import com.test.Test3.Rooster;

public class Parrot{

	
	private Dog dog;
	private Cat cat;
	
	private Object animal;
	
	private Duck duck;

	private Rooster rooster;
	
	public Parrot(Dog dog){
		this.dog=dog;
	}
	
	public Parrot(Duck duck){
		this.setDuck(duck);
	}
	
	public Parrot(Cat cat){
		this.setCat(cat);
	}
	
	public Parrot(Rooster rooster){
		this.setRooster(rooster);
	}
	

	/**
	 * @return the dog
	 */
	public Dog getDog() {
		return dog;
	}

	/**
	 * @return the cat
	 */
	public Cat getCat() {
		return cat;
	}

	/**
	 * @param cat the cat to set
	 */
	public void setCat(Cat cat) {
		this.cat = cat;
	}

	/**
	 * @return the rooster
	 */
	public Rooster getRooster() {
		return rooster;
	}

	/**
	 * @param rooster the rooster to set
	 */
	public void setRooster(Rooster rooster) {
		this.rooster = rooster;
	}

	/**
	 * @return the animal
	 */
	public Object getAnimal() {
		return animal;
	}

	/**
	 * @param animal the animal to set
	 */
	public void setAnimal(Object animal) {
		this.animal = animal;
	}

	/**
	 * @return the duck
	 */
	public Duck getDuck() {
		return duck;
	}

	/**
	 * @param duck the duck to set
	 */
	public void setDuck(Duck duck) {
		this.duck = duck;
	}

	
	
	
	
}
