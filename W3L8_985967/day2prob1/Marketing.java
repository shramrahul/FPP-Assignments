package day2prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Marketing {
    String employeeName;
    String productname;
    double salesamount;

    public Marketing(String employeeName, String productname, double salesamount) {
        this.employeeName = employeeName;
        this.productname = productname;
        this.salesamount = salesamount;

    }

    @Override
    public String toString() {
        return "\n"+employeeName  +" "+productname + " " +salesamount ;
    }

    private static final class MarketingComparator implements Comparator<Marketing>{

        @Override
        public int compare(Marketing o1, Marketing o2) {
            if(o1.salesamount!=o2.salesamount){
                return Double.valueOf(o1.salesamount).compareTo(Double.valueOf(o2.salesamount));
            }else if(!(o1.productname.equalsIgnoreCase(o2.productname))){
                return o1.productname.compareTo(o2.productname);
            }
            return o1.employeeName.compareTo(o2.employeeName);
        }
    }

    public static class ListMoreThan1000 implements Comparator<Marketing>{

        @Override
        public int compare(Marketing o1, Marketing o2) {
            if(o1.salesamount>=1000 || o2.salesamount>=1000){
                return Double.valueOf(o1.salesamount).compareTo(Double.valueOf(o2.salesamount));
            }
            return 0;
        }
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list){
        Collections.sort(list,new ListMoreThan1000());
        return list;
    }

    public static void main(String[] args){
        List<Marketing>list= new ArrayList<>();

        //adding items in the list
        list.add(new Marketing("Shreeram","Laptop",5000));
        list.add(new Marketing("Harry","Watch",300));
        list.add(new Marketing("Sima","iMac",2200));
        list.add(new Marketing("David","iphone",999));
        list.add(new Marketing("ming","samgung",400));
        list.add(new Marketing("Hari","Laptop",5000));
        list.add(new Marketing("Dev","Watch",300));
        list.add(new Marketing("malvika","lenovo",2200));

        //removing any objects
        list.remove(2);

        //inserting elements using set()
        list.set(2,new Marketing("Hello","total",3456));

        System.out.println(list.size());

        System.out.println(list.toString());

        System.out.println("\nsorting the employees whose sales amount is greater than $1000\n"+listMoreThan1000(list));

        Collections.sort(list,new MarketingComparator());
        System.out.println("After sorting\n"+list);



    }
}

/*
//output
//
//        7
//        [
//        Shreeram Laptop 5000.0,
//        Harry Watch 300.0,
//        Hello total 3456.0,
//        ming samgung 400.0,
//        Hari Laptop 5000.0,
//        Dev Watch 300.0,
//        malvika lenovo 2200.0]
//
//        sorting the employees whose sales amount is greater than $1000
//        [
//        Harry Watch 300.0,
//        ming samgung 400.0,
//        Dev Watch 300.0,
//        malvika lenovo 2200.0,
//        Hello total 3456.0,
//        Shreeram Laptop 5000.0,
//        Hari Laptop 5000.0]
//        After sorting
//        [
//        Dev Watch 300.0,
//        Harry Watch 300.0,
//        ming samgung 400.0,
//        malvika lenovo 2200.0,
//        Hello total 3456.0,
//        Hari Laptop 5000.0,
//        Shreeram Laptop 5000.0]

*/