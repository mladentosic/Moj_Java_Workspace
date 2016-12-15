public class App {
 
    public static void main(String[] args) {
         
         
        Plant plant1 = new Plant();
        System.out.println(plant1);
         
        // Drvo je vrsta Biljke, nasljedjuje je
        Tree tree = new Tree();
         
        /*
         * Polimorfizam garantuje da se child klasa moze koristiti
         * na svim mjestima gdje se ocekuje parent..
         * 
         * Konkretno, objekte klase Tree mozemo koristiti gdje god se ocekuje Plant
         * 
         */
        Plant plant2 = tree;
         
        // Poziva se metod grow() iz klase Tree
        plant2.grow();
         
        // Ovo ce raditi
        tree.shedLeaves();
         
        // Ovo nece raditi, zato sto roditeljska klasa ne posjeduje implementaciju metode child klase. Prepakivanjem iz djeteta u roditelja prepakuje se samo ono što roditelj ima,
        // odnosno ono što im je zajednicko
        //plant2.shedLeaves();
         
        // Jos jedan primjer polimorfizma.. ocekuje se Plant, sto znaci mozemo koristiti i klasu Tree
        doGrow(tree);
    }
     
    public static void doGrow(Plant plant) {
        plant.grow();
    }
 
}