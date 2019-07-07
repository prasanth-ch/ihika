package org.apache.pcb.df

import org.apache.pcb.conf.config._

object dfpart1 {

  def main(args: Array[String]): Unit = {

    import spark.implicits

    //Create DataFrame from a CSV file

    val dftags= spark.read.format("csv").option("inferschema","true").option("header","true")
      .load("D:\\MapR\\Datasets\\question_tags_10K.csv").toDF("id", "tag")
   // dftags.show()
    dftags.printSchema()
// select columms from a dataframe
   // dftags.select("id","tag").show()

    //filter by a column value of a dataframe

    //dftags.filter("tag == 'php'").show()

    //count rows of a dataframe

    //println(s"Number of php tage = ${dftags.filter("tag =='php'").count()}")

// sql like query

    dftags.filter("tag like 's%'")
      .filter("id == 25 or id ==108").show()

    // sql IN clause

    dftags.filter("id in (25,108)").show()

    
  }

}
