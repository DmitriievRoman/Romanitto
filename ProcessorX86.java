package com.company;

import java.util.Locale;

public class ProcessorX86 extends Processor{
    final String architecture ="X86";
    @Override
    String dataProcess(String data) {
        return data.toLowerCase();
    }

    @Override
    String dataProcess(long data) {
        return String.valueOf(data);
    }
}
