package au.com.onik.service;

import au.com.onik.domain.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UserService {

    @PersistenceContext(unitName = "test")
    private EntityManager em;

    public List<User> listAll() {
        return em.createQuery("SELECT u from User as u").getResultList();
    }
}
