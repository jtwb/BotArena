/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package botarena;

import java.util.Random;

/**
 *
 * @author lucashereld
 */
public enum Direction
{
    UP,
    DOWN,
    LEFT,
    RIGHT;

    public static Direction random()
    {
        Random rand = new Random();

        return Direction.values()[rand.nextInt(4)];
    }
}