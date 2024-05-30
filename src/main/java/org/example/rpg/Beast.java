package org.example.rpg;

public class Beast extends Monster implements Bleedable,Poisonable{
    public Beast(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * .25;
    }

    @Override
    public double poison() {
        return getDamage() * .3;
    }
}
