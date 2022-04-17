package BLL;

import BLL.Read;
import com.caen.RFIDLibrary.CAENRFIDException;

import java.util.HashMap;
import java.util.Set;

public class TestConnect {
    //this test of date input
//    public static void main(String[] args) throws Exception {
//        DAL_Bill dal=new DAL_Bill();
//        List<DTO_ProductLine> billstest=new ArrayList<>();
//        billstest.add(new DTO_ProductLine("32132332320","dauan",32f));
//        long millis=System.currentTimeMillis();
//        java.sql.Date date=new java.sql.Date(millis);
//        System.out.println(date);
//        dal.addBill(new DTO_Bill("321231we33w2ew31",date,32f,billstest));
//      List<DTO_Bill>  listBill = dal.readDB();
//    for(DTO_Bill bill: listBill){
//        System.out.println(bill.getBill_ID()+" "+bill.getDate());
//        }
//    }

    public static void main(String[] args) throws Exception {
        TestintializeTag();
    }

    // this test readTag function
    public static void TestintializeTag() throws CAENRFIDException {
       HashMap<String,String> listTag= Read.ReadTag();
        Set<String> keySet = listTag.keySet();
        for (String key : keySet) {
            System.out.println(key + " - " + listTag.get(key));
        }
    }

}
