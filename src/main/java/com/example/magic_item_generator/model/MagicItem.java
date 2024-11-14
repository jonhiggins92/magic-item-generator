package com.example.magic_item_generator.model;

public class MagicItem {
    private String name;
    private String rarity;
    private String type;
    private String effect;
    private String description;

    // Constructor
    public MagicItem(String name, String rarity, String type, String effect, String description) {
        this.name = name;
        this.rarity = rarity;
        this.type = type;
        this.effect = effect;
        this.description = description;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRarity() { return rarity; }
    public void setRarity(String rarity) { this.rarity = rarity; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getEffect() { return effect; }
    public void setEffect(String effect) { this.effect = effect; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
