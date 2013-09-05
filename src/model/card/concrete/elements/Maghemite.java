package model.card.concrete.elements;

import model.card.Element;

/**
 * Created with IntelliJ IDEA.
 * User: uj643
 * Date: 02.09.13
 * Time: 18:40
 */
public class Maghemite extends Element {
    public Maghemite() {
        // TODO: реализовать магему
        super(getName(), new String[] {
                AstralEnergy.getName(),
                BatWing.getName(),
                Belladonna.getName(),
                BloodStone.getName(),
                CrystalAir.getName(),
                DragonTooth.getName(),
                EnergyThought.getName(),
                FernFlower.getName(),
                FieryLight.getName(),
                MandrakeRoot.getName(),
                Mushrumy.getName(),
                PhoenixFeather.getName(),
                QuintessenceWill.getName(),
                SnakeEyes.getName(),
                WavesEther.getName(),
                WellWater.getName(),
        });
    }

    public static String getName() {
        return "Maghemite";
    }
}
