package exerciceBarbare;

import java.util.ArrayList;

public class Barbarian extends Creature {
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
	
	public String toString() { //Retourne un String des infos sur l'objet, ses attributs
			String retour  = (this.getClass().getSimpleName() + " " +name + " *" + health + "*, L : " + leftHand + ", R : " + rightHand);
			if (inventory.size() > 0) { //Liste l'inventaire s'il y'a quelque chose dedans
				retour += "\n------";
				for (HandItem e: inventory) {
					retour += ("\n" + e);
				}
				retour += "\n------";
			}
			return retour;
	}
	
	@Override
	public int attack() { //Retourne les pts de dégats du Barbare
		if(this.leftHand.getDamage() >= 0 && this.leftHand.getDamage() >= 0) { //Si 2x armes
			if (this.leftHand.getName().equals(this.rightHand.getName())) { //Si 2x MEME armes
				return leftHand.getDamage() + this.rightHand.getDamage() + 2;
			} else { //Si 2x armes différentes
				return leftHand.getDamage() + this.rightHand.getDamage();
			}
		} else if (this.rightHand.getDamage() < 0){ //Sinon si arme en main gauche
			return this.leftHand.getDamage();
		} else if (this.leftHand.getDamage() < 0){ //Sinon si arme en main droite
			return this.rightHand.getDamage();
		} else { //Sinon, c'est que c'est 2 boucliers, 0pts de dégats
			return 0;
		}
	}
	
	@Override
	public int defense() { //Retourne la DEF (Pv + Shield) du Barbare
		if (this.leftHand.getDefense() >= 0 ^ this.leftHand.getDefense() >= 0) { //Uniquement si il y'a qu'un bouclier, pv + shield
			if (this.leftHand.getDefense() >= 0) {
				return (this.health + this.leftHand.getDefense());
			} else {
				return (this.health + this.rightHand.getDefense());
			}
		} else { //Sinon, si il a deux ou aucun Bouclier, retourne les PV
			return this.health;
		}
	}
	
	
	public void addToInventory(HandItem _item) { //Ajoute objet à inventaire
		inventory.add(_item);
	}
	
	public void swapLeftItem(int i) {
		this.leftHand = swapItem(i, leftHand);
	}
	
	public void swapRightItem(int i) {
		this.rightHand = swapItem(i, rightHand);
	}
	
	private HandItem swapItem(int i, HandItem _item) { //Echanger item dans inventaire[i] avec main indiquée en p_2
		HandItem tempItem;
		if (i < 0 || i > (this.inventory.size() - 1)) {
			System.out.println("OOB");
		} else {
			tempItem = _item;
			_item = this.inventory.get(i);
			this.inventory.set(i, tempItem);
		}
		return _item;
	}
}
