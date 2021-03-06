package com.bridgelabz;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyserTest extends TestCase {
    private static final String INDIA_CENSUS_CSV_FILE_PATH = "./src/test/java/IndiaStateCensusData.csv";
//    private static final String WRONG_CSV_FILE_PATH = "./src/main/resources/IndiaStateCensusData.csv";

    @Test
    public void givenIndianCensusCSVFileReturnsCorrectRecords() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numOfRecords = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_CSV_FILE_PATH);
            Assert.assertEquals(29,numOfRecords);
        } catch (CensusAnalyserException e) { }
    }
}