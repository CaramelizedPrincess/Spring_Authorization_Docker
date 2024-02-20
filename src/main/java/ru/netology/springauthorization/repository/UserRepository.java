package ru.netology.springauthorization.repository;

import org.springframework.stereotype.Repository;

import java.util.*;



@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("Alla") && password.equals("123456")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("Semen") && password.equals("654321")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        }
        else if (user.equals("Pete") && password.equals("654321")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        }return authorities;
    }
}
