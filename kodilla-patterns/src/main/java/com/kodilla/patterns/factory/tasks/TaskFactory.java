package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING_TASK = "DrivingTask";
    public static final String PAINTING_TASK = "PaintingTask";
    public static final String SHOPPING_TASK = "ShoppingTask";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Travel", "Warsaw", "Car");
            case PAINTING_TASK:
                return new PaintingTask("PaintingPicture", "B-W", "Buildings");
            case SHOPPING_TASK:
                return new ShoppingTask("Supermarket", "Bread", 2.50);
            default:
                return null;
        }

    }
}
