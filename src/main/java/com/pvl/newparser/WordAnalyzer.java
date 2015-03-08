package com.pvl.newparser;

public class WordAnalyzer {
    private String result;
    private String leng;
    private String [] args = null;
    private String outputPath = null;

    public WordAnalyzer (String inputPath, Integer minV, String outputPath) {
        setInputFile(inputPath);
        setMaxWordLength(minV);
        setOutputPath(outputPath);
    }

    public void setInputFile(String someFile) {
        someFile = "inputPath=" + someFile;
        args [0] = someFile;
    }

    public void setMaxWordLength(Integer length) {
        this.leng = length.toString();
        leng = "minValue=" + leng;
        args [1] = leng;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
        String outPath = "outputPath" + outputPath;
        args [2] = outPath;
    }

    public void executeWordCounter() {
        NewParser np = new NewParser();
        np.executeParser(args);
    }

    public String getProcessedTextResult() {
        executeWordCounter();
        result = outputPath;

        return result;
    }
}
