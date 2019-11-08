package Collection;

public class Person implements Comparable<Person>{

	String name;
	int age;
	String city;

	public static void main(String[] args) {

	}

	public Person(String name, Integer age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	@Override
	public int compareTo(Person o) {
		return (this.name.compareTo(o.name) ) == 0 ? Integer.compare(this.age, o.age) : this.name.compareTo(o.name);    // sort name than age
		
	//	return (this.name.compareTo(o.name) ) == 0 ? 
	//			( Integer.compare(this.age, o.age) == 0 ? this.city.compareTo(o.city)
	//					:Integer.compare(this.age, o.age)) 
	//					: this.name.compareTo(o.name);							// sort name than age than city																	
		
	//	return (this.name.compareTo(o.name) );
	//	return (Integer.compare(this.age, o.age) );
		
	}
	
	


}
