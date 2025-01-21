package hashtable;

import java.util.ArrayList;

public class Hashtable {

    private int size = 7;
    private Node[] dataMap;

    class Node{
        String key;
        int value;
        Node next;

        public Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public Hashtable(){
        dataMap = new Node[size];
    }

    public Node[] getDataMap() {
        return dataMap;
    }

    public void printTable(){
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i+ ":");
            Node temp = dataMap[i];
            while (temp != null){
                System.out.println(" {"+temp.key+ "= "+ temp.value+ "}");
                temp = temp.next;
            }
        }
    }

    private int hash(String key){
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for(int i= 0; i< keyChars.length; i++){
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length; //datamap length = 7 so range = 0 to 6
        }
        return hash;
    }

    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        if(dataMap[index] == null){     //if dataMap at that index is empty i.e linkedlist is empty
            dataMap[index] = newNode;   //add the newNode at that index
        }
        else {                           //there are items in linkedlist at that index
            Node temp = dataMap[index]; //if there are multiple items stored at the same index -create a temp variable
            //at the index
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];
        while(temp != null){
            if(temp.key == key)return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    public ArrayList keys(){
        ArrayList<String> allKeys = new ArrayList<>();
        for(int i = 0; i < dataMap.length; i++){
            Node temp = dataMap[i];
            while(temp != null){
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }
}
