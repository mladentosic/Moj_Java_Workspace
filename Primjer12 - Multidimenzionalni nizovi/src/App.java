public class App {
 
    public static void main(String[] args) {
         
        // 1D niz
        int[] values = {3, 5, 2343};
         
        // Dovoljan nam je 1 indeks
        System.out.println(values[2]);
         
        // 2D niz (grid ili tabela)
        int[][] grid = {
            {3, 5, 2343},
            {2, 4},
            {1, 2, 3, 4}
        };
         
        // Neophodna su nam 2 indeksa za iteracije kroz niz
        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);
         
        // Moguce je samo deklarisati 2D niz (isto kao i sa 1D nizom)
        String[][] texts = new String[2][3];
         
        texts[0][1] = "Hallo World";
         
        System.out.println(texts[0][1]);
         
        /*
         * Kako vrsimo iteracije kroz 2D niz?
         * Prvo vrsimo iteracije kroz redove
         * nakon toga vrsimo iteraciju kroz kolone svakog reda (jednu po jednu vrijednost 
         */
        for(int row=0; row < grid.length; row++) {
            for(int col=0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
             
            System.out.println();
        }
         
        // Zadnji indeks niza je opcionalan (nije obavezan).
        String[][] words = new String[2][];
         
        // Svaki pod-niz (unutrasnji niz) je u pocetku null vrijednost
        System.out.println(words[0]);
         
        // Mozemo dodavati nove podnizove "rucno"
        words[0] = new String[3];
         
        // Mozemo unositi vrijednosti u pod-nizove
        words[0][1] = "hi there";
         
        System.out.println(words[0][1]);
    }
 
}