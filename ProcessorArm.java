package com.company;

import java.util.Locale;

public class ProcessorArm extends Processor{
    final String architecture ="ARM";
    @Override
    String dataProcess(String data) {
       return data.toUpperCase();

    }

    @Override
    String dataProcess(long data) {
        return String.valueOf(data);
    }
}
