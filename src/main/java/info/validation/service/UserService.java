package info.validation.service;

import info.validation.dto.UserRequest;
import info.validation.entity.User;
import info.validation.exception.UserNotFoundException;
import info.validation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserRequest userRequest) {
        User user = User.build(0, userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(), userRequest.getAge(), userRequest.getGender(), userRequest.getNationality());
        return userRepository.save(user);
    }
    public List<User> getAllUser () {
        return userRepository.findAll();
    }
    public User getUser(int id) throws UserNotFoundException {
        User user = userRepository.findByUserId(id);
        if (user!= null) {
            return user;
        }else {
            throw new UserNotFoundException("user not found with this id : "+id);
        }
    }

}
