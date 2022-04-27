package entities;

public class Champion {
	
	private String firstName, secondName;
	private Integer firstLife, secondLife;
	private Integer firstAttack, secondAttack;
	private Integer firstArmor, secondArmor;
	private Integer damange;
		
	public void Champion(String firstName, int firstLife, int damange, int firstArmor) {
		this.firstName = firstName;
		this.firstLife = firstLife;
		this.firstArmor = firstArmor;
		takeDamange(damange);
	}
	public void takeDamange(int damange) {
		damange = (firstLife + firstArmor) - secondAttack;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public Integer getFirstLife() {
		return firstLife;
	}
	public void setFirstLife(Integer firstLife) {
		this.firstLife = firstLife;
	}
	public Integer getSecondLife() {
		return secondLife;
	}
	public void setSecondLife(Integer secondLife) {
		this.secondLife = secondLife;
	}
	public Integer getFirstAttack() {
		return firstAttack;
	}
	public void setFirstAttack(Integer firstAttack) {
		this.firstAttack = firstAttack;
	}
	public Integer getSecondAttack() {
		return secondAttack;
	}
	public void setSecondAttack(Integer secondAttack) {
		this.secondAttack = secondAttack;
	}
	public Integer getFirstArmor() {
		return firstArmor;
	}
	public void setFirstArmor(Integer firstArmor) {
		this.firstArmor = firstArmor;
	}
	public Integer getSecondArmor() {
		return secondArmor;
	}
	public void setSecondArmor(Integer secondArmor) {
		this.secondArmor = secondArmor;
	}
	public Integer getDamange() {
		return damange;
	}
	public void setDamange(Integer damange) {
		this.damange = damange;
	}
	
}
