import java.util.*;
public class Hashmap {
    static class Hashmap<K,V> {
        private class Node{
        K key;
        V value;

        public Node(K key,V value){
            this.key=key;
            this.value=value;
        }
    }
    private int n;//n - nodes
    private int N;//N - buckets
    private LinkedList<Node> buckets[];//N = buckets.length


    @SuppressWarnings("unchecked")
    public Hashmap(){
        this.N=4;
        this.buckets = new LinkesList[4];
        for(int i=0;i<4;i++){
            this.bucket[i]=new LinkedList<>();
        }
    }
    private  int hashFunction(K key){

    }
    public  void put(K key , V value){
        int bi = hashFunction(key);
        int di =searchInLL(key,bi);// data index 
        if(di== -1){
            //key doesn't exist
        }
        else{
            //key exist
        }
    }
    public  boolean containsKeys(K key){
        return false;
    }

}
}
