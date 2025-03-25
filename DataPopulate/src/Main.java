import java.util.Random;
public class Main {
    private static void makeRooms(){
        String floors[] = {"B", "1", "2", "3", "4", "5", "6", "7", "8"};
        String wings[] = {"N", "S", "E", "W"};
        int roomNum [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int id = 0;

        for (String floor : floors){
            for (String wing: wings){
                for (int num : roomNum){
                    String combination = floor+wing+num;
                    System.out.println("INSERT INTO Rooms (r_id, room) VALUES (" + id + "," + combination + ");");
                    Room room = new Room()
                    id++;
                }
            }
        }


    }


    private static void makeAssignmentTypes(){


    }
    public static void main(String[] args) {
        makeRooms();
    }
}
