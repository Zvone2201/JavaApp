package ba.sum.fpmoz.javaapp.repositories;

import ba.sum.fpmoz.javaapp.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

    public AppUser findByEmail(String email);
}
