package org.apache.pcb.conf

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SparkSession

object config {

  lazy val sparkConf = new SparkConf()
    .setAppName("Learn Spark")
    .setMaster("local[*]")
    .set("spark.cores.max", "2")

  lazy val spark = SparkSession
    .builder()
    .config(sparkConf)
    .getOrCreate()

  val sc = new SparkContext(sparkConf)
}



