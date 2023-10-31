import java.util.ArrayList;

class MyHashMap {

    ArrayList<Integer> keys;
    ArrayList<Integer> vals;

    public MyHashMap() {
        this.keys = new ArrayList<Integer>();
        this.vals = new ArrayList<Integer>();
    }

    public void put(int key, int value) {

        int pos = keys.indexOf(key);

        if (pos != -1) {
            vals.remove(pos);
            vals.add(pos, value);
        } else {
            keys.add(key);
            vals.add(value);
        }
    }

    public int get(int key) {

        int pos = keys.indexOf(key);
        return pos != -1 ? vals.get(pos) : pos;
    }

    public void remove(int key) {

        int pos = keys.indexOf(key);

        if(pos == -1) return;
        
        keys.remove(pos);
        vals.remove(pos);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */