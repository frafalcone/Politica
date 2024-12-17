package org.politica.spark.dati;

// Percorso dataset - computer di Francesco: C:\Users\franc\Desktop\Dataset\
// Percorso dataset - computer di Angelo:


// Questa classe servirà per il caricamento dei dati all'interno di Apache Spark

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class DataLoad {

    private static final String percorsoAttualeDataset = "C:\\Users\\franc\\Desktop\\Dataset\\";
    private static final String file = "tweet_USA_1_october.csv";

    private static final String percorsoTotale = percorsoAttualeDataset+file;


    public static void fileReader(SparkSession spark){
        Dataset<Row> df = spark.read()
                .option("header", "true")
                .option("delimiter", ",")
                .option("quote", "\"")
                .option("escape", "\"")
                .option("multiLine", "true")
                .option("mode", "DROPMALFORMED")
                .option("inferSchema", "true")
                .csv(percorsoTotale);

        df.show(1000);
    }

}
