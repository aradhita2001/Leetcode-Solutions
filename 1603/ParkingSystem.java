class ParkingSystem {

    int[] space;

    public ParkingSystem(int big, int medium, int small) {
        
        int[] temp = {big, medium, small};
        space = temp;
    }
    
    public boolean addCar(int carType) {
        
        if(space[--carType] != 0) {
            space[carType]--;
            return true;
        }

        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */