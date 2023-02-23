package ch.noseryoung.warenkorb.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User create(User user) {
        return userRepository.save(user);
    }
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(UUID id) {
        Optional<User> optionalUsers=userRepository.findAllById(id);

        if(optionalUsers.isPresent()){
            return optionalUsers.get();
        }
        throw new NoSuchElementException("no user found with id: "+id);
    }

    @Override
    public User findByFirstname(String firstname) {
        Optional<User> optionalUsers=userRepository.findAllByFirstname(firstname);

        if (optionalUsers.isPresent()){
            return optionalUsers.get();
        }
        throw new NoSuchElementException("user with firstname "+firstname+" does not exist");
    }

    @Override
    public User findByLastname(String lastname) {
        Optional<User> optionalUsers=userRepository.findAllByLastname(lastname);

        if (optionalUsers.isPresent()){
            return optionalUsers.get();
        }
        throw new NoSuchElementException("user with lastname "+lastname+ "does not exist");
    }
}
