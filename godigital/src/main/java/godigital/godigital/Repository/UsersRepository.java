package godigital.godigital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import godigital.godigital.Model.User;

public interface UsersRepository extends JpaRepository<User, Long>{

	void update(User user);
    
}
