import java.util.ArrayList;
import java.util.List;

public class CircularShifter {
    protected ArrayList<String> fullStrArr;
    protected String toIngore;
    protected String required;
    public CircularShifter(ArrayList<String> ls,String toIngore,String required){
        this.fullStrArr=ls;
        this.toIngore=toIngore;
        this.required=required;
}
    public void shift(ArrayList<String> orgStrList,ArrayList<String> fullStrArr ){

        String tempStrArr[];
        String tempStr,firstStr;
        int i,n,k;
        for (i=0;i<orgStrList.size();i++){
            tempStrArr=orgStrList.get(i).split(" ");
            if(tempStrArr.length>1) {
                n = 1;
                while (n < (tempStrArr.length + 1)) {
                    firstStr = tempStrArr[1];
                    for (k = 1; k < tempStrArr.length; k++) {
                        tempStr = tempStrArr[k - 1];
                        tempStrArr[k - 1] = tempStrArr[k];
                        tempStrArr[k] = tempStr;
                    }
                    if ((toIngore.equals("") | !toIngore.toLowerCase().contains("|" + firstStr.toLowerCase() + "|")) &
                            (required.equals("") | required.toLowerCase().contains("|" + firstStr.toLowerCase() + "|"))) {
                        tempStr = "";
                        for (k = 0; k < tempStrArr.length; k++) {
                            if (tempStr == "") tempStr = tempStrArr[k];
                            else tempStr = tempStr + " " + tempStrArr[k];
                        }
                        fullStrArr.add(tempStr);
                    }
                    n++;
                }
            }else{
                if ((toIngore.equals("") | !toIngore.toLowerCase().contains("|" + tempStrArr[0].toLowerCase() + "|")) &
                        (required.equals("") | required.toLowerCase().contains("|" + tempStrArr[0].toLowerCase() + "|")))
                    fullStrArr.add(tempStrArr[0]);

            }
        }
       this.fullStrArr=fullStrArr;
    }
}
