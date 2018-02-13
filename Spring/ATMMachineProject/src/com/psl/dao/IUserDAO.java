package com.psl.dao;

import java.util.List;

import com.psl.bean.Transaction;
import com.psl.bean.User;

public interface IUserDAO {

	void createUser(User u);
	List<Transaction> miniStatement();
	void depositAmount(User u,int amount);
	void withdrawAmount(User u,int amount);
}
