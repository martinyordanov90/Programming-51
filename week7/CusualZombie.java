package com.hackbulgaria.programming51.week7;

public class CusualZombie implements Zombie {

	private int health;
	
	
	public int getTotalHealth() {
		return health;
	}

	public int getCurrentHealth() {
		return health;
	}

	
	public void hit(int damage) {
		health -= damage;
		if (health <= 0) {
			health = 0;
		}
		
	}

	
	public boolean isDead() {
		
		return health == 0;
	}

}
