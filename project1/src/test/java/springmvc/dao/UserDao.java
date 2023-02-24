package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;
//have to create object  and inject where autowiring started
@Repository
public class UserDao {
    
	@Autowired
	private HibernateTemplate hibernateTemplate;
	//code for save the data 
	
	@Transactional
	public int saveUser(User user) 
	{
		Integer id=(Integer)this.hibernateTemplate.save(user);
	 return id;
	}
}
