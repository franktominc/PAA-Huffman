import java.io.{BufferedReader, FileReader}
import java.nio.file.{Files, Path, Paths}
import java.util.stream.Collectors

/**
  * Created by frank on 6/1/2017.
  */
object Main extends App{
  override def main(args: Array[String]): Unit = {
    //val a =  HuffmanTree(Files.readAllLines(Paths.get("C:\\Users\\frank\\Downloads\\big.txt")).stream().collect(Collectors.joining())).buildTree()
    val a = HuffmanTree("aaaaabbcdsadasdasqeweqawdasfgqaerEDQAWSDAWWSEDAScc").buildTree()
    println(a)

    println(a.values.sum)
  }
}
