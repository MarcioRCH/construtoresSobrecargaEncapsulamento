package entities;

public class Champion {
	
	private String name;
	private Integer life;
	private Integer attack;
	private Integer armor;
		
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public String getName() {
		return name;
	}
	public Integer getLife() {
		return life;
	}
	public Integer getAttack() {
		return attack;
	}
	public Integer getArmor() {
		return armor;
	}
	public void takeDamange(Champion other) {
		int damage;
		if(armor >= other.getAttack()) {
			damage = 1;
		}else {
			damage = other.getAttack() - armor;
		}
		life = life - damage;
	}
	public String status() {
		if(this.life <= 0) {
			return this.name + ": " + "0 of life (died)";
		}else {
			return this.name + ": " + String.format("%d", this.life) + " of life";
		}
	}
}
