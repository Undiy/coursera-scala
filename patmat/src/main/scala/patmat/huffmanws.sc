package patmat

object huffmanws {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  Huffman.decodedSecret                           //> res0: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
  
  val secEncByTable = Huffman.decode(Huffman.frenchCode, Huffman.quickEncode(Huffman.frenchCode)(Huffman.decodedSecret))
                                                  //> secEncByTable  : List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
                                                  //| 
  
  val secEncByTree = Huffman.decode(Huffman.frenchCode, Huffman.encode(Huffman.frenchCode)(Huffman.decodedSecret))
                                                  //> secEncByTree  : List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
                                                  //| 
  
  
}