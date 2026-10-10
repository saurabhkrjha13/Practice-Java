package com.bigdata;

import org.apache.spark.sql.SparkSession;

public class SparkTest {

    public static void main(String[] args) {

        SparkSession spark = SparkSession.builder()
                .appName("BigDataPatternMining")
                .master("local[*]")
                .getOrCreate();

        System.out.println("Apache Spark Started Successfully!");

        spark.stop();
    }
}
