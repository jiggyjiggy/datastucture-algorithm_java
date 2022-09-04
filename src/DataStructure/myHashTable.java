package DataStructure;

public class myHashTable {
    public static void main(String[] args) {
        Slot[] hashTable = new Slot[20];
        hashTable[0] = new Slot("test");
        System.out.println(hashTable[0]);
        System.out.println(hashTable[0].value);

        myHashTable mainObject = new myHashTable(20);
//        mainObject.saveData("DaveLee", "01022223333");
//        mainObject.saveData("fun-coding", "01033334444");
//        System.out.println(mainObject.getData("fun-coding"));

        mainObject.saveData("DaveLee", "01022223333");
        mainObject.saveData("fun-coding", "01033334444");
        mainObject.saveData("David", "01044445555");
//        mainObject.saveData("Dave", "01055556666");
        System.out.println(mainObject.getData("DaveLee"));
    }

    private final Slot[] hashTable;

    private myHashTable(Integer size) {
        this.hashTable = new Slot[size];
    }

    private static class Slot {
        String value;

        public Slot(String value) {
            this.value = value;
        }
    }

    private Integer hashFunc(String key) {
        return key.charAt(0) % this.hashTable.length;
    }

    private boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            this.hashTable[address].value = value;
        } else {
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    private String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            return this.hashTable[address].value;
        } else {
            return null;
        }
    }

}
