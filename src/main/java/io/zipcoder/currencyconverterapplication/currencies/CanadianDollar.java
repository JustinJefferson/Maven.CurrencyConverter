package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {

    CurrencyType currency = CurrencyType.CANADIAN_DOLLAR;

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / currency.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return currency;
    }
}
