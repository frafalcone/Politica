package org.politica.spark.sparkManagment;

import org.apache.spark.sql.SparkSession;

public class SparkManagment {

    public static SparkSession sparkBuilder(){
        return SparkSession.builder()
                .appName("Progetto Twitter - Elezioni Politiche")
                .master("local[*]")
                .getOrCreate();
    }
}
