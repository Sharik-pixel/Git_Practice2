package day20_WhileLoops;

public class BranchingStatement {
    public static void main(String[] args) {

        char ch = 'A';
        while(ch <= 'E') {

            if(ch == 'C'){
                ch++;
              continue; // skips even iterator statements
               //  break;
            }
            System.out.println(ch);

            ch++;

        }









    }
}
