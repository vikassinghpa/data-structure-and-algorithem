public class mainJava {
public static node root = new node();

public static void insert(String word){
 node temp=root;
 for(int i=0;i<word.length();i++){
      int ind=word.charAt(i)-'a';
      node newNode = new node ();
      if(temp.childrens[ind]==null){

          temp.childrens[ind]=newNode;
      }
      if(i==word.length()-1){
        temp.childrens[ind].isWord=true;
      }
      temp=temp.childrens[ind];
 }
}

public static boolean find(String word){
    node temp=root;
    for(int i=0;i<word.length();i++){
        int ind= word.charAt(i)-'a';
        if(temp.childrens[ind]==null){
            return false;
        }
        if(i==word.length()-1 && temp.childrens[ind].isWord!=true){
            return false;
        }
        temp=temp.childrens[ind];
    }
return true;
}
public static boolean startsWith(String word) {
    node temp=root;
    for(int i=0;i<word.length();i++){
        int ind= word.charAt(i)-'a';
        if(temp.childrens[ind]==null){
            return false;
        }
         temp= temp.childrens[ind];
        
}
 return true;

}
    public static void main(String [] argv){
        String [] words= {""};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
            // System.out.println( find(words[i]));
        }
       
        
        System.out.println( find("the"));
        System.out.println( startsWith("z"));
    }
}
