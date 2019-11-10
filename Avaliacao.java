
package pkg0testesjava;

public class Avaliacao {
 
 public static void main(String args[])   {
int x, y, z;
  x = y = z = 1;
  try {
   new Avaliacao().metodo();//puxa a classe avaliação para metodo
   x++;
  } catch (Exception e) {
   y++;
  } finally {//finally sempre é executado
   z=++z+3;
  // new Avaliacao().metodo(); //da erro aqui
  }
  System.out.println(x + "," + y + "," + z);
    }public void metodo() throws Exception {
  throw new Exception();//serve para mostrar todos os erros do prog
 }
   } 

    

   

