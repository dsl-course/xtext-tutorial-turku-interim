package fi.tucs.entities.typing;

public class Entity_Type implements Expression_Type {

	public Entity_Type(String name) {
		this.entityName = name;
	}
	
	private String entityName;
	
	public String getEntityName() {
		return this.entityName;
	}
	
	public void setEntityName(String value) {
		this.entityName = value;
	}
	
	public String toString() {
		return this.getEntityName();
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Entity_Type)) return false;
		
		Entity_Type other = (Entity_Type) o; // type cast
		if (this.getEntityName() != other.getEntityName()) {
			return false;
		}
		
		return true;
	}
}
