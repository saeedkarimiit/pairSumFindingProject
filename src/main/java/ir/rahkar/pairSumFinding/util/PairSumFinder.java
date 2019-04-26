package ir.rahkar.pairSumFinding.util;

import java.util.ArrayList;
import java.util.HashSet;

public class PairSumFinder {

    private static PairSumFinder pairSumFinder = null;
    private HashSet<Integer> checkHashSet;
    private HashSet<Pairs> outPutHashSet;


    public static PairSumFinder getInstance(){
        if (pairSumFinder == null)
            pairSumFinder = new PairSumFinder();
        return pairSumFinder;
    }

    public HashSet<Pairs> findPairSum(ArrayList<Integer> inputArray,int m){
        int diff;
        if (checkHashSet==null)
            checkHashSet = new HashSet<>();
        else
            checkHashSet.clear();
        if (outPutHashSet==null)
            outPutHashSet = new HashSet<>();
        else
            outPutHashSet.clear();

        for (int i=0; i<inputArray.size();i++){
            if (inputArray.get(i) > m)
                break;
            else {
                diff = m - inputArray.get(i);
                if (checkHashSet.contains(diff))
                    outPutHashSet.add(new Pairs(diff,inputArray.get(i)));
                else
                    checkHashSet.add(inputArray.get(i));
            }
        }
        return outPutHashSet;
    }


    public class Pairs{
        private int x;
        private int y;

        Pairs(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
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
    }
}
