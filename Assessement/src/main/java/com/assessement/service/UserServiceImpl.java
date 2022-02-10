package com.assessement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.assessement.dao.UserDAO;
import com.assessement.model.User;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional(readOnly = true)
	public List<User> listUser() {
		return (List<User>) userDAO.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public User findUser(User user) {
		return userDAO.findById(user.getIdUser()).orElse(null);
	}

	@Override
	@Transactional
	public void saveUser(User user) {
		userDAO.save(user);		
}

	@Override
	@Transactional
	public void deleteUser(User user) {
		userDAO.delete(user);

	}


}


 /* Se usa:
  *  @Autowired
  *  private IProductDAO productDAO;
  * Para injectar instancia de objeto que extiende de JpaRepository y hacer uso de los metodos
  * ya definidos en esta clase. findall(), save(), delete(), findById()...
  * 
  * */
