import db.Department;
import db.Seller;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Department department = new Department(1,"Livros");
        Seller seller = new Seller(21,"Bob","bob@gmail.com",new Date(),5000.0,department);
        System.out.println(department);
        System.out.println(seller);
        }
    }
