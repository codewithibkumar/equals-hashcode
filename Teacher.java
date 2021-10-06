package packageintro;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Setter
//@Getter
@Data
public class Teacher {

	private int teacherId;
	private String name;
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Teacher t =(Teacher)obj;
		return this.getTeacherId() == t.getTeacherId() && this.getName().equals(t.getName()); 
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getTeacherId() + this.getName().hashCode();
	}
	
}


