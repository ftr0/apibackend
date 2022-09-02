package com.example.praktikum.service;

import com.example.praktikum.model.*;
import com.example.praktikum.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImplementation implements ItemService{

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item saveItem(Item item)
    {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getAllItems()
    {
        return itemRepository.findAll();
    }

    @Override
    public void delete(int id)
    {
        this.itemRepository.deleteById(id);
    }

    @Override
    public Optional < Item > findById(int id) {
        return itemRepository.findById(id);
    }


    public Item getStudent(int id ) {
        Optional<Item> itemResponse =  itemRepository.findById(id);
        Item item = itemResponse.get();
        return item;
    }



}
