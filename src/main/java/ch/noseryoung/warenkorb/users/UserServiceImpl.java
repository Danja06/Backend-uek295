package ch.noseryoung.warenkorb.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.SpringObjenesis;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public Users create(Users users) {
        return userRepository.save(users);
    }

    @Override
    public Users findById(int id) {
        Optional<Users> optionalUsers=userRepository.findAllById(id);

        if(optionalUsers.isPresent()){
            return optionalUsers.get();
        }
        throw new NoSuchElementException("no user found with id: "+id);
    }

    @Override
    public Users findByFirstname(String firstname) {
        Optional<Users> optionalUsers=userRepository.findAllByFirstname(firstname);

        if (optionalUsers.isPresent()){
            return optionalUsers.get();
        }
        throw new NoSuchElementException("user with firstname "+firstname+" does not exist");
    }

    @Override
    public Users findByLastname(String lastname) {
        Optional<Users> optionalUsers=userRepository.findAllByLastname(lastname);

        if (optionalUsers.isPresent()){
            return optionalUsers.get();
        }
        throw new NoSuchElementException("user with lastname "+lastname+ "does not exist");
    }

    @Override
    public List<Users> findAll() {
        return userRepository.findAll();
    }
}
