package com.example.praktikum.service;

import com.example.praktikum.model.*;
import java.util.List;
import java.util.Optional;

public interface ItemService
{
    public Item saveItem(Item item);

    List<Item> getAllItems();

    public void delete(int id);

    Optional<Item> findById(int id);


}
