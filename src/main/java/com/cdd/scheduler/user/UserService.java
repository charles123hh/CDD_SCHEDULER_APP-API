package com.cdd.scheduler.user;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired 
    private UserRepository userRepository;

    public List<UserDTO> fetchUsers(){
        return this.toUserDTOList(this.userRepository.findAll());
    }

    public UserDTO toUserDTO(User user){
		UserDTO userDTO = new UserDTO();
        userDTO.userID = user.getUserID();
        userDTO.username = user.getUsername();
        userDTO.password = user.getPassword();
		return userDTO;
	}
	public List<UserDTO> toUserDTOList(List<User> users){
		return users.stream().map(user -> this.toUserDTO(user)).collect(Collectors.toList());
	}

	public User toUserEntity(UserDTO userDTO){
		User user = new User();
        user.setUserID(userDTO.userID);
        user.setUsername(userDTO.username);
        user.setPassword(userDTO.password);
		return user;
	}
	public List<User> toCategoryEntityList(List<UserDTO> usersDTO){
		return usersDTO.stream().map(user -> this.toUserEntity(user)).collect(Collectors.toList());
	}
    
}
