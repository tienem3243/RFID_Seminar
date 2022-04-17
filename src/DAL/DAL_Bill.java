package DAL;

import DTO.DTO_Bill;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class DAL_Bill {
    MyConnectUnit myConnectUnit;
    String tableName="bill";

    //read database
    public List<DTO_Bill> readDB(String condition,String orderBy) throws Exception {
        myConnectUnit = new MyConnectUnit();

        ResultSet result = this.myConnectUnit.Select(tableName,condition, orderBy);
        List<DTO_Bill> DTOs = new ArrayList<>();
        while (result.next()) {
            DTO_Bill bill = new DTO_Bill();
            bill.setBill_ID(result.getString("bill_id"));
            bill.setDate(result.getDate("date"));
            bill.setTotal(result.getFloat("total"));
            DTOs.add(bill);
        }
        myConnectUnit.Close();
        return DTOs;
    }
    public List<DTO_Bill> readDB(String condition) throws Exception {
        return readDB(condition,null);
    }
    public  List<DTO_Bill> readDB() throws Exception {
        return readDB(null);
    }
    public Boolean addBill(DTO_Bill bill) throws Exception {
        myConnectUnit = new MyConnectUnit();

        // tạo đối tượng truyền vào
        HashMap<String, Object> insertValues = new HashMap<>();
        insertValues.put("bill_id",bill.getBill_ID());
        insertValues.put("date",bill.getDate());
        insertValues.put("total",bill.getTotal());
        Boolean check = myConnectUnit.Insert(tableName, insertValues);

        myConnectUnit.Close();
        return check;
    }
}
