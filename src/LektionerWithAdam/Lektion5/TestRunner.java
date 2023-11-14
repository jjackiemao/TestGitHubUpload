package LektionerWithAdam.Lektion5;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestRunner {

        @Test
        public void testGetName(){
            //Arrange <- Vi arrangerar vår testdata
            BankAccount jackieAcc = new BankAccount(1000,"Jackie");
            String expected = "Jackie";
            //Act <- Vi utför nödvändiga beräkningar etc.
            String actual = jackieAcc.getName();
            //Assert <- Vi kollar att vi får korrekt utfall.
            //Vi jämför innehållet i expected och actual
            //Om innehållet är samma så passerar testfallet
            //Annars misslyckas testfallet
            assertEquals(expected,actual);
        }
        /*
        @Test
        public void testSetName(){
            //Arrange
            BankAccount jackieAcc = new BankAccount(2500,"Jackie");
            String expected = "jackieAcc";
            //Act
            //jackieAcc.setName("jackieAcc");
            String actual = jackieAcc.getName();
            //Assert
            assertEquals(expected,actual);
        }
        //1.Vi testar att balance sätts korrekt i konstruktorn
        //Med ett enhetstest!
        //2.Vi testar att det fungerar att sätta en ny balance
        //med setBalance och assertar att slutresultatet blir korrekt!
        //3.Vi testar att deposit fungerar korrekt!
        //4.Vi testar att withdraw fungerar korrekt!

         */
    }
