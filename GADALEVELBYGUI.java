/*
All activities and life of each and every member of the Oromo was guided by an egalitarian 
socio-economic and political structure of the society called the Gada system. 
The Gada system is a class system that succeeds each other every eight years 
in assuming political-military administration, economic management, and other
social activities. It was the central institution of the Oromo people that contain 
complex and extraordinary features. It was purely invented by the Oromo and it is one 
of the most remarkable political systems which was highly democratic with effective 
legislative and judicial institutions.
The Gadaa grades are recruited on the basis of genealogical generations.
The following are the Gadaa grades.
I.Dabballe (the first Gadaa grade) from age 0 to 8.
II. Gamme xixiqqaa (junior gamme) from age 9 to 16.
III.Gamme gurgudda (senior gamme) from age 17 to 24.
IV. Kuussa (the fourth Gadaa grade) from age 25-32.
V. Raabaa Doorii (the fifth Gadaa grade) from age 33 to 40.
VI. Gadaa (the sixth Gadaa grade) from age 41 to 48.
VII. Yuuba (the semi-retired assemblymen) from age 49 to 56.
VIII.Yuuba 2ffa(the second yuuba) from age 57 to 64.
IX.Yuuba 3ffaa(the 3rd yuuba) from age 65 to 72.
X.Yuuba 4ffaa(the fourth yuuba)from age 73 to 80. 
XI.Gadamojjii (liminal or full retirement stage) above 81
 */
package gadalevelbygui;
import javax.swing.JOptionPane;

public class GADALEVELBYGUI {
    public static void main(String[] args) {
        
       
 String a=JOptionPane.showInputDialog(null,"ENTER YOUR AGE") ; 
 int age=Integer.parseInt(a);
  if(age>0 && age<=8){
  JOptionPane.showMessageDialog(null ,"YOU ARE:"+"DABBALLE","GADAA LEVEL",JOptionPane.PLAIN_MESSAGE);    
      }      
      if(age>=9 && age<=16){
  JOptionPane.showMessageDialog(null ,"YOU ARE:"+"GAAMMEE XIXXIQQAA","GADAA LEVEL",JOptionPane.PLAIN_MESSAGE);    
      }   
      if(age>=17 && age<=24){
  JOptionPane.showMessageDialog(null ,"YOU ARE:"+"GAAMMEE GURGUDDA","GADAA LEVEL",JOptionPane.PLAIN_MESSAGE);    
      }   
      if(age>=25 && age<=32){
  JOptionPane.showMessageDialog(null ,"YOU ARE:"+"KUUSSA","GADAA LEVEL",JOptionPane.PLAIN_MESSAGE);    
      }   
        
       if(age>=33 && age<=40){
  JOptionPane.showMessageDialog(null ,"YOU ARE:"+"RAABAA DOORII","GADA LEVEL",JOptionPane.PLAIN_MESSAGE);    
      }  
        
       if(age>=41 && age<=48){
  JOptionPane.showMessageDialog(null ,"YOU ARE:"+"GADAA","GADA LEVEL",JOptionPane.PLAIN_MESSAGE);    
      }  
        
       if(age>=49 && age<=56){
  JOptionPane.showMessageDialog(null ,"YOU ARE:"+"YUUBA 1FFAA","GADA LEVEL",JOptionPane.PLAIN_MESSAGE);    
      } 
       if(age>=57 && age<=64){
  JOptionPane.showMessageDialog(null ,"YOU ARE:"+"YUUBA 2FFAA","GADA LEVEL",JOptionPane.PLAIN_MESSAGE);    
      } 
       
       if(age>=65 && age<=72){
  JOptionPane.showMessageDialog(null ,"YOU ARE:"+"YUUBA 3FFAA","GADA LEVEL",JOptionPane.PLAIN_MESSAGE);    
      } 
       
       
      if(age>=73 && age<=80){
  JOptionPane.showMessageDialog(null ,"YOU ARE:"+"YUUBA 4FFAA","GADA LEVEL",JOptionPane.PLAIN_MESSAGE);    
      }  
         
      if(age>=81 ){
  JOptionPane.showMessageDialog(null ,"YOU ARE:"+"GADAMOOJJII","GADA LEVEL",JOptionPane.PLAIN_MESSAGE);    
      }  
    if(age<=0){
     JOptionPane.showMessageDialog(null ,"PLEASE ENTEER THE CORRECT AGE","GADA LEVEL",JOptionPane.PLAIN_MESSAGE);    
       }   
   
       
       
       
       
       
       
       
    }
    
}
