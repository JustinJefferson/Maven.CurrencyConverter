package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar implements ConvertableCurrency {

    CurrencyType currency = CurrencyType.US_DOLLAR;

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / currency.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return currency;
    }
}
