package com.example.pokemons;

import androidx.annotation.NonNull;

public class PokemonItemContent {
    private int imageId;
    private String name;
    private int hp;
    private int number;

    public PokemonItemContent() {
    }

    public int getImageId() {
        return this.imageId;
    }

    public void setImageId(int imageId) {
        System.out.println("set image id");
        this.imageId = imageId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
