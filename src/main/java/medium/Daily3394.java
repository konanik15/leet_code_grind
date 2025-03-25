package medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Daily3394 {

    record Range(int start, int finish) {
    }

    public boolean checkValidCuts(int n, int[][] rectangles) {
        List<Range> arrayHorizontal = new ArrayList<>();
        List<Range> arrayVertical = new ArrayList<>();

        for (int[] rectangle : rectangles) {
            int startX = rectangle[0];
            int startY = rectangle[1];
            int endX = rectangle[2];
            int endY = rectangle[3];

            arrayVertical.add(new Range(startY, endY));
            arrayHorizontal.add(new Range(startX, endX));
        }
        return mergeOverlap(arrayHorizontal).size() >= 3 || mergeOverlap(arrayVertical).size() >= 3;
    }

    private List<Range> mergeOverlap(List<Range> ranges) {
        ranges.sort(Comparator.comparingInt(o -> o.start));
        List<Range> result = new ArrayList<>();
        result.add(ranges.getFirst());

        for (int i = 1; i < ranges.size(); i++) {
            Range last = result.getLast();
            Range current = ranges.get(i);

            if (current.start < last.finish) {
                result.set(result.size() - 1, new Range(last.start, Math.max(current.finish, last.finish)));
            } else result.add(current);

        }
        return result;
    }


    // This Solution is valid but memory inefficient
    // public boolean checkValidCuts(int n, int[][] rectangles) {
    //     boolean[] available = new boolean[n-1];
    //
    //     int furtherToLeftVertical = n-1;
    //     int furtherToRightVertical = 0;
    //     int furtherToUpHorizontal = 0;
    //     int furtherToDownHorizontal = n-1;
    //
    //
    //     for (int[] rectangle : rectangles) {
    //         int startX = rectangle[0];
    //         int endX = rectangle[2];
    //         furtherToLeftVertical = Math.min(furtherToLeftVertical, endX);
    //         furtherToRightVertical = Math.max(furtherToRightVertical, startX);
    //
    //         exclude(startX, endX, available);
    //     }
    //
    //     int foundX = 0;
    //     for(int j = 0; j < available.length; j++){
    //         if(!available[j]){
    //             if(foundX==0 && j +1 >= furtherToLeftVertical){
    //                 foundX = j+1;
    //             }else if(j +1 <= furtherToRightVertical && edgeIsValid(rectangles,j+1, foundX,2)) {
    //                 return true;
    //             }
    //         }
    //     }
    //
    //     available =  new boolean[n-1];
    //
    //     for(int[] rectangle : rectangles) {
    //         int startY = rectangle[1];
    //         int endY = rectangle[3];
    //         furtherToUpHorizontal = Math.max(furtherToUpHorizontal, startY);
    //         furtherToDownHorizontal = Math.min(furtherToDownHorizontal, endY);
    //         exclude(startY, endY, available);
    //     }
    //
    //     int foundY = 0;
    //     for(int j = 0; j < available.length; j++){
    //         if(!available[j]){
    //             if(foundY==0 && j +1 >= furtherToDownHorizontal){
    //                 foundY = j+1;
    //             }else if(j +1 <= furtherToUpHorizontal && edgeIsValid(rectangles,j+1,foundY,3)) {
    //                 return true;
    //             }
    //         }
    //     }
    //
    //     return false;
    // }
    //
    // private boolean edgeIsValid(int[][] rectangles, int j, int found,int searchIndex) {
    //     for (int[] rectangle : rectangles) {
    //         int endY = rectangle[searchIndex];
    //         if (endY > found && endY <= j) return true;
    //     }
    //     return  false;
    // }
    //
    // private void exclude(int startx, int endx, boolean[] available) {
    //     for(int x =startx+1; x< endx;x++){
    //         available[x-1] = true;
    //     }
    // }
}
