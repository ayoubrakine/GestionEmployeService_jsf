
import java.util.Date;
import ma.projet.beans.Employe;
import ma.projet.service.EmployeService;
import ma.projet.service.ServiceService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LACHGAR
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceService ss = new ServiceService();
        EmployeService es = new EmployeService();
        //Création des machines
        //es.create(new Employe("Ayoub","Rakine",new Date(), "photo", ss.getById(1),es.getById(1)));
        //es.create(new Employe("yahya","Mourid",new Date(), "photo", ss.getById(1),es.getById(1)));
        //es.create(new Employe("younes","Moujib",new Date(), "photo", ss.getById(1),es.getById(1)));

        
         System.out.println("dabab  "+ es.nbemploye());

        
        
        //Afficher les machines par service
        for(Employe s : es.getAll()){
            System.out.println("Employe  : "+s.getNom()+" : ");
            System.out.println("\t"+s.getService());
            System.out.println("\t"+s.getChef());
        }
    }
}
