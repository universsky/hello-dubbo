/**
 * 
 */
package hello.api.model;

/**
 * @author jack
 *
 */
public class User {
	private String id;
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
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

}
