import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            return fileData;
        }
    }
    private static void makeRooms(){
        String floors[] = {"B", "1", "2", "3", "4", "5", "6", "7", "8"};
        String wings[] = {"N", "S", "E", "W"};
        int roomNum [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int id = 1;

        for (String floor : floors){
            for (String wing: wings){
                for (int num : roomNum){
                    String combination = floor+wing+num;
                    System.out.println("INSERT INTO Rooms (r_id, room) VALUES (" + id + "," + combination + ");");
                    Room room = new Room(floor, wing, num, id);
                    System.out.println(room.getCombo());
                    id++;
                }
            }
        }


    }

    private static void makeAssignmentTypes(){
        String AssignTypes[] = {"Major", "Minor"};
        for (int i = 1; i<=AssignTypes.length; i++){
            AssignmentType assignment = new AssignmentType(i, AssignTypes[i-1]);
            System.out.println(assignment.getId());
            System.out.println(assignment.getType());
            System.out.println("INSERT INTO Assignment_Type(as_type_id, Assignment_Type_Name) VALUES (" + i + "," + assignment.getType() + ");");
        }

    }

    public static void makeCourseTypes(){
        String CourseTypes[] = {"AP", "Elective", "Regents"};
        for(int i = 1; i<= CourseTypes.length; i++){
            CourseType courseType = new CourseType(i, CourseTypes[i-1]);
            System.out.println(courseType.getId());
            System.out.println(courseType.getType());
            System.out.println("INSERT INTO Course_Type(as_type_id, Assignment_Type_Name) VALUES (" + i + "," + courseType.getType() + ");");
        }

    }

    public static void separateNames(ArrayList<String> data){
        for (int i = 0; i < data.size(); i++){
            if (data.get(i).contains(" ")){
                int firstSpace = data.get(i).indexOf(" ");
            }

        }

    }


    public static void makePeople(){


    }

    public static void main(String[] args) {
        ArrayList<String> fileData = getFileData("DataPopulate/src/Teachers.txt");
        separateNames(fileData);
    }
}
