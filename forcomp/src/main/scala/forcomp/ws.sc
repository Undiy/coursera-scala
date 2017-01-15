package forcomp

object ws {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val xs = List(('a', 2), ('b', 2))               //> xs  : List[(Char, Int)] = List((a,2), (b,2))
  
  Anagrams.combinations(xs)                       //> res0: List[forcomp.Anagrams.Occurrences] = List(List(), List((b,1)), List((b
                                                  //| ,2)), List((a,1)), List((a,1), (b,1)), List((a,1), (b,2)), List((a,2)), List
                                                  //| ((a,2), (b,1)), List((a,2), (b,2)))
  
  val x = List(('a', 1), ('d', 1), ('l', 1), ('r', 1))
                                                  //> x  : List[(Char, Int)] = List((a,1), (d,1), (l,1), (r,1))
  val y = List(('r', 1))                          //> y  : List[(Char, Int)] = List((r,1))
  
  Anagrams.subtract(x, y)                         //> res1: forcomp.Anagrams.Occurrences = List((a,1), (d,1), (l,1))
  
  val occ1 = Anagrams.sentenceOccurrences(List("nux"))
                                                  //> occ1  : forcomp.Anagrams.Occurrences = List((n,1), (u,1), (x,1))
  
  val sentence = List("Linux", "rulez")           //> sentence  : List[String] = List(Linux, rulez)
  
  val occ = Anagrams.sentenceOccurrences(sentence)//> occ  : forcomp.Anagrams.Occurrences = List((e,1), (i,1), (l,2), (n,1), (r,1)
                                                  //| , (u,2), (x,1), (z,1))
  val comb = Anagrams.combinations(occ)           //> comb  : List[forcomp.Anagrams.Occurrences] = List(List(), List((z,1)), List(
                                                  //| (x,1)), List((x,1), (z,1)), List((u,1)), List((u,1), (z,1)), List((u,1), (x,
                                                  //| 1)), List((u,1), (x,1), (z,1)), List((u,2)), List((u,2), (z,1)), List((u,2),
                                                  //|  (x,1)), List((u,2), (x,1), (z,1)), List((r,1)), List((r,1), (z,1)), List((r
                                                  //| ,1), (x,1)), List((r,1), (x,1), (z,1)), List((r,1), (u,1)), List((r,1), (u,1
                                                  //| ), (z,1)), List((r,1), (u,1), (x,1)), List((r,1), (u,1), (x,1), (z,1)), List
                                                  //| ((r,1), (u,2)), List((r,1), (u,2), (z,1)), List((r,1), (u,2), (x,1)), List((
                                                  //| r,1), (u,2), (x,1), (z,1)), List((n,1)), List((n,1), (z,1)), List((n,1), (x,
                                                  //| 1)), List((n,1), (x,1), (z,1)), List((n,1), (u,1)), List((n,1), (u,1), (z,1)
                                                  //| ), List((n,1), (u,1), (x,1)), List((n,1), (u,1), (x,1), (z,1)), List((n,1), 
                                                  //| (u,2)), List((n,1), (u,2), (z,1)), List((n,1), (u,2), (x,1)), List((n,1), (u
                                                  //| ,2), (x,1), (z,1)), List((n,1), (r,1)), List((n,1), (r,1), (z,1)), List((n,1
                                                  //| ), (r,1), (x,1)), List((
                                                  //| Output exceeds cutoff limit.
  
  val filtered = comb filter (_ == occ1)          //> filtered  : List[forcomp.Anagrams.Occurrences] = List(List((n,1), (u,1), (x,
                                                  //| 1)))
  
  val nu = Anagrams.wordOccurrences("u")          //> nu  : forcomp.Anagrams.Occurrences = List((u,1))
  
  val nuMap = nu.toMap withDefaultValue 0         //> nuMap  : scala.collection.immutable.Map[Char,Int] = Map(u -> 1)
  
  for ((char, count) <- occ) yield (char, count - nuMap(char))
                                                  //> res2: List[(Char, Int)] = List((e,1), (i,1), (l,2), (n,1), (r,1), (u,1), (x,
                                                  //| 1), (z,1))
  
  val s1 = Anagrams.subtract(occ, nu)             //> s1  : forcomp.Anagrams.Occurrences = List((e,1), (i,1), (l,2), (n,1), (r,1),
                                                  //|  (u,1), (x,1), (z,1))
  
  
  /*
  org.scalatest.exceptions.TestFailedException:
  Set(
  	List(null, Uzi, Rex), *
  	List(Uzi, null, Rex), *
  	List(Uzi, Rex, null), *
  	List(Lin, nil, Zulu, Rex),
  	List(Rex, Uzi, null), *
  	List(Lin, nil, Rex, Zulu),
  	List(null, Rex, Uzi), *
  	List(Rex, null, Uzi), *
  	List(Zulu, Lin, nil, Rex),
  	List(rulez, Linux), *
  	List(Rex, Zulu, Lin, nil),
  	List(Zulu, Rex, Lin, nil),
  	List(Rex, Lin, nil, Zulu),
  	List(Linux, rulez) *
  ) did not equal Set(
  	List(Zulu, nil, Rex),
  	List(null, Uzi, Rex), *
  	List(Zulu, Lin, Rex),
  	List(Uzi, null, Rex), *
  	List(Uzi, Rex, null), *
  	List(Rex, Uzi, null), *
  	List(Lin, Rex, Zulu),
  	List(nil, Rex, Zulu),
  	List(nil, Zulu, Rex),
  	List(null, Rex, Uzi), *
  	List(Rex, Zulu, Lin),
  	List(Rex, nil, Zulu),
  	List(Rex, null, Uzi), *
  	List(Zulu, Rex, Lin),
  	List(Zulu, Rex, nil),
  	List(rulez, Linux), *
  	List(Rex, Lin, Zulu),
  	List(Rex, Zulu, nil),
  	List(Lin, Zulu, Rex),
  	List(Linux, rulez) *
  )
  */
	

  
}