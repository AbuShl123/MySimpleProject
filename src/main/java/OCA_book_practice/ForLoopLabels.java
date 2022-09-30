package OCA_book_practice;

public class ForLoopLabels {
    public static void main(String[] args) {
        // try to represent output is there wouldn't be a label or a break
        int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;
        PARENT_LOOP: for(int i=0; i<list.length; i++) {
            for(int j=0; j<list[i].length; j++) {
                if(list[i][j]==searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }
        if(positionX==-1) {
            System.out.println("Value "+searchValue+" not found");
        } else {
            System.out.println("Value "+ searchValue + " found at: " + "(" +positionX + "," +positionY + ")");
        }


        // with label:
        FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b')
                    continue FIRST_CHAR_LOOP;
                System.out.print(" " + a + x);
            }
        }

        // without a label:
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b')
                    continue;
                System.out.print(" " + a + x);
            }
        }

        // without a 'continue':
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                System.out.print(" " + a + x);
            }
        }
    }
}
