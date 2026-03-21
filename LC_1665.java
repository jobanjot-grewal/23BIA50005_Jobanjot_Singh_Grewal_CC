class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, Comparator.comparingInt((int[] task) -> task[1] - task[0]).reversed());

        int initialEnergy = 0;
        int currentEnergy = 0;
       
        for (int[] task : tasks) {
            int actual = task[0];
            int minimum = task[1];
           
            if (currentEnergy < minimum) {
                int startingEnergyNeeded = minimum - currentEnergy;
                initialEnergy += startingEnergyNeeded; 
                currentEnergy += startingEnergyNeeded; 
            }

            currentEnergy -= actual;
        }

        return initialEnergy;
    }
}
