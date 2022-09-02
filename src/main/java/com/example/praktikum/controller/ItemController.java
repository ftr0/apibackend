package com.example.praktikum.controller;
import com.example.praktikum.model.*;
import com.example.praktikum.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("/item")


public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("/add")
    public String add(@RequestBody Item item)
    {
        itemService.saveItem(item);
        return "New Item";
    }

    @GetMapping("/getItems")
    public List<Item> getAllItems()
    {
        return itemService.getAllItems();
    }


    @PostMapping("/delete/{id}")
    public void deleteItem(@PathVariable (value = "id") int id)
    {
        itemService.delete(id);
    }


    @RequestMapping(method=RequestMethod.DELETE, value="/deletee/{id}")
    public void deleteTodo(@PathVariable int id)
    {
        itemService.delete(id);
    }

    @GetMapping("/findby/{id}")
    public Optional<Item> findItem(@PathVariable (value = "id") int id)
    {
        Optional<Item> itemResponse = itemService.findById(id);
        itemService.findById(id);
        return itemResponse;
    }

   

}

