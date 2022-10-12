package ArrayListDemo01;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            s.setName(name);
            s.setAge(age);
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.print("姓名是：" + stu.getName());
            System.out.println("  年龄是：" + stu.getAge());
        }
    }
}
