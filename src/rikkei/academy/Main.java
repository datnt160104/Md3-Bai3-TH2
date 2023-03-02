package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] Student={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a name's student");
        String input_name = scanner.nextLine();
        boolean isExist= false;
        for (int i=0;i<Student.length;i++){
            if (Student[i].equals(input_name)){
                System.out.println("Position of the student in the list"+input_name);
                isExist=true;
                break;
            }
        }
        if (!isExist){
                System.out.println("not found "+input_name+"in the list.");
        }
    }
}
