/**
 * 
 */
package com.cg.Service;

import java.util.List;

import com.cg.Model.Person;
import com.cg.Repository.HelloMsgRepositoryImpl;
import com.cg.Repository.IHelloMsg;

/**
 * @author trainee
 *
 */
public class PersonServiceImpl implements PersonService {
	
	private IHelloMsg hellomsg=new HelloMsgRepositoryImpl();
	
	@Override
	public List<Person> ViewALL()
	{
		return hellomsg.ViewALL();
	}

}
