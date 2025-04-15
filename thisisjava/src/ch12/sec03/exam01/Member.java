package ch12.sec03.exam01;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//port lombok.NoArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;


//@Getter
//@Setter
//@ToString
//@Data
public class Member {
	public String id;
	
//	public Member(String id) {
//		this.id = id;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			if(this.id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "[Member] id: " + id;
	}
}
