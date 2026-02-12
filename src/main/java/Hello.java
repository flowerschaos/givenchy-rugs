package src.main.java;

public class Hello {
    public static void main(String[] args) {
        weave(solid(11, 11));
        weave(horiz(11, 11));
        weave(verti(11, 11));
        weave(diag(11, 11));
        weave(plaid(11, 11));
        weave(argyle(11, 11));
    }

    public static void weave(String[][] rug) {
        // Method to print 2D emoji arrays.
        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                System.out.print(rug[i][j]);
            }
            // Break the line at the end of every row.
            System.out.println("");
        }
    }

    public static String[][] solid(int width, int height) {
        String[][] rug = new String[width][height];

        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                rug[i][j] = "🟦";
            }
        }

        return rug;
    }
    public static String[][] horiz(int width, int height) {
        String[][] rug = new String[width][height];

        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                if(i%2==0){
                    rug[i][j] = "🟦";
                }
                else{
                    rug[i][j] = "🟥";
                }
            }
        }
        return rug;
    }
    public static String[][] verti(int width, int height) {
        String[][] rug = new String[width][height];

        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                 if(j%2==0){
                    rug[i][j] = "🟥";
                }
                else{
                    rug[i][j] = "🟦";
                }
            }
            }
        }
        return rug;}

    public static String[][] diag(int width, int height) {
        String[][] rug = new String[width][height];

        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                rug[i][j] = "🟦";
            }
        }

        return rug;
    }
    public static String[][] plaid(int width, int height) {
        String[][] rug = new String[width][height];

        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                rug[i][j] = "🟦";
            }
        }

        return rug;
    }
    public static String[][] argyle(int width, int height) {
        String[][] rug = new String[width][height];

        for(int i = 0; i < rug.length; i++) {
            for(int j = 0; j < rug[i].length; j++) {
                rug[i][j] = "🟦";
            }
        }

        return rug;
    }
}