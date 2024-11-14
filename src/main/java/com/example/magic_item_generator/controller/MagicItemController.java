package com.example.magic_item_generator.controller;

import com.example.magic_item_generator.model.MagicItem;
import com.example.magic_item_generator.service.MagicItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class MagicItemController {

    @Autowired
    private MagicItemService magicItemService;

    @GetMapping
    public List<MagicItem> getAllItems() {
        return magicItemService.getAllItems();
    }

    @GetMapping("/random")
    public MagicItem getRandomItem() {
        return magicItemService.getRandomItem();
    }

    @GetMapping(params = "rarity")
    public List<MagicItem> getItemsByRarity(@RequestParam String rarity) {
        return magicItemService.getItemsByRarity(rarity);
    }

    @GetMapping("/")
    public String index() {
        return "index"; // Refers to index.html in the templates folder
    }


}
