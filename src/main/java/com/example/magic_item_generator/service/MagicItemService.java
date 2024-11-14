package com.example.magic_item_generator.service;

import com.example.magic_item_generator.model.MagicItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class MagicItemService {
    private final List<MagicItem> items = new ArrayList<>();

    public MagicItemService() {
        items.add(new MagicItem("Sword of Eternal Flame", "Rare", "Weapon", "Deals 1d6 fire damage.", "Forged in the heart of a volcano."));
        items.add(new MagicItem("Cloak of Shadows", "Uncommon", "Armor", "Grants +2 to stealth rolls.", "Woven from the threads of darkness."));
        items.add(new MagicItem("Potion of Giant Strength", "Common", "Potion", "Increases Strength by 5 for 1 hour.", "Brewed with the essence of a hill giant."));
    }

    public List<MagicItem> getAllItems() {
        return items;
    }

    public List<MagicItem> getItemsByRarity(String rarity) {
        List<MagicItem> filtered = new ArrayList<>();
        for (MagicItem item : items) {
            if (item.getRarity().equalsIgnoreCase(rarity)) {
                filtered.add(item);
            }
        }
        return filtered;
    }

    public MagicItem getRandomItem() {
        Random random = new Random();
        return items.get(random.nextInt(items.size()));
    }
}