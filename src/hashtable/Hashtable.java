package hashtable;

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
}
