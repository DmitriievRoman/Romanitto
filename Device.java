package com.company;

public class Device {
    Memory memory;
    Processor processor;
    public void save (String[] data){
        //void save (String[] data) – сохранение в память всех элементов в массиве
        if(data.length < memory.memoryCell.length){
        for(int i = 0; i < data.length; i++) {
            memory.memoryCell[i] = data[i];
        }
        }else {
            throw new IllegalArgumentException("Array not valid");
        }
    }
    public String[] readAll(){
        String[] result = new String[memory.memoryCell.length];
        for (int i = 0; i < memory.memoryCell.length; i++) {
            result[i] = memory.memoryCell[i];
            memory.memoryCell = null;
        }
        return result;
    }
    public void dataProcessing(){
        for (int i = 0; i < memory.memoryCell.length; i++) {
            memory.memoryCell[i] = processor.dataProcess(memory.memoryCell[i]);
        }
    }
    public String getSystemInfo(){
        return "Processor: " + processor.getDetails() + "; " + "memory: " + memory.getMemoryInfo();
    }
}