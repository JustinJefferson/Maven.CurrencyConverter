package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Ringgit implements ConvertableCurrency {

    CurrencyType currency = CurrencyType.RINGGIT;

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / currency.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return currency;
    }
}
