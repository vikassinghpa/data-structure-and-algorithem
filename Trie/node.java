/**
 * node
 */
import java.util.*;
public class node {
   node [] childrens;
   boolean isWord ;
  
  public node (){
      childrens = new node [26];
      isWord = false;
      Arrays.fill(childrens,null);
   }
}
