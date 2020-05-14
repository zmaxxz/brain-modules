package ua.zp.bainacad.lab19;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
        System.out.println();

    }
}