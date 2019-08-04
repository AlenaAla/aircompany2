package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane {

    private ExperimentalTypes type;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, PlaneParameters planeParameter, ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, planeParameter.getMaxSpeed(), planeParameter.getMaxFlightDistance(), planeParameter.getMaxLoadCapacity());
        this.type = type;
        this.classificationLevel = classificationLevel;
    }


    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel) {
        this.classificationLevel = classificationLevel;
    }

    @Override
    public String toString() {
        return "ExperimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }


    public static class PlaneParameters {
        private int maxSpeed;
        private int maxFlightDistance;
        private int maxLoadCapacity;

        public PlaneParameters(int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
            this.maxSpeed = maxSpeed;
            this.maxFlightDistance = maxFlightDistance;
            this.maxLoadCapacity = maxLoadCapacity;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public int getMaxFlightDistance() {
            return maxFlightDistance;
        }

        public void setMaxFlightDistance(int maxFlightDistance) {
            this.maxFlightDistance = maxFlightDistance;
        }

        public int getMaxLoadCapacity() {
            return maxLoadCapacity;
        }

        public void setMaxLoadCapacity(int maxLoadCapacity) {
            this.maxLoadCapacity = maxLoadCapacity;
        }
    }

}

