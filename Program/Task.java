class Task { 
 public static void printWords(String s) 
 { 
   
  for (String word : s.split(" ")) 
   
   
   
    System.out.println(word); 
 } 
 public static void main(String[] args) 
 { 
 
  String s = "Hi, welcome to this mentoring session"; 
  printWords(s); 
 } 
} 