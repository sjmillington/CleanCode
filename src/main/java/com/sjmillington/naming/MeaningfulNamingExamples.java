package com.sjmillington.naming;

import java.util.ArrayList;
import java.util.List;

public class MeaningfulNamingExamples {

    private List<int[]> theList = new ArrayList<>();

    //WTF does this do?
    public List<int[]> getThem(){
        List<int[]> list1 = new ArrayList<>();
        for(int[] x : theList){
            if(x[0] == 4){
                list1.add(x);
            }
        }
        return list1;
    }

    private final static int STATUS_VALUE = 0;
    private final static int FLAGGED = 4;
    private List<int[]> theGameboard = new ArrayList<>();

    //A better example
    public List<int[]> getFlaggedCells(){
        List<int[]> flaggedCells = new ArrayList<>();
        for(int[] x : theGameboard){
            if(x[STATUS_VALUE] == FLAGGED){
                flaggedCells.add(x);
            }
        }
        return flaggedCells;
    }

    private List<Cell> myGameboard = new ArrayList<>();

    //Even better - why use int[] and keep the flagged logic in the function:
    public List<Cell> getFlaggedCells2(){
        List<Cell> flaggedCells = new ArrayList<>();
        for(Cell cell : myGameboard){
            if(cell.isFlagged()){
                flaggedCells.add(cell);
            }
        }
        return flaggedCells;
    }

    public int searchableNamesExample(){
        int realDaysPerIdealDay = 4;
        final int WORK_DAYS_PER_WEEK = 5;
        final int NUMBER_OF_TASKS = 34;
        int[] taskEstimate = new int[NUMBER_OF_TASKS];

        //define task estimates

        int sum = 0;
        for(int j = 0; j < NUMBER_OF_TASKS; j++){
            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            int realTaskWeeks = (realTaskDays/WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }

        return sum;
    }


}
