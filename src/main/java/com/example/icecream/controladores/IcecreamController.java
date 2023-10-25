package com.example.icecream.controladores;

import com.example.icecream.dao.IcecreamDao;
import com.example.icecream.modelos.Icecream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IcecreamController {

    @Autowired
    private IcecreamDao icecreamDao;

    @RequestMapping(value = "icecream", method = RequestMethod.GET)
    public List<Icecream> getIcecreams(){
        return icecreamDao.getIcecream();
    }

    @RequestMapping(value = "icecream/{id}", method = RequestMethod.GET)
    public Icecream getIcecreamById(@PathVariable int id){
        return icecreamDao.getIcecreamById(id);
    }

    @RequestMapping(value = "icecream/{id}", method = RequestMethod.DELETE)
    public void deleteIcecream(@PathVariable int id){
        icecreamDao.delete(id);
    }

    @RequestMapping(value = "icecream", method = RequestMethod.POST)
    public void setIcecream(@RequestBody Icecream ice){
        icecreamDao.setIcecream(ice);
    }

    @RequestMapping(value = "icecream/{id}", method = RequestMethod.PUT)
    public void updateIcecream(@PathVariable int id, @RequestBody Icecream ice){
        icecreamDao.updateIcecream(id, ice);
    }
}
