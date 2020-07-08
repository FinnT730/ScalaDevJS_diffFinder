package cf.finnt730

import java.io.FileReader

object Main {

  def main(args: Array[String]): Unit = {
//    def indexOfArgs = 0
//    args.foreach((a) => {
//      def result = a match {
//        case "-run" => "Command =\t"
//        case "HELLO_WORLD" => "------"
//      }
//      println(result)
//      indexOfArgs.+(1);
//    })



    def fileReader = new CreateFileReader()
    def reader = fileReader.CreateFileReader("test.txt")

    var buff = 0
    while(buff != -1) {
      buff = reader.read()
      print(buff.toString)
    }



  }
}
