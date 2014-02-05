package edu.macalester.comp124.baylor.loops;

import java.util.LinkedList;
import java.util.List;

public class Pound
{
//    Puppy[] puppies = new Puppy[10];
    public List<Puppy> puppies = new LinkedList<Puppy>();

    public double getMeanHeight()
    {
        int total = 0;
        // add together
//        for( start at ;  keep going while  ;  do this at end of each iteration)
        for(int i=0; i < puppies.size(); i++)
        {
            Puppy aPuppy = puppies.get(i);
            total += aPuppy.shoulderHeight;
        }

        // divide by number
        double mean = total / (double)puppies.size();

        return mean;
    }

    public double getMeanWeight()
    {
        double total = 0;
        for (int i=0; i < puppies.size(); i++)
        {
            Puppy aPuppy = puppies.get(i);
            total += aPuppy.weight;
        }

        return (total / puppies.size());
    }

    public double getMeanCuteness()
    {
        int total = 0;
        for (int i=0; i<puppies.size(); i++)
        {
            Puppy aPuppy = puppies.get(i);
            total += aPuppy.cuteness;
        }
        double mean = total / (double)puppies.size();
        return mean;
    }
}
