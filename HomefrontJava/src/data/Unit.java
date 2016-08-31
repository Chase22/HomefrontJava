package data;

public class Unit {
	private String Name;
	private String Description;
	private UnitType type;
	private int count;
	private int cost;
	private int capacity;
	private int ration;
	private int movement;
	private int health;
	private int resistance;
	private int conquer;
	
	//getter setter
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public UnitType getType() {
		return type;
	}
	public void setType(UnitType type) {
		this.type = type;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getRation() {
		return ration;
	}
	public void setRation(int ration) {
		this.ration = ration;
	}
	public int getMovement() {
		return movement;
	}
	public void setMovement(int movement) {
		this.movement = movement;
	}
	public int getResistance() {
		return resistance*count;
	}
	public int getCost() {
		return cost*count;
	}
	public int getCapacity() {
		return capacity*count;
	}
	public int getHealth() {
		return health*count;
	}
	public int getConquer() {
		return conquer*count;
	}
	//Singlegetter
	public int getResistanceSingle() {
		return resistance;
	}
	public int getCostSingle() {
		return cost;
	}
	public int getCapacitySingle() {
		return capacity;
	}
	public int getHealthSingle() {
		return health;
	}
	public int getConquerSingle() {
		return conquer;
	}
	
	/**
	 * @param name
	 * @param description
	 * @param type
	 * @param count
	 * @param cost
	 * @param capacity
	 * @param ration
	 * @param movement
	 * @param health
	 * @param resistance
	 * @param conquer
	 */
	public Unit(String name, String description, UnitType type, int count, int cost, int capacity, int ration,
			int movement, int health, int resistance, int conquer) {
		super();
		Name = name;
		Description = description;
		this.type = type;
		this.count = count;
		this.cost = cost;
		this.capacity = capacity;
		this.ration = ration;
		this.movement = movement;
		this.health = health;
		this.resistance = resistance;
		this.conquer = conquer;
	}
	
	
	
}
