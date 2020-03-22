import java.util.ArrayList;
import java.util.List;

public class Alphabetizer {
    public ArrayList<String> ls;
    public Alphabetizer(ArrayList<String> ls){
        this.ls=ls;
}

    public void alpha(){
        quickSort(ls, 1,  ls.size() - 1, 0, ls.size());
    }
    public void quickSort(List<String> fullStrArr, int i, int j, int pivotIndex, int length){
        int m,n, middleIndex=0;
        String pivot=fullStrArr.get(pivotIndex),tempValue;
        int start=i-1, end=j;
        if(start==end)return;
        while(i<j ) {
            if (fullStrArr.get(i).toLowerCase().compareTo(pivot.toLowerCase())>=0 & fullStrArr.get(j).toLowerCase().compareTo(pivot.toLowerCase()) < 0) {
                tempValue = fullStrArr.get(i);
                fullStrArr.set(i,fullStrArr.get(j));
                fullStrArr.set(j,tempValue);
                i++; j--;
            } else if ((fullStrArr.get(i).toLowerCase().compareTo(pivot.toLowerCase())<0) & (fullStrArr.get(j).toLowerCase().compareTo(pivot.toLowerCase())<0)) {
                i++;
            } else if ((fullStrArr.get(i).toLowerCase().compareTo(pivot.toLowerCase())>=0) & (fullStrArr.get(j).toLowerCase().compareTo(pivot.toLowerCase())>=0)) {
                j--;
            }
            else j--;
        }
        if(i>= j){
            if(fullStrArr.get(j).toLowerCase().compareTo(pivot.toLowerCase())<0){
                tempValue =fullStrArr.get(pivotIndex);
                fullStrArr.set(pivotIndex,fullStrArr.get(j));
                fullStrArr.set(j,tempValue);
                middleIndex=j;
            }
            else{
                tempValue =fullStrArr.get(pivotIndex);
                fullStrArr.set(pivotIndex,fullStrArr.get(j-1));
                fullStrArr.set(j-1,tempValue);
                middleIndex=j-1;
            }
        }
        if(middleIndex<end)
            quickSort(fullStrArr, middleIndex+2, end, middleIndex+1,length);
        if(middleIndex>start)
            quickSort(fullStrArr, start+1, middleIndex-1,  start,length);
    }
}

