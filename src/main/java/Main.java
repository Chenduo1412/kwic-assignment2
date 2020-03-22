import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        new Main().run();

    }
    public void run(){
        ArrayList<String>ls = new ArrayList<String>();
        ArrayList<String> fullStrArr =  new ArrayList<String>();
        String toIngore;
        String required;
        Input input=new Input(ls);
        input.input();
        toIngore=input.getIngore();
        required=input.getRequired();

        CircularShifter cs=new CircularShifter(ls,toIngore,required);
        cs.shift(ls,fullStrArr);

        Alphabetizer alp=new Alphabetizer(fullStrArr);
        alp.alpha();

        Output output=new Output(fullStrArr);
        output.output("D:\\output.txt");
    }
}
