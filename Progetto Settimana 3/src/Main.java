import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        

    	File fileStudenti = new File("C:\\Users\\adry_\\OneDrive\\Desktop\\Java\\workspace\\Progetto Settimana 3\\studenti.txt");
        DecimalFormat df = new DecimalFormat("0.00");
        Logger logger = LoggerFactory.getLogger(Scuola.class);

        

        
        Studente francesco = new Studente(1,"Francesco","Totti",'M');
        Studente bruno = new Studente(2,"Bruno","Conti",'M');
        Studente paolo = new Studente(3,"Paolo","Falcao",'M');
        Studente sabrina = new Studente(4,"Sabrina","Ferilli",'F');
        Studente anna = new Studente(5,"Anna","Magnani",'F');
        
        
        
        
        List<Studente> listaScuola1 = new ArrayList<>();
        listaScuola1.add(francesco);
        listaScuola1.add(bruno);
        listaScuola1.add(paolo);
        listaScuola1.add(sabrina);
        listaScuola1.add(anna);
        

        

        
        Studente cristiana = new Studente(1,"Cristiana","Capotondi",'F');
        Studente claudia = new Studente(2,"Claudia","Gerini",'F');
        Studente alberto = new Studente(3,"Alberto","Sordi",'M');
        Studente gigi = new Studente(4,"Gigi","Proietti",'M');
        Studente carlo = new Studente(5,"Carlo","Verdone",'M');
        
        
        
       
        List<Studente> listaScuola2 = new ArrayList<>();
        listaScuola2.add(cristiana);
        listaScuola2.add(claudia);
        listaScuola2.add(alberto);
        listaScuola2.add(gigi);
        listaScuola2.add(carlo);
        


        
        
        Scuola scuola1 = new Scuola(listaScuola1);
        Scuola scuola2 = new Scuola(listaScuola2);


        
        
        
        System.out.println("PRIMA SCUOLA");
        System.out.println("\nGli studenti della scuola sono: " + scuola1.getStudenti());
        System.out.println("\nGli studenti promossi sono: " + scuola1.getPromossi());   
        System.out.println("\nIl voto migliore di Matematica di " + francesco.getNome() + " e' " + df.format(francesco.votoMiglioreMateria("Matematica")));
        System.out.println("\nLo studente migliore e': " + scuola1.getStudenteMigliore() + " con la media del " + df.format(scuola1.getStudenteMigliore().mediaTotale()));
        scuola1.salvaStudenti(fileStudenti); logger.info("I dati degli studenti sono stati salvati nel file: " + fileStudenti);


        
        System.out.println("SECONDA SCUOLA");
        System.out.println("\nGli studenti della scuola sono: " + scuola2.getStudenti());
        System.out.println("\nGli studenti promossi sono: " + scuola2.getPromossi());   
        System.out.println("\nIl voto migliore in Italiano di " + alberto.getNome() + " e' " + df.format(alberto.votoMiglioreMateria("Italiano")));
        scuola2.salvaStudenti(fileStudenti); logger.info("I dati degli studenti sono stati salvati nel file: " + fileStudenti);


      
        
        
        
        
        logger.info("studente1" + bruno);
        Thread thread1 = new Thread(scuola1, "Scuola1");
        Thread thread2 = new Thread(scuola2, "Scuola2");
        thread1.start();
        thread2.start();

    }

}