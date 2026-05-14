package com.codurance.lsp;

public class FillingStation {

    public void refuel(PetrolVehicle vehicle) {
        vehicle.fillUpWithFuel();
    }

    public void charge(ElectricVehicle vehicle) {
        vehicle.chargeBattery();
    }
}
