package exerciceBarbare;

import java.util.ArrayList;

public class Barbarian {
	private String name;
	private int health;
	private HandItem leftHand;
	private HandItem rightHand;
	private ArrayList<HandItem> inventory;
	
	public Barbarian(String _name, int _health, HandItem _leftHand, HandItem _rightHand) {
		this.name = _name;
		this.health = _health;
		this.leftHand = _leftHand;
		this.rightHand = _rightHand;
		this.inventory = new ArrayList<HandItem>();
	}
	
	public String toString() {
			String retour  = (this.getClass().getSimpleName() + " " +name + " *" + health + "*, L : " + leftHand + ", R : " + rightHand);
			retour += "\n------";
			for (HandItem e: inventory) {
				//REPRENDRE ICI
			}
	}
	
	public String getName() {
		return this.name;
	}
	
	public int attack() {
		if(this.leftHand.getDamage() >= 0 && this.leftHand.getDamage() >= 0) {
			if (this.leftHand.getName().equals(this.rightHand.getName())) {
				return leftHand.getDamage() + this.rightHand.getDamage() + 2;
			} else {
				return leftHand.getDamage() + this.rightHand.getDamage();
			}
		} else if (this.rightHand.getDamage() < 0){
			return this.leftHand.getDamage();
		} else if (this.leftHand.getDamage() < 0){
			return this.rightHand.getDamage();
		} else {
			return 0;
		}
	}
	
	public int defense() {
		
		if (this.leftHand.getDefense() >= 0) {
			return (this.health + this.leftHand.getDefense());
		} else if (this.rightHand.getDefense() >= 0) {
			return (this.health + this.rightHand.getDefense());
		} else {
			return this.health;
		}
	}
	
	public void fight(Barbarian _adversaire) {
		int pvA = this.defense();
		int pvB = _adversaire.defense();
		String winner;
		
		do {
			pvA -= _adversaire.attack();
			pvB -= this.attack();
		} while (pvA > 0 && pvB > 0);
		
		if (pvA <= 0 && pvB <= 0) {
			winner = "nobody";
		} else if (pvA > pvB) {
			winner = this.getName();
		} else {
			winner = _adversaire.getName();
		}
		
		System.out.println(winner + " won the fight !");
		
	}
	
	public void addToInventory(HandItem _item) {
		inventory.add(_item);
	}
}
