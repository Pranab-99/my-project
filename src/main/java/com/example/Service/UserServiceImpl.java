package com.example.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Binding.UserDto;
import com.example.Entity.UserEntity;
import com.example.Repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepository;

    @Override
    public String saveuser(UserDto userDto) {
    	UserEntity entity=new UserEntity();
    	BeanUtils.copyProperties(userDto,entity );
    	userRepository.save(entity);
        return "User saved successfully";
    }

    @Override
    public List<UserDto> getall() {
        List<UserEntity> users = userRepository.findAll();
        return users.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @Override
    public String deletedata(long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return "User deleted successfully";
        } else {
            return "User not found";
        }
    }

    @Override
    public UserDto updatedata(UserDto userDto, Long id) {
        Optional<UserEntity> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
        	UserEntity userEntity = optionalUser.get();
        	BeanUtils.copyProperties(userDto, userEntity );  
            userRepository.save(userEntity);
            return convertToDto(userEntity);
        } else {
            return null; // User not found
        }
    }

    private UserDto convertToDto(UserEntity user) {
        return new UserDto(user.getName(), user.getCourse(), user.getEmail(), user.getCity());
    }
}
