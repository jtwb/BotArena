/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package botarena;

/**
 *
 * @author Lucas Hereld <duckman@piratehook.com>
 */
public class BotArenaMainSQLite
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        BotArena bots = new BotArena();
        new Thread(bots).start();
        Runtime.getRuntime().addShutdownHook(new ShutdownListener(bots));
    }
}
