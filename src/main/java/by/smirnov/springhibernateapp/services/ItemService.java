package by.smirnov.springhibernateapp.services;

import by.smirnov.springhibernateapp.models.Item;
import by.smirnov.springhibernateapp.models.Person;
import by.smirnov.springhibernateapp.repositories.ItemsRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ItemService {

    private final ItemsRepository itemsRepository;

    public List<Item> findByItemName(String itemName){
        return itemsRepository.findByItemName(itemName);
    }

    public List<Item> findByOwner(Person owner){
        return itemsRepository.findByOwner(owner);
    }


}
