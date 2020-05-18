package ua.zp.bainacad.lab19;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayRoom {
    public static void main(String[] args) throws IOException {
        List<Game.GameDisk> diskArrayList = new ArrayList<Game.GameDisk>();
        diskArrayList.add(Game.getDisk("Avatar(2020)", Game.Genre.ACTION, "Avatar (2020) — это экшен, действие которого разворачивается на далекой планете, известной как Пандора. Игра создается по одноименной серии фильмов Джеймса Кэмерона, но к Avatar: The Game не имеет никакого отношения."));
        diskArrayList.add(Game.getDisk("Tony Hawk's Underground 2", Game.Genre.SPORT, "Tony Hawk's Underground 2 - шестая игра серии знаменитых экстремально-спортивных симуляторов.Сюжет игры рассказывает о проведении группой скейтбордистов во главе с Тони Хоуком Всемирного Тура Разрушения.Первая игра серии, в которой игроку было разрешено передвигаться пешком."));
        diskArrayList.add(Game.getDisk("NBA 2K15", Game.Genre.SPORT, "NBA 2K15 - это очередная часть бесконечного баскетбольного симулятора. NBA 2K15, на обложке которого красуется самый ценный игрок НБА сезона 2013-14 Кевин Дюрант, порадует фанатов баскетбола фотореалистичной графикой и выверенным до мелочей геймплеем."));
        diskArrayList.add(Game.getDisk("Need for Speed: Most Wanted", Game.Genre.RACE, "Need for Speed: Most Wanted - девятая игра серии аркадных гонок от Electronic Arts."));

        List<Game.VirtualGame> virtualGameArrayList = new ArrayList<Game.VirtualGame>();
        virtualGameArrayList.add(Game.getVirtualGame("FlatOut", Game.Genre.RACE));
        virtualGameArrayList.add(Game.getVirtualGame("Grand Theft Auto 5", Game.Genre.ACTION));
        virtualGameArrayList.add(Game.getVirtualGame("Assassin's Creed 2", Game.Genre.ACTION));
        virtualGameArrayList.add(Game.getVirtualGame("FIFA 12", Game.Genre.SPORT));

        GameConsole gameConsole = new GameConsole("Sony", "XC123QeWR");

        ((GameConsole.Gamepad)gameConsole.getSecondGamepad()).powerOn();

        gameConsole.loadGame(diskArrayList.get(1).getData());
        gameConsole.playGame();

        ((GameConsole.Gamepad)gameConsole.getFirstGamepad()).powerOn();

        gameConsole.loadGame(virtualGameArrayList.get(3).getData());
        gameConsole.playGame();
        System.out.println();
        while (true) {
            someDo(gameConsole);
        }

    }

    public static void someDo(GameConsole gameConsole){
        System.out.println("Что будем делать? (Помощь введите \"?\")");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        switch (str.toLowerCase()) {
            case "1":
                ((GameConsole.Gamepad)gameConsole.getFirstGamepad()).powerOn();
                break;
            case "2":
                ((GameConsole.Gamepad)gameConsole.getSecondGamepad()).powerOn();
                break;
            case "con":
                gameConsole.powerOn();
                break;
            case "?":
                System.out.println("1 - включение/выключение первого ждойстика");
                System.out.println("2 - включение/выключение второго ждойстика");
                System.out.println("con - включение/выключение консоли");
                System.out.println("ld - список игровых дисков (для выбора)");
                System.out.println("lм - список виртуальный игр (для выбора)");

                break;
            default:
                System.out.println("Что-то пошло не так. Воспользуйтесь помощью.");
                break;
        }
    }
}