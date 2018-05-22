package Bartosz.wieczorek;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] stringArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        //ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doublevalue = new Double(12.14);


        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0;i<=10;i++) {
            intArrayList.add(Integer.valueOf(i));  //Boxing
        }

        for(int i=0;i<=10;i++) {
            System.out.println(i+" ---> " + intArrayList.get(i).intValue()); //Unboxing
        }


        Integer myIntValue = 56;
        int myInt = myIntValue.intValue();

        ArrayList<Double> myDoublevalues = new ArrayList<Double>();

        for(double dbl=0.0;dbl<=10.0;dbl+=0.5) {
            myDoublevalues.add(Double.valueOf(dbl));
        }

        for(int i=0; i<myDoublevalues.size();i++) {
            double value = myDoublevalues.get(i).doubleValue();
            System.out.println(i+ " ---> " + value);
        }
    }
}
