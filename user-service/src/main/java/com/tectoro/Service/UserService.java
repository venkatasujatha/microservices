package com.tectoro.Service;

import com.tectoro.Model.User1;

public interface UserService {

	Object save(User1 user);

	User1 getUserWithDepartment(int uid);

}
