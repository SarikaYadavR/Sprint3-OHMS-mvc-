/**
 * 
 */
package com.cg.Repository;

import java.util.ArrayList;
import java.util.List;

import com.cg.Model.Person;

/**
 * @author trainee
 *
 */
public class HelloMsgRepositoryImpl implements IHelloMsg {

	@Override
	public List<Person> ViewALL() {

		List<Person> persons= new ArrayList<>();

		Person person=new Person();
		person.setName("Sarika");

		persons.add(person);

		return persons;
	}

}
