package com.example.icecream.dao;

import com.example.icecream.modelos.Icecream;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
//import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class IcecreamDaoImp implements IcecreamDao{

    @PersistenceContext
    private EntityManager entityManager;

    // Regresa todos los helados de la BD
    @Override
    public List<Icecream> getIcecream() {
        String query = "FROM Icecream";

        return entityManager.createQuery(query).getResultList();
    }

    // Borra un helado de la BD
    @Override
    public void delete(int id) {
        Icecream icecream = entityManager.find(Icecream.class, id);
        entityManager.remove(icecream);
    }

    // Agrega un helado a la BD
    @Override
    public void setIcecream(Icecream icecream) {
        entityManager.merge(icecream);
    }

    // Regresa solo un helado buscado por su ID
    @Override
    public Icecream getIcecreamById(int id) {
        return entityManager.find(Icecream.class, id);
    }

    @Override
    public void updateIcecream(int id, Icecream icecream) {
        Icecream ice = entityManager.find(Icecream.class, id);

        if(ice != null){
            ice.setFlavor(icecream.getFlavor());
        }
    }


}
