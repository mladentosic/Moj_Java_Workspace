public class App {
 
    public static void main(String[] args) {
         
        /*
         * 1. Primjer slabo efikasnog kreiranja recenica, tj. Stringova
         */
        String info = "";
         
        info += "Zovem se Marko.";
        info += " ";
        info += "Ja sam programer.";
         
        System.out.println(info);
         
        /*
         * 2. Efikasniji nacin upravljanja Stringovima.
         */
        StringBuilder sb = new StringBuilder("");
         
        sb.append("Moje ime je Goran.");
        sb.append(" ");
        sb.append("Ja sam pilot.");
         
        System.out.println(sb.toString());
         
        /*
         * 3. Isti mehanizam kao 2) samo ljepsa sa ljepsom sintaksom
         */
         
        StringBuilder s = new StringBuilder();
         
        s.append("Moje ime je Goran.")
        .append(" ")
        .append("Ja sam pilot.");
         
        System.out.println(s.toString());
         
        /*
         * FORMATIRANJE STRING-ova
         *  
         * \t - koristimo za novi tab
         * \n - koristimo za novi red, novu liniju
         */
        System.out.print("Ovo je neki tekst.\tOvo je tekst nakon taba.\nOvo je tekst nakon nove linije.");
        System.out.println(" More text.");
         
        /*
         * FORMATIRANJE INTEGER-a
         * 
         * %-10d - ispis integera sa deset karaktera sirine
         * %10d - kao da vrsimo right-align
         */
        System.out.printf("Kompletna cijena %-10d; kolicina je %d\n", 5, 120);
         
        for(int i=0; i<20; i++) {
            System.out.printf("%-2d: %s\n", i, "neki probni tekst");
        }
         
        /*
         * FORMATIRANJE FLOATING POINT-a
         */
         
        // Dva decimalna mjesta:
        System.out.printf("Ukupna vrijednost: %.2f\n", 5.6874);
        
        // Dva decimalna mjesta, lijevo poravnanje i 6-char rezervisano mjesto
        System.out.printf("Ukupna vrijednost: %-6.1f\n", 343.23423);
        
        // Formatiranje upotrebom String.format()
        String formatted = String.format("Ovo je pre-formatirani tekst u promjenjivoj: %.3f", 5.12345);
        System.out.println(formatted);
        
        // Upotreba duplog %% da bi se ispisao % znak
        System.out.printf("%d%% da bi smo napisali znak postotka", 100);
    }
 
}