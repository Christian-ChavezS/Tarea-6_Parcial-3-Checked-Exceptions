
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 

public class main {

    public static void main(String []args) {

        //Se introducen las pruebas
        Prueba1();

        Prueba2();

        Prueba3();


    }

    //------------------------------------------------- PRUEBA 1 ----------------------------------------------

    private static void Prueba1() {
        try {
            File file = new File("prueba1.txt");

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("En esta prueba el archivo se crea cada vez que el código se ejecuta");

            fileWriter.close();
        }catch (IOException io)
        {
            System.out.println(io.getMessage());
        }
    }


    //------------------------------------------------- PRUEBA 2 ----------------------------------------------
    private static void Prueba2() {
        int i=0;

        do {
            try
            {
                File file = new File("prueba2.txt");

                FileWriter fileWriter = new FileWriter(file, true);

                fileWriter.write("En esta prueba el archivo crece en cada ejecución, lo nuevo se añade al final\n");
                fileWriter.close();
            }catch (IOException io)
            {
                System.out.println(io.getMessage());
            }
            i++;
        }while(i<3);

    }


    //------------------------------------------------- PRUEBA 3 ----------------------------------------------

    private static void Prueba3() {
        try {
            File file = new File("prueba3.txt");
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write("En esta prueba ocurrirá un error\n");
            try
            {
                fileWriter.write("El resultado fallará: " + (1 / 0));
            }catch (ArithmeticException ae)
            {
                System.out.println(ae.getMessage());
            }
            fileWriter.close();

        }catch (IOException io)
        {
            System.out.println(io.getMessage());
        }

    }


}
