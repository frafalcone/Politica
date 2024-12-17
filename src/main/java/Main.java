
// Classe main del progetto

import dati.DataLoad;
import org.apache.spark.sql.SparkSession;
import sparkManagment.SparkManagment;

public class Main {
    public static void main(String[] args) {
        SparkSession mainSession = SparkManagment.sparkBuilder();
        DataLoad.fileReader(mainSession);

        mainSession.stop();
    }
}
