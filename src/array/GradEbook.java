package array;

public class GradEbook {
    public static void main(String[] args) {
        String[] names  = {"Akrem" , "jemal" , "nabeel"};
        int [] score = {     100   , 20       ,  66     };
        char [] grade = new char[names.length];


        for (int i = 0; i < score.length -1 ; i++) {
            if (score[i] >= 85 && score[i] <= 100) {
                grade [i] = 'A';
                System.out.println(names[i] + " | " + score[i] +" | " +grade[i]  );
            }else if (score[i]  >=  75 ){
                grade [i] = 'B';
                System.out.println(names[i] + " | " + score[i] +" | " +grade[i]  );
            }else if (score[i]  >= 65 ){
                grade [i] = 'C';
                System.out.println(names[i] + " | " + score[i] +" | " +grade[i]  );
            }else if ( score[i] >= 0){
                grade [i] = 'D';
                System.out.println(names[i] + " | " + score[i] +" | " +grade[i]  );
            }

        }

    }
}
