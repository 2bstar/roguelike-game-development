/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roguelike_game.entity;

import roguelike_game.graphics.Sprite;

/**
 *
 * @author andyafw
 */
public class Player extends Mob {    
    public Player(int x, int y, Sprite sprite) {
        super(x, y);
        setSprite(sprite);
    }
}
