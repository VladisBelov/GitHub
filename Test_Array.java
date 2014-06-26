
public class Test_Array {
    /**
     * some example array
     */
    public static int val[]  = {-1,0,1,3,4,5,8,9,10,13,14,17,18};

    /**
     *
     * @param val input array
     * @return String of input array
     */
     public  String smth (int[] val){

         StringBuilder s = new StringBuilder();
         s.append(val[0]);
         String temp = "";
         for (int i = 1; i<val.length; i++) {
             if (val[i-1] == val[i]-1) {
                 temp="-"+val[i];
             }else {s.append(temp+","+val[i]);
                    temp="";
             }
         }

         return s+temp ;
    }


    public static void main(String[] args) {

        Test_Array t = new Test_Array();
        System.out.println(t.smth(val));

    }


}
