package com.toocol.ssh.core.cache;

/**
 * @author ：JoeZane (joezane.cn@gmail.com)
 * @date: 2022/4/1 0:08
 * @version: 0.0.1
 */
public class Cache {

    public volatile static String CURRENT_COMMAND = "";

    public volatile static boolean HANGED_QUIT = false;

    public volatile static boolean HANGED_ENTER = false;
}
