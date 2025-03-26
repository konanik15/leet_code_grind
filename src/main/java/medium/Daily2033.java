package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Daily2033 {

    // Median for the win
    public int minOperations(int[][] grid, int x) {
        List<Integer> numberList = new ArrayList<>();
        int expectedModulo = grid[0][0] % x;

        for (int[] line : grid) {
            for (int number : line) {
                if (number % x == expectedModulo) {
                    numberList.add(number);
                } else {
                    return -1;
                }
            }
        }
        Collections.sort(numberList);
        int operations = 0;
        int median = numberList.get(numberList.size() / 2);

        for (int number : numberList) {
            if (number != median) operations += (Math.abs(median - number) / x);
        }

        return operations;
    }

    // TOO SLOOW!!
    // public int minOperations(int[][] grid, int x) {
    //
    //     List<Integer> numberList = new ArrayList<>();
    //     int expectedModulo = grid[0][0] % x;
    //     int sum = 0;
    //
    //     for(int[] line : grid){
    //         for(int number : line){
    //             if(number%x == expectedModulo) {
    //                 numberList.add(number);
    //                 sum += number;
    //             }
    //             else {
    //                 return -1;
    //             }
    //         }
    //     }
    //
    //     double avg = (double) sum /numberList.size();
    //     int operations =0;
    //     double biggestDistance=0;
    //     int biggestDistanceIndex=0;
    //
    //
    //     while (true) {
    //         biggestDistance=0;
    //         // find the biggest distance
    //         for(int i=0;i< numberList.size();i++){
    //             double distance = Math.abs((double) numberList.get(i)-avg);
    //             if(distance > biggestDistance) {
    //                 biggestDistance = distance;
    //                 biggestDistanceIndex = i;
    //             }
    //         }
    //         if(biggestDistance == 0) return operations;
    //         int operationNumber = numberList.get(biggestDistanceIndex);
    //
    //         if (operationNumber > avg) {
    //             sum-=x;
    //             double newAvg = (double) sum / numberList.size() ;
    //             // System.out.println("Subtracting  from " + operationNumber + " result=" + (operationNumber - x) + " avg changed from " + avg + " to " + newAvg);
    //             numberList.set(biggestDistanceIndex,operationNumber-x);
    //             avg = newAvg;
    //         }else {
    //             sum+=x;
    //             double newAvg = (double) sum / numberList.size();
    //             // System.out.println("Adding to " + operationNumber + " result=" + (operationNumber + x) + " avg changed from " + avg + " to " + newAvg);
    //             numberList.set(biggestDistanceIndex,operationNumber+x);
    //             avg = newAvg;
    //         }
    //         operations++;
    //     }
    //
    // }
}
