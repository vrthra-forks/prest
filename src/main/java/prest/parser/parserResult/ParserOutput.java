/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prest.parser.parserResult;

import prest.common.data.DataContext;
import prest.parser.enumeration.Language;


public class ParserOutput {
    
    private Language parserLanguage;
    private DataContext collectedMetrics;

    public ParserOutput(Language parserLanguage, DataContext collectedMetrics) {
        this.parserLanguage = parserLanguage;
        this.collectedMetrics = collectedMetrics;
    }

    public DataContext getCollectedMetrics() {
        return collectedMetrics;
    }

    public void setCollectedMetrics(DataContext collectedMetrics) {
        this.collectedMetrics = collectedMetrics;
    }

    public Language getParserLanguage() {
        return parserLanguage;
    }

    public void setParserLanguage(Language parserLanguage) {
        this.parserLanguage = parserLanguage;
    }

    
}
