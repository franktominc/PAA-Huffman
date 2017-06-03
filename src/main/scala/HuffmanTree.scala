/**
  * Created by frank on 6/1/2017.
  */
case class HuffmanTree(value: String) {

  def buildTree(): Map[Char, Int] = {
    println(value.groupBy(x => x))
    val n = value.groupBy(x => x)
      .toList
      .map(tuple => (tuple._1, tuple._2.length))
      .map(tuple => Leaf(tuple._2, tuple._1))
      .sortBy(_.value)

    def helper(nodes: List[Node]): Node = {
      if(nodes.length < 2) nodes.head
      else helper((NodeImpl(nodes.head.value + nodes.drop(1).head.value, Some(nodes.head), Some(nodes.drop(1).head)) :: nodes.drop(2)).sortBy(_.value))
    }
     println(helper(n))
    dfs(helper(n),"")
  }
  def dfs(node: Node, rep: String): Map[Char, Int] ={
    node match{
      case NodeImpl(_ ,Some(l), Some(r)) => dfs(l, rep + "0")++
                                            dfs(r, rep + "1")
      case Leaf(v,c) => Map(c -> (8*v - rep.length * v))
    }
  }
}
