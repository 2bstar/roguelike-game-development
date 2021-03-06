/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roguelike_game.entity.item;

import java.awt.Graphics;
import roguelike_game.graphics.Sprite;

/**
 *
 * @author andyafw
 */
public class Item {
    public static WeaponItem SWORD = new WeaponItem(Sprite.SWORD, 0, 100);
    public static Item WAND = new Item(Item.Type.ITEM, Sprite.WAND);
    
    public static Item weapon2 = new Item(Item.Type.WEAPON, Sprite.WEAPON);
    
    protected int x, y;
    protected Sprite sprite;
    public enum Type {ITEM, WEAPON};
    
    protected Type type;
    
    public Item(Type type, Sprite sprite) {
        this.sprite = sprite;
        this.type = type;
    }
    
    public Type getType() {
        return type;
    }
    
    public void setType(Type type) {
        this.type = type;
    }
    
    public Sprite getSprite() {
        return sprite;
    }
    
    public void render(Graphics g, int xscroll, int yscroll) {
        if(sprite.getImage() != null) {
            g.drawImage(sprite.getImage(), x * sprite.width, y * sprite.height, sprite.width, sprite.height, null);
        }
    }
}