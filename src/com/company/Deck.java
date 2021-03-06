package com.company;

import java.util.ArrayList;

public class Deck
{

    private ArrayList<Card> unDealt;

    public Deck(String[] rank, String[] suit, int[] pointValue)
    {
        int possibilities = rank.length * suit.length * pointValue.length;
        for(int i = 0; i < possibilities; i++)
        {
            Card addition = new Card(rank[(int)(Math.random()*rank.length)],suit[(int)(Math.random()*rank.length)],pointValue[(int)(Math.random()*rank.length)]);
            unDealt.add(addition);
        }
    }

    public boolean isEmpty()
    {
        if(unDealt.size() == 0)
        {
            return true;
        }
        return false;
    }

    public int size()
    {
        return unDealt.size();
    }

    public Card deal()
    {
        Card val = unDealt.get(unDealt.size() - 1);
        unDealt.remove(unDealt.size() - 1);
        return val;
    }
}
