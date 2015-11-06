/**
 * 
 */
package hello.api.model;

import java.io.Serializable;

/**
 * @author jack
 *
 */
public class User implements Serializable {
	private String id;
	private String name;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

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
