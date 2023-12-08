package com.example.Service;
import java.util.List;

import com.example.Binding.*;


public interface UserService {
	public String saveuser(UserDto b);
	public List<UserDto>getall();
	public String deletedata(long id);
	public UserDto updatedata(UserDto u,Long id);

}
