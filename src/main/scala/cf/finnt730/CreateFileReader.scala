package cf.finnt730

import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException

class CreateFileReader {



  def CreateFileReader(fileName: String) : FileReader = {
    new FileReader(new File(fileName))
  }


}