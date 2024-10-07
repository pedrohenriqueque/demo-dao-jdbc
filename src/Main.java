import db.Department;
import db.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findByID(3);
        System.out.println(seller);

    }
}
