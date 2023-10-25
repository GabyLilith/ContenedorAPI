package com.example.icecream.dao;

import com.example.icecream.modelos.Icecream;

import java.util.List;

public interface IcecreamDao {

    List<Icecream> getIcecream();

    void delete(int id);

    void setIcecream(Icecream icecream);

    Icecream getIcecreamById(int id);

    void updateIcecream(int id, Icecream icecream);


}
