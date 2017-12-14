
package com.holtechcreative.infusionsoftbase.infusionsoft.campaigns;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HistoricalContactCount {

    @SerializedName("24_hours")
    @Expose
    private Integer _24Hours;
    @SerializedName("30_days")
    @Expose
    private Integer _30Days;

    public Integer get24Hours() {
        return _24Hours;
    }

    public void set24Hours(Integer _24Hours) {
        this._24Hours = _24Hours;
    }

    public Integer get30Days() {
        return _30Days;
    }

    public void set30Days(Integer _30Days) {
        this._30Days = _30Days;
    }

}
