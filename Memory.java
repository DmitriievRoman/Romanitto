package com.company;

public class Memory {
    String[] memoryCell;
    int lastindex = memoryCell.length - 1;

    //Memory(int length) {
    //memoryCell = new String[length];

    public String readLast(String[] memoryCell) {
        int i;
        for (i = memoryCell.length - 1; i >= 0; i--) {
            if (memoryCell[i] != null) {
                memoryCell[i] = null;
                break;
            }
        } return memoryCell[i];
    }
    public String removeLast(){
        memoryCell[lastindex] = null;
        return memoryCell[lastindex];
    }
    boolean save (String NullString){
        for (int i = lastindex;i != 0; i--){
            if (memoryCell[i] == null){
                memoryCell[i] = NullString;
                return true;
            }
        } return false;
    }

    class MemoryInfo {

        int counter =0;
        public MemoryInfo() {
            int memorySize = memoryCell.length;
            counterOccupiedMemory();
        }
        int counterOccupiedMemory(){
            int occupiedMemory = 0;
        for (int i=0;i<memoryCell.length-1;i++) {
            if (memoryCell[i] != null) {
                counter++;
            }
            occupiedMemory = (counter / memoryCell.length) * 100;
        }
        return occupiedMemory;
    }

    }
    public MemoryInfo getMemoryInfo(){
        return new MemoryInfo();

    }
}


