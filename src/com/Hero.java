package com;

public class Hero {
    private String heroesAttakType;
    private int heroesDamage;
    private int heroesHealth;

    public String getHeroesAttakType() {
        return heroesAttakType;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public Hero (String heroesAttakType, int heroesHealth, int heroesDamage){
        this.heroesAttakType=heroesAttakType;
        this.heroesHealth=heroesHealth;
        this.heroesDamage=heroesDamage;

    }
    public  Hero (int heroesDamage, int heroesHealth) {
        this.heroesDamage=heroesDamage;
        this.heroesHealth=heroesHealth;
    }



}
