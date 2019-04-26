package ir.rahkar.pairSumFinding;

import ir.rahkar.pairSumFinding.util.PairSumFinder;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(18);
        arrayList.add(19);

        HashSet<PairSumFinder.Pairs> hashSet =  PairSumFinder.getInstance().findPairSum(arrayList,10);
        hashSet.forEach(System.out::println);

    }
}
