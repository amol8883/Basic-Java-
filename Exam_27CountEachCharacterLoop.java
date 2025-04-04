package topCodingQua;

public class Exam_27CountEachCharacterLoop {

    public static void main(String[] args) {
        String str = "rohit Sharma";
        char[] charArr= str.toCharArray();

        System.out.println(charArr.length);
        boolean[] connected= new boolean[charArr.length];
       // Already counted characters are skipped (using counted[i]).
        //        Spaces are ignored (using charArr[i] == ' '

        for (int i=0;i<charArr.length;i++){
             if (connected[i] || charArr[i]==' ') continue;
         int count=1;
        for (int j=i+1;j<charArr.length;j++){

            if (charArr[i]==charArr[j]){
                    count++;
                    connected[j] = true;
            }
        }
            System.out.println(charArr[i]+"="+count);
        }

    }
}
