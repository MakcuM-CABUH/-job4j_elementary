package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140rubleThen2Euro() {
        float inEu = 140;
        float expectedEu = 2;
        float outEu = Converter.rubleToEuro(inEu);
        float epsEu = 0.0001f;
        assertThat(outEu).isEqualTo(expectedEu, withPrecision(epsEu));
    }

    @Test
    void whenConvert180rubleThen3Dollar() {
        float inDoll = 180;
        float expectedDoll = 3;
        float outDoll = Converter.rubleToDollar(inDoll);
        float epsDoll = 0.0001f;
        assertThat(outDoll).isEqualTo(expectedDoll, withPrecision(epsDoll));
    }
}