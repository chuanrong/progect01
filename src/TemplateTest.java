import java.util.ArrayList;
import java.util.Arrays;

public class TemplateTest {
    //6 prsf
    private static final Customer cust = new Customer();
    // 变形psf
    public static final int NUM = 1;
    //psfi
    public static final int NUM2 = 2;
    //psfs
    public static final String NATION = "china";

    //1 psvm
    public static void main(String[] args){
    //2 sout
        System.out.println("ks;kdl;");
    //变形： soutp/soutm/soutv/xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplateTest.main");
        System.out.println("true = " + true);
        int num1 = 10;
        //num1.out
        System.out.println(num1);
    //3 fori
         String[]arr = new String[]{"tom","dcr","hsjidhj","lilei"} ;
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);

        }
     //变形 iter  itar
        for (String s : arr) {
            System.out.println(s);

        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
          
        }
     //4List.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(45);


        for (Object o : list) {
            
        }
        //list.fori  
        for (int i = 0; i < list.size(); i++) {
            
        }
        //list.forr  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        //5 ifn
        ArrayList list1 = new ArrayList();
        list1.add(788);
        list1.add(786);
        list1.add(7448);
        list1.add(780);

        if (list1 == null) {

        }
        //inn
        if (arr != null) {

        }
        //xxx.nn / xxx.null
        if (list1 != null) {

        }
        if (list1 == null) {

        }
    }


}
