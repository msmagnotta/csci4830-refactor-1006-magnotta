package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      extractedMethod(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      extractedMethod1(edgeList, p);
      return null;
   }

   
   void extractedMethod(List<Node> nodes, String p) {
	   for (Node list : nodes) {
		   if (list.contains(p))
			   System.out.println(list);
	   }
   }
   void extractedMethod1(List<Edge> nodes, String p) {
	   for (Edge list : nodes) {
		   if (list.contains(p))
			   System.out.println(list);
	   }
   }
   }

class Node {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}