package org.politica.spark;
// Classe main del progetto

import org.politica.spark.dati.DataLoad;
import org.apache.spark.sql.SparkSession;
import org.politica.spark.sparkManagment.SparkManagment;

public class Main {
    public static void main(String[] args) {
        SparkSession mainSession = SparkManagment.sparkBuilder();
        DataLoad.fileReader(mainSession);

        mainSession.stop();
    }
}
