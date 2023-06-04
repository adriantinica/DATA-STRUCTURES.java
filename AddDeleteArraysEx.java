/**
 * https://github.com/dorinesinenco/EDUQATION/blob/master/programming/java/array/insert-delete.ro.md
 */
public class AddDeleteArraysEx {

    public static void main(String[] args) {
        
        int[] data = {10,20,30,40,50};
        int indexToDelete = 2;
        int[] newData = new int[data.length - 1]; // creat un array ca obiect 

        for(int oi = 0, ci = 0; oi < data.length; oi++ )
        {
            if( oi != indexToDelete ){
                newData[ ci++ ] = data[ oi ];
            }
        }

        data = newData;

        for (int i =0; i < data.length; i++) {
            System.out.print(data[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("####################################################");

        //Creati un nou array newData care e cu o unitate mai mare decat tabelul vechi data
        //Cu ajutorul ciclului (asemanator cu cel de mai sus) sa se parcurca tabelul vechi copiind valorile in tabelul nou, 
        //Atribuiti variabilei data tabelul nou modificat
        int newValue = -10;
        int indexToInsert =2;

        int [] newLongData = new int[data.length +1];

        for(int oi = 0, ci = 0; oi < data.length; oi++ )
        {

            if( oi != indexToInsert ){
                newLongData[ ci++ ] = data[ oi ];
            }else{
                
                newLongData[ ci++ ] = newValue;
                newLongData[ ci++ ] = data[ oi ];
                
            }
        }

        data = newLongData;

         //Sa se afiseaza prin "foreach" array-ul nou, modificat

        for (int i : newLongData) {
            System.out.print (i+" ");
        }




    }
}
