import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] Bantha = {25,3,4,7,9,1,10,99,65,32,75};

        System.out.println("The Harmonia is equal to "+ Harmonia(Bantha));


    }

    public static double Harmonia(int[] Sail){
        double Total = 0;
        int amount = Sail.length;


        for(int a = 0; a<Sail.length;a++){
            Total += (double) (1/Sail[a]);
        }

        double NewDesign;
        NewDesign = (double)amount/Total;

        return NewDesign;
    }
}