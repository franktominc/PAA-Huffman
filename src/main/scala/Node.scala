/**
  * Created by frank on 6/1/2017.
  */
trait Node{
    val value: Int
}

case class NodeImpl(override val value: Int, left: Option[Node], right: Option[Node]) extends Node

case class Leaf(override val value: Int, character: Char) extends Node{
  override def toString: String = s"Leaf($value, ${character})"
}