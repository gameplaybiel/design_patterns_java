package org.DesignsPatterns.Builder.builders;

import org.DesignsPatterns.Builder.components.CarType;
import org.DesignsPatterns.Builder.components.Engine;
import org.DesignsPatterns.Builder.components.Transmission;

public interface IBuilder {

    void setCarType(CarType carType);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}
