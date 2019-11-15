package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selectionRight(Integer startIndex, String selection){
        int index = startIndex;
        for(int i = 0; i <playList.length / 2; i++){
           if(playList[index].equals(selection)){
               return i;
           }
             index++;
           if(index == playList.length) {
               index = 0;
           }


        }

        return playList.length/2;
    }
    public Integer selectionLeft (Integer startIndex, String selection){
        int index = startIndex;
        for(int i = 0 ; i <playList.length / 2; i++){
            if (playList[index].equals(selection)){
                return i;
            }
                index--;
            if(index == -1){
                index = playList.length -1;
            }
        }
        return playList.length / 2;
    }

    public Integer selection (Integer startIndex, String selection){
        Integer right = selectionRight(startIndex, selection);
        Integer left = selectionLeft(startIndex, selection);
        if(right < left){
            return right;
        }
        return left;
    }
}
