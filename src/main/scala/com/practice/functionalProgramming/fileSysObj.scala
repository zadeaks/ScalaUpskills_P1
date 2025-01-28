package com.practice.functionalProgramming

import java.io.File

object fileSysObj {

  def main(args: Array[String]) = {}

  def listFilesFunc(inputPath: File):List[File] = {

    val listFilesAndDir = inputPath.listFiles.toList
    val files = listFilesAndDir.filter(_.isFile)
    val dir = listFilesAndDir.filter(_.isDirectory)

    files ++ dir.flatMap(path => listFilesFunc(path))
  }

  val currentDir = new File(".")
  val listAllFiles = listFilesFunc(currentDir)

  listAllFiles.map(_.getAbsolutePath).foreach(println)

}
