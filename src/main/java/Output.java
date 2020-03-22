import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Output {
    public ArrayList<String> ls;
    public Output(ArrayList<String> ls){
        this.ls=ls;
    }
    public void output(String outputAddress){

        FileWriter fw = null;
        try {
            fw = new FileWriter(outputAddress);
        } catch (IOException e) {
            // TODO Auto-generated catch block      e.printStackTrace();
        }
        BufferedWriter bw=new BufferedWriter(fw);

        for(int i=0;i<ls.size();i++){

            try {
                bw.write(ls.get(i));
                bw.newLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block       e.printStackTrace();
            }
        }
        try {
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block      e.printStackTrace();
        }
    }

}

