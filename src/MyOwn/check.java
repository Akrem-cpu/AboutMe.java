package MyOwn;




import java.util.*;



public class check {
    public static String lameDb(String db, String op, String id, String data) {
        List<String> word = new ArrayList<String>(Arrays.asList(db.split("#")));
        Integer index = Integer.parseInt(id) -1;
        String wordJoin = "";
        int count = 0;
        if (op.equals("add")){
            word.add(index,id+data);
            for (String each : word) {
                count++;
                wordJoin += "#"+count+each.substring(1);
            }

        }else if (op.equals("edit")){
            word.set(index,id+data);
            for (String each : word) {
                count++;
                wordJoin += "#"+count+each.substring(1);
            }

        }else if (op.equals("delete")){
           String a =  word.get(index);
            for (String each : word) {
                if (!each.equals(a)) {
                    count++;
                    wordJoin += "#" + each;
                }
            }
        }


        return wordJoin.substring(1);
    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }

}

























