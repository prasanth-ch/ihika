package org.apache.pcb.ds


import org.apache.pcb.conf.config._
object maprDS {

  def main(args: Array[String]): Unit = {

    println("Hello PCB ")
import  spark.implicits._
   // val d= spark.read.csv("D:\\MapR\\Datasets\\questions_10K.csv").toDF()
    //d.show()

    val colours= List("white","green","yellow","red","brown","pink")

    val colourDF = spark.sparkContext.parallelize(colours).map(x => (x,x.length))
      .toDF("Clour","Length")
colourDF.show()

//colourDF.dtypes

  }


}
