/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jungle.managedbeans;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import jungle.navigation.Navigation;
import jungle.repository.JungleRepository;

/**
 *
 * @author Pooja
 */
@Named(value = "JungleHolidayApp")
@ApplicationScoped
public class JungleMangedBeans {
    
    @EJB
    private JungleRepository jungleRepository;
   
    private String test = "Hello Chakkz";

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
    
    public String test2(){
 
        try {
            System.out.println("****************Hello World!****************");
            System.out.println(this.jungleRepository.getAllTransaction().size());
            
        } catch (Exception ex) {
            System.out.println("***********Pooja*************");
            Logger.getLogger(JungleMangedBeans.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        return Navigation.index.toString();
    }

   
    
    
    
}
