/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roguelike_game.entity;

import java.awt.Graphics;
import roguelike_game.TileMap;
import roguelike_game.graphics.Sprite;

/**
 *
 * @author andyafw
 */
public class Player {
    private int x;
    private int y;
    private int size;
    private Sprite sprite;
    private TileMap map;
    
    public Player(int x, int y, int size, Sprite sprite, TileMap map) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.sprite = sprite;
        this.map = map;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }
    
    public void render(Graphics g, int scrollx, int scrolly) {
        g.drawImage(sprite.getImage(), x * size - scrollx, y * size - scrolly, size, size, null);
    }
}
