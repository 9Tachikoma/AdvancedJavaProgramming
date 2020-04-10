import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List of buildings
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);

        // List of offices
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        //printBuildings(offices);quicker and  simpler solution is to use wildcards

        // List of houses
        List<House> houses = new ArrayList();
        houses.add(new House());
        houses.add(new House());
        //printBuildings(houses);

//        addHouseToList(houses);
//        addHouseToList(buildings);
    }


    static void printBuildings(List<? extends  Building> buildings) {//invariables
        for (int i = 0;i < buildings.size(); i++ ) {
            System.out.println(buildings.get(i).toString() + " " + (i+1));
        }
        System.out.println();
    }

    static void addHouseToList(List<? super House> buildings){//现在可以加入building了 理解成outvariables时使用super-using the method to give additional data by adding to the list
        buildings.add(new House());
        System.out.println();
    }
}

